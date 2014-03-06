
package finalproj.arbitraryprograms;

import java.util.UUID;
import org.apache.log4j.Logger;

public class Passwordgenerator {

    private static Logger logger = Logger.getLogger(Passwordgenerator.class.getName());

    public static String returnPassword() {
        
        logger.info("Method call : returnPassword");
        String s = UUID.randomUUID().toString();
        char[] uuidChars = s.toCharArray();
        String newUUID = "";
        for (int i = 0; i < 8; i++) {
            newUUID += uuidChars[i];
        }

        return (newUUID.toString());
    }

}
