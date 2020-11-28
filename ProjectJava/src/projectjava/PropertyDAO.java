/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;

import Model.Property;
import java.util.ArrayList;

/**
 *
 * @author thoma
 */
public interface PropertyDAO {
    
    ArrayList<Property> registerproperty();
    void addproperty(Property a, int b);
    
}
