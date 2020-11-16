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
    
    private boolean elevator;
    private int floornumber;
    private boolean parking;
    
     public Appartment (int i, double p, String l, int nr, int nbr, int nbf, int tv, double s,boolean e, int fnb, boolean prkg)
    {
        super(i,p,l,nr,nbr,nbf,tv,s);
        elevator=e;
        floornumber=fnb;
        parking=prkg;
        
        
    }
}
