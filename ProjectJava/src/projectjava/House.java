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
public class House extends Property {
    
    private double gardensurface;
    private boolean swimmingpool;
    
    public House(int i, double p, String l, int nr, int nbr, int nbf, int tv, double s, double gs, boolean sp)
    {
        super(i,p,l,nr,nbr,nbf,tv,s);
        gardensurface=gs;
        swimmingpool=sp;
    }
    
    
}
