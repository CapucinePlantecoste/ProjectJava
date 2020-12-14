//this class consolidates access to persistent data concerning the buyers  
package Model;

import java.util.ArrayList;

/**
 * Interface BuyerDAO which has the functions to register the buyers and add
 * one.
 *
 * @author thoma
 */
public interface BuyerDAO {
//this class is an iterface, all the methods will be implemented in the BuyerDAOImpl class

    /**
     * Method to register all the buyers from the database (once it is
     * implemented)
     *
     * @return the list of buyers loaded from the database
     */
    ArrayList<Buyer> registerbuyer();

    /**
     * This functions adds a buyer (once it is implemented).
     *
     * @param a which is a buyer
     */
    //We create an arraylist of Buyer that we get from the database  
    void addbuyer(Buyer a);
    //we add a buyer to the database

}
