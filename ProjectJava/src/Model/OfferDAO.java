//this class consolidates access to persistent data concerning the offers  
package Model;

import java.util.ArrayList;

/**
 *
 * @author thoma
 */
public interface OfferDAO {
//this class is an iterface, all the methods will be implemented in the OfferDAOImpl class

    //We create an arraylist of offers that we get from the database
    ArrayList<Offer> registeroffer();

    //we add an offer to the database 

    void addoffer(Offer a);

    //method that enables to change the status of an offer to an accepted offer into the database

    void acceptoffer(Offer a, ArrayList<Offer> o);

    //method that enables to change the status of an offer to a declined offer into the database

    void declineoffer(Offer a);

}
