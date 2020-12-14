//this class consolidates access to persistent data concerning the offers  
package Model;

import java.util.ArrayList;

/**
 * Interface OfferDAO that has all the functions to update the table offer
 *
 * @author thoma
 */
public interface OfferDAO {
//this class is an iterface, all the methods will be implemented in the OfferDAOImpl class

    /**
     * Method that once implemented can register all the offers from the
     * database
     *
     * @return an ArrayList of all the offers that are in the database
     */
    //We create an arraylist of offers that we get from the database
    ArrayList<Offer> registeroffer();

    //we add an offer to the database 
    /**
     * Method that once implemented adds an offer to the databqse
     *
     * @param a is the offer to add
     */
    void addoffer(Offer a);

    //method that enables to change the status of an offer to an accepted offer into the database
    /**
     * Method that once implemented can transmit to the database that an offer
     * has been accepted and that all the other offers made for this house have
     * been declined.
     *
     * @param a which is the offer that has been accepted
     * @param o which is the ArrayList of all the offers of the application
     */
    void acceptoffer(Offer a, ArrayList<Offer> o);

    //method that enables to change the status of an offer to a declined offer into the database
    /**
     * Method that once implemented transmits to the database that an offer has
     * been declined
     *
     * @param a is the offer that has been declined
     */
    void declineoffer(Offer a);

}
