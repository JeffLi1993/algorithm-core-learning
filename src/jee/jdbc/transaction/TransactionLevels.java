package jee.jdbc.transaction;

import jee.jdbc.BaseJDBC;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 描述:显示数据库事务支持情况
 *
 * Created by bysocket on 16/5/20.
 */
public class TransactionLevels extends BaseJDBC {

    public static void main(String[] args) {
        try {
            // 加载数据库驱动
            Class.forName(DRIVER);
            // 数据库连接
            Connection conn = DriverManager.getConnection(URL,USER,PWD);
            // 数据库元数据
            DatabaseMetaData metaData = conn.getMetaData();

            // 是否支持事务
            boolean isSupport = metaData.supportsTransactions();
            System.out.println(isSupport);
            // 是否支持的事务
            boolean isSupportLevel = metaData.supportsTransactionIsolationLevel(Connection.TRANSACTION_SERIALIZABLE);
            System.out.println(isSupportLevel);
            // 获取默认事务
            int defaultIsolation = metaData.getDefaultTransactionIsolation();
            System.out.println(defaultIsolation);

            /** 关闭数据库连接 */
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
