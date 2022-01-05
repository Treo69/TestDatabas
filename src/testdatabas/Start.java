
package testdatabas;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Josef
 */
public class Start {

    private static InfDB idb;
    
    public static void main(String[] args)
    {
        
          try {
        idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        }
        
        catch(InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande " + ettUndantag.getMessage());
        }
        
        
        new Meny(idb).setVisible(true);
    }
         
    
}
