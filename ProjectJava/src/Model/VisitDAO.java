//this class consolidates access to persistent data concerning the viewings 
package Model;

import java.util.ArrayList;

/**
 * Interface VisitDAO used for the connection between the database and the program when it is about a visit
 * @author thoma
 */
public interface VisitDAO {
    //this class is an interface so all the methods will be implemented in the VisitDAOImpl class

    /**
     * Method that registers all the visits that are in the database once implemented
     * @return an ArrayList of all those visits
     */
    ArrayList<Visit> registervisit();

    //We create an arraylist of viewings get from the database

    /**
     * Method that is used to add a visit to the database once it is implemented
     * @param a is the new Visit 
     */
    void addvisit(Visit a);

    //we add a viewing to the database

    /**
     * Method to delete a visit from the database once the visit is done
     * @param a is the Visit to delete
     */
    void deleteviewing(Visit a);

    //method that deletes the viewiing from the database 
    /**
     * Method to update the id of the buyer who does the visit once implemented
     * @param a is the Visit considered
     */
    void updatebuyer(Visit a);
    //method that enables us to update the buyer of the viewing 

}
