package finalproj.db;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

public class AESrunner {

    private static Logger logger = Logger.getLogger(AESrunner.class.getName());
    private static final String ALGORITHM = "AES";
    private static final byte[] keyValue = "2H5a1r5i6s3h8C1h".getBytes();

    public static String AESencrypt(String valueToEnc) {
        logger.info("Method call : AESencypt");
        try {
            Key key = new SecretKeySpec(keyValue, ALGORITHM);
            Cipher c = Cipher.getInstance(ALGORITHM);
            c.init(Cipher.ENCRYPT_MODE, key);
            byte[] encValue = c.doFinal(valueToEnc.getBytes());
            String encryptedValue = Base64.encodeBase64String(encValue);
            return encryptedValue;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Exception Generated: " + ex.getMessage());
            logger.fatal("Fatal error", ex);
            return null;
        }
    }

    public static String AESdecrypt(String encryptedValue) {
        logger.info("Method call : AESdecrypt");
        try {
            Key key = new SecretKeySpec(keyValue, ALGORITHM);
            Cipher c = Cipher.getInstance(ALGORITHM);
            c.init(Cipher.DECRYPT_MODE, key);
            byte[] decordedValue = Base64.decodeBase64(encryptedValue);
            byte[] decValue = c.doFinal(decordedValue);
            String decryptedValue = new String(decValue);
            return decryptedValue;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Exception Generated: " + ex.getMessage());
            logger.fatal("Fatal error", ex);
            return null;
        }
    }
}
