package finalproj.db;

import finalproj.arbitraryprograms.Dategenerator;
import java.io.File;
import java.security.CodeSource;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class DBmanager {

    private static Logger logger = Logger.getLogger(DBmanager.class.getName());

    public static void Backupdbtosql() {
        logger.info("Method call : Backupdbtosql");
        try {

            /*NOTE: Getting path to the Jar file being executed*/
            CodeSource codeSource = DBmanager.class.getProtectionDomain().getCodeSource();
            File jarFile = new File(codeSource.getLocation().toURI().getPath());
            String jarDir = jarFile.getParentFile().getPath();


            /*NOTE: Creating Database Constraints*/
            String dbName = "dth";
            String dbUser = "root";
            String dbPass = "root";

            /*NOTE: Creating Path Constraints for folder saving*/
            String folderPath = jarDir + "\\backup";

            /*NOTE: Creating Folder if it does not exist*/
            File f1 = new File(folderPath);
            f1.mkdir();

            /*NOTE: Creating Path Constraints for backup saving*/
            String username = ConnectionManager.getLevel() + "_" + ConnectionManager.getAccessor() + "_" + Dategenerator.getCurrentDatepath();
            String savePath = "\"" + jarDir + "\\backup\\" + username + ".sql\"";

            /*NOTE: Used to create a DOS command*/
            String executeCmd = "mysqldump -u" + dbUser + " -p" + dbPass + " --database " + dbName + " -r " + savePath;

            /*NOTE: Executing the command here*/
            Process runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            int processComplete = runtimeProcess.waitFor();

            if (processComplete == 0) {
                /*NOTE: Blank Statement*/
            } else {
                /*NOTE: Blank Statement*/
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error at Backuprestore" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
    }

    public static void Restoredbfromsql(String s) {
        logger.info("Method call : Restoredbfromsql");
        try {
            /*NOTE: Getting path to the Jar file being executed*/
            CodeSource codeSource = DBmanager.class.getProtectionDomain().getCodeSource();
            File jarFile = new File(codeSource.getLocation().toURI().getPath());
            String jarDir = jarFile.getParentFile().getPath();

            /*NOTE: Creating Database Constraints*/
            String dbName = "dth";
            String dbUser = "root";
            String dbPass = "root";

            /*NOTE: Creating Path Constraints for restoring*/
            String restorePath = jarDir + "\\backup" + "\\" + s;

            /*NOTE: Used to create a DOS command*/
            String[] executeCmd = new String[]{"mysql", dbName, "-u" + dbUser, "-p" + dbPass, "-e", " source " + restorePath};

            Process runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            int processComplete = runtimeProcess.waitFor();


            if (processComplete == 0) {
                JOptionPane.showMessageDialog(null, "Successfully restored from SQL : " + s);
            } else {
                JOptionPane.showMessageDialog(null, "Error at restoring");
            }


        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error at Restoredbfromsql" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }

    }
}