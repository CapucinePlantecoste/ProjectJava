// Project realised by Thomas Poulain and Capucine Plantecoste - TD5 - ING3

package projectjava;
import java.util.Scanner ; 

/**
 *
 * @author thoma
 */
public class ProjectJava {

    
    public static void main(String[] args) {
        // TODO code application logic here       
         
        App a= new App(); 
                
        new Jframe().setVisible(true); 
        
        a.register();        
        a.newcustomers();
        
    }
    
}
