//this class is the property dao class, that consolidates access to persistent data concerning the properties  
package Model;


import java.util.ArrayList;

/**
 *
 * @author thoma
 */
public interface PropertyDAO {
    
    //We create an arraylist of properties that we get from the database
    ArrayList<Property> registerproperty();
    //method that enables us to add a property in the database 
    void addproperty(Property a, int b);
   //method that enables to update the number of visits of a property into the database
    void updatetv(Property a);
    //method that enables us to set the boolean sold to true in the database if the offer of the corresponding property has been accepted 
    void offeraccepted(Property a);
     //method that enables us to delete a property in the database
    void deleteproperty(Property a);
     //method that enables us to update a property in the database by modyfing one or several attributes 
    void update(Property a, int b);
 
    
    
}
