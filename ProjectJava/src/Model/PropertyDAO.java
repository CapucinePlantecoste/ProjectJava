//this class is the property dao class, that consolidates access to persistent data concerning the properties  
package Model;

import java.util.ArrayList;

/**
 * Interface PropertyDAO is used to connect the database to the program when we
 * want to update a data about Property
 *
 * @author thoma
 */
public interface PropertyDAO {

    //We create an arraylist of properties that we get from the database
    /**
     * Method that register all the properties from the database
     *
     * @return an ArrayList containing all those properties
     */
    ArrayList<Property> registerproperty();

    //method that enables us to add a property in the database 
    /**
     * Method that adds a property to the database
     *
     * @param a is the new Property
     * @param b is a number that allows the program to recognize if this new
     * property is a house or an apartment
     */
    void addproperty(Property a, int b);

    //method that enables to update the number of visits of a property into the database
    /**
     * Method that updates the times that a property has been visited when a
     * visit has been done in this property(once implemented)
     *
     * @param a is the Property considered
     */
    void updatetv(Property a);

    //method that enables us to set the boolean sold to true in the database if the offer of the corresponding property has been accepted 
    /**
     * Method that transmits to the database the information that an offer
     * hasbeen accepted for a special Property (once implemented)
     *
     * @param a is the Property sold
     */
    void offeraccepted(Property a);

    //method that enables us to delete a property in the database
    /**
     * Method that deletes a property from the database once implemented
     *
     * @param a is the Property that will be deleted
     */
    void deleteproperty(Property a);

    //method that enables us to update a property in the database by modyfing one or several attributes 
    /**
     * Method that transmits to the database all the new information concerning
     * the house
     *
     * @param a is the Property that is considered
     * @param b is a number to distinguish if the Property considered is an
     * apartment or a house
     */
    void update(Property a, int b);

}
