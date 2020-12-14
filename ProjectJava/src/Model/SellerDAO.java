//this class consolidates access to persistent data concerning the sellers  
package Model;

import java.util.ArrayList;

/**
 * Interface SellerDAO that is used every time that it is needed to connect to
 * the database about a "Seller" thing
 *
 * @author thoma
 */
public interface SellerDAO {

    /**
     * Method that gets all the sellers that are in the database once
     * implemented
     *
     * @return an ArrayList of all the sellers in the database
     */
    ArrayList<Seller> registerseller();

    //We create an arraylist of sellers that we get from the database
    /**
     * Method that adds a seller in the database once implemented
     *
     * @param a is the new Seller
     */
    void addseller(Seller a);
    //we add a seller to the database 
}
