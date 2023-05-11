package Utility;

import javax.swing.JOptionPane;

/**
 *
 * @author Joshua et valence
 */
public class NosExceptions extends Exception{

    public NosExceptions(String message) {
        super(message);
        JOptionPane.showMessageDialog(null, message, "Informations", JOptionPane.PLAIN_MESSAGE);
    }
    
    public NosExceptions(Throwable cause) {
        super(cause);
    }
    
    public NosExceptions(String message, Throwable cause) {
        super(message, cause);
    }
    
    
}
