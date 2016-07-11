package jee.jdbc.transaction;

import jee.jdbc.BaseJDBC;

import java.sql.*;

/**
 * 描述:JDBC数据库事务回滚,回滚到特定的保存点
 *
 * Created by bysocket on 16/6/6.
 */
public class TransactionRollBack2 extends BaseJDBC {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Savepoint svpt = null;
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
            // 设置事务保存点
            svpt = conn.setSavepoint();
            rows = stmt.executeUpdate("UPDATE city set country = 'TAIWAN' WHERE id = 4");

            // 提交事务
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            // 回滚事务
            if (conn != null) {
                conn.rollback(svpt);
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
