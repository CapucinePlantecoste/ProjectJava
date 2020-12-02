/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Model.Offer;
import java.util.ArrayList;

/**
 *
 * @author thoma
 */
public interface OfferDAO {
    
    ArrayList<Offer> registeroffer();
    void addoffer(Offer a);
    void acceptoffer(Offer a, ArrayList<Offer> o);
    void declineoffer(Offer a);
}
