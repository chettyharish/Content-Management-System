
package finalproj.arbitraryprograms;

import java.util.regex.Pattern;
import org.apache.log4j.Logger;


public class TestPattern {

    private static Logger logger = Logger.getLogger(TestPattern.class.getName());

    public static boolean textpattern(String s) {
        logger.info("Method call : textpattern");

        Pattern textpattern = Pattern.compile("^[a-zA-Z0-9]*$");
        if (textpattern.matcher(s).matches()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean numberpattern(String s) {
        logger.info("Method call : numberpattern");

        Pattern numberpattern = Pattern.compile(".*\\D.*");
        if (!numberpattern.matcher(s).matches()) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean numberpatternlevel(String s) {

        logger.info("Method call : numberpatternlevel");
        Pattern numberpattern = Pattern.compile(".*\\D.*");
        if (!numberpattern.matcher(s).matches()) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean emailpattern(String s) {
        logger.info("Method call : emailpattern");
        Pattern emailpattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        if (emailpattern.matcher(s).matches()) {
            return true;
        } else {

            return false;
        }

    }

    public static boolean spacetextpattern(String s) {
        logger.info("Method call : spacetextpattern");
        Pattern textpattern = Pattern.compile("[A-Za-z0-9 _.]*");
        if (textpattern.matcher(s).matches()) {
            return true;
        } else {

            return false;
        }


    }

    public static boolean ccverifierAmerican(String s) {
        logger.info("Method call : ccverifierAmerican");

        Pattern americanpattern = Pattern.compile("^3[47][0-9]{13}$");
        if (americanpattern.matcher(s).matches()) {
            return true;
        } else {
            return false;

        }
    }

    public static boolean ccverifierMastercard(String s) {

        logger.info("Method call : ccverifierMastercard");
        Pattern mastercardpattern = Pattern.compile("^5[1-5][0-9]{14}$");
        if (mastercardpattern.matcher(s).matches()) {
            return true;
        } else {
            return false;

        }
    }

    public static boolean ccverifierVisa(String s) {
        logger.info("Method call : ccverifierVisa");
        Pattern visapattern = Pattern.compile("^4[0-9]{12}(?:[0-9]{3})?$");
        if (visapattern.matcher(s).matches()) {
            return true;
        } else {
            return false;

        }
    }

    public static boolean booleanstring(String s) {
        logger.info("Method call : booleanstring");
        Pattern booleanstring = Pattern.compile("-?\\d+(\\.\\d*)?");
        if (booleanstring.matcher(s).matches()) {
            return true;
        } else {
            return false;

        }
    }
}
