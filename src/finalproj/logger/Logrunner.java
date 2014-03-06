package finalproj.logger;

import java.io.File;
import java.net.URISyntaxException;
import java.security.CodeSource;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logrunner extends FileAppender {

    public static Logger logger;

    public static void Loginitialize() {
        try {


            CodeSource codeSource = Logrunner.class.getProtectionDomain().getCodeSource();
            File jarFile = new File(codeSource.getLocation().toURI().getPath());
            String jarDir = jarFile.getParentFile().getPath();


            String savePath1 = jarDir + "\\logs\\all\\" + Logrunner.getCurrentDatepath() + ".html";
            String savePath2 = jarDir + "\\logs\\main\\" + Logrunner.getCurrentDatepath() + ".html";


            System.setProperty("logfileall.name", savePath1);
            System.setProperty("logfilemain.name", savePath2);
            PropertyConfigurator.configure("log4j.properties");
            logger = Logger.getLogger(Logrunner.class.getName());
            logger.info("Logger Initialized");
        } catch (URISyntaxException ex) {
            logger.fatal("Fatal error", ex);
        }


    }

    public static String getCurrentDatepath() {

        Date date = new Date();
        String DATE_FORMAT = "yyyy-MM-dd-HH-mm-ss";
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        return (sdf.format(date));

    }
}
