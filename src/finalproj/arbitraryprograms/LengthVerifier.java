
package finalproj.arbitraryprograms;

import org.apache.log4j.Logger;


public class LengthVerifier {

    private static Logger logger = Logger.getLogger(LengthVerifier.class.getName());

    public static boolean lengthString(String s) {

        logger.info("Method call : lengthString");
        if (s.length() <= 40) {
            return true;

        } else {
            return false;
        }
    }

    public static boolean lengthInteger(String s) {
        logger.info("Method call : lengthInteger");
        if (s.length() <= 11) {
            return true;

        } else {
            return false;
        }
    }
}
