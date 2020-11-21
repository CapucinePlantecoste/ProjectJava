/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;

/**
 *
 * @author thoma
 */
public class Appartment extends Property {
    
    private boolean elevator;//attribute corresponding if there is an elevator or not 
    private int floornumber;
    private boolean parking;//attributes that were not in the property class
    
     public Appartment (int i, double p, String l, int nr, int nbr, int nbf, int tv, double s,boolean e, int fnb, boolean prkg)//Constructor
    {
        super(i,p,l,nr,nbr,nbf,tv,s);//constructor of property
        elevator=e;
        floornumber=fnb;
        parking=prkg;
        
        
    }
}
