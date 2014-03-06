package finalproj.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class ConnectionManager {

    private static Logger logger = Logger.getLogger(ConnectionManager.class.getName());
    private static ConnectionManager instance = null;
    private Connection conn = null;
    private static String USERNAME = "levelAnonymous";
    private static String PASSWORD = "levelAnonymous";
    private final String M_CONN_STRING = "jdbc:mysql://localhost/dth";
    private static int level_access = 4;
    private static boolean level_set = false;
    private static String Accessor = "Anonymous";

    public static String getAccessor() {

        return Accessor;
    }

    public static void setAccessor(String Alogin) {
        Accessor = Alogin;
    }

    public static String getUSERNAME() {
        return USERNAME;
    }

    public static void setUSERNAME(String USERNAME) {
        ConnectionManager.USERNAME = USERNAME;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public static void setPASSWORD(String PASSWORD) {
        ConnectionManager.PASSWORD = PASSWORD;
    }

    public static void setLevel(int x) {
        if (x < 0 || x > 4) {
            if (level_set == true) {
                JOptionPane.showMessageDialog(null, "Illegal access has been observed.");
            }
        } else {
            level_access = x;
        }
    }

    public static int getLevel() {
        return level_access;
    }

    public static ConnectionManager getInstance() {
        logger.info("Method call : getInstance");
        if (instance == null) {
            instance = new ConnectionManager();
        }
        return instance;
    }

    private boolean openConnection() {
        try {
            logger.info("Method call : openConnection");
            conn = DriverManager.getConnection(M_CONN_STRING, USERNAME, PASSWORD);
            return true;


        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            logger.fatal("Fatal error", ex);
            return false;
        }

    }

    public Connection getConnection() {
        logger.info("Method call : getConnection");
        if (conn == null) {
            if (openConnection()) {
                return conn;
            } else {
                return null;
            }
        }
        return conn;
    }

    public void close() {
        logger.info("Method call : close");
        try {
            conn.close();
            conn = null;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            logger.fatal("Fatal error", ex);

        }
    }
}