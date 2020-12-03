//this class consolidates access to persistent data concerning the buyers  
package Model;

import Model.Buyer;
import java.util.ArrayList;

/**
 *
 * @author thoma
 */
public interface BuyerDAO {
//this class is an iterface, all the methods will be implemented in the BuyerDAOImpl class

    ArrayList<Buyer> registerbuyer();

    //We create an arraylist of buyers get from the database  

    void addbuyer(Buyer a);
    //we add a buyer to the database

}
