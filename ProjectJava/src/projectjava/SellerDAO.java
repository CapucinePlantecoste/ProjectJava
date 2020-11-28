/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;

import Model.Seller;
import java.util.ArrayList;

/**
 *
 * @author thoma
 */
public interface SellerDAO {
    
    ArrayList<Seller> registerseller();
    void addseller(Seller a);
}
