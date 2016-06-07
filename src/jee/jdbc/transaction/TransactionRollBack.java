package jee.jdbc.transaction;

import jee.jdbc.BaseJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 描述:JDBC数据库事务回滚
 *
 * Created by bysocket on 16/6/6.
 */
public class TransactionRollBack extends BaseJDBC {

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        try {
            // 加载数据库驱动
            Class.forName(DRIVER);
            // 数据库连接
            conn = DriverManager.getConnection(URL,USER,PWD);

            // 关闭自动提交的事务机制
            conn.setAutoCommit(false);
            // 设置事务隔离级别 SERIALIZABLE
            conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);

            Statement stmt = conn.createStatement();
            int rows = stmt.executeUpdate("INSERT INTO city VALUES (3,'china',1,'cc')");
            rows = stmt.executeUpdate("UPDATE city set country = 'TAIWAN' WHERE id = 4");

            // 提交事务
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            // 回滚事务
            if (conn != null) {
                conn.rollback();
            }
        } finally {
            /** 关闭数据库连接 */
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
