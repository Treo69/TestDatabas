
package testdatabas;

import javax.swing.JOptionPane;
import javax.swing.JTextField;




public class Validering {
    
    public static boolean faltHarVarde(JTextField rutaAttKolla) {
        
        boolean resultat = true;
        
        if(rutaAttKolla.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Namnrutan är tom!");
            resultat = false;
        }
        
        return resultat;
    }
    
}
