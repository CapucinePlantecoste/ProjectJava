//this class consolidates access to persistent data concerning the sellers  
package Model;

import Model.Seller;
import java.util.ArrayList;

/**
 *
 * @author thoma
 */
public interface SellerDAO {
    
    ArrayList<Seller> registerseller();
    //We create an arraylist of sellers get from the database
    void addseller(Seller a);
    //we add a seller to the database 
}
