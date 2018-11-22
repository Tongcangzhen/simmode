package DB;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.ResourceBundle;

public  class DbUtil {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
//    static  String DB_URL ="jdbc:mysql://localhost/jinghang?useSSL=false&serverTimezone=GMT%2B8";
//    static  String USER = "localuser";
//    static  String PASS = "toch1997za1.";
    static  String DB_URL =null;
    static  String USER = null;
    static  String PASS = null;

    private static void init() {
        if (DB_URL == null || USER == null || PASS == null) {
            Properties props = new Properties();
            File f = null;
            String path = System.getProperty("user.dir") +f.separator+"config.properties";
           // ResourceBundle resourceBundle = ResourceBundle.getBundle("config");
            try {
                props.load(new FileInputStream(path));
            } catch (IOException e) {
                e.printStackTrace();
            }
            DB_URL = props.getProperty("DbUrl");
            USER = props.getProperty("DbUser");
            PASS = props.getProperty("DbPass");
        }
    }
    public static Connection getCon() {
        init();
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
