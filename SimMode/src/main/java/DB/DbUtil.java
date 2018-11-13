package DB;

import java.sql.*;

public  class DbUtil {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/jinghang?useSSL=false";
    static final String USER = "localuser";
    static final String PASS = "toch1997za1.";
    public static Connection getCon() {
        Connection conn=null;
        try {
            Class.forName(JDBC_DRIVER); //classLoader,加载对应驱动
            conn = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
