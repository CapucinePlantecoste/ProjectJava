//this class is the property dao class, that consolidates access to persistent data concerning the properties  
package Model;

import Model.Property;
import java.util.ArrayList;

/**
 *
 * @author thoma
 */
public interface PropertyDAO {
    
    ArrayList<Property> registerproperty();
    //We create an arraylist of properties get from the database
    void addproperty(Property a, int b);
    //method that enables us to add a property in the database 
    void updatetv(Property a);
    //method that enables to update the number of visits of a property into the database
    void offeraccepted(Property a);
    //method that enables us to set the boolean sold to true in the database if the offer of the corresponding property has been accepted 
    void deleteproperty(Property a);
    //method that enables us to delete a property in the database
    void update(Property a, int b);
    //method that enables us to update a property in the database by modyfing one or several attributes 
    
    
}
