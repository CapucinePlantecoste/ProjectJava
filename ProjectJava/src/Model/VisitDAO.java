//this class consolidates access to persistent data concerning the viewings 
package Model;
import java.util.ArrayList;

/**
 *
 * @author thoma
 */
public interface VisitDAO {
    //this class is an interface so all the methods will be implemented in the VisitDAOImpl class
    
    ArrayList<Visit> registervisit();
    //We create an arraylist of viewings get from the database
    void addvisit(Visit a);
    //we add a viewing to the database
    void deleteviewing(Visit a);
    //method that deletes the viewiing from the database 
    void updatebuyer(Visit a);
    //method that enables us to update the buyer of the viewing 
    
    
}
