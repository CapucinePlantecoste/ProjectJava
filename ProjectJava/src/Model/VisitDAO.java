/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Model.Visit;
import java.util.ArrayList;

/**
 *
 * @author thoma
 */
public interface VisitDAO {
    
    ArrayList<Visit> registervisit();
    void addvisit(Visit a);
    void deleteviewing(Visit a);
    void updatebuyer(Visit a);
    
    
}
