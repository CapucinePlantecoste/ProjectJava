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
    
    private double gardensurface;//Attributes that do not exist in the Property class
    private boolean swimmingpool;
    
    public House(int i,String d, double p, String l, int nr, int nbr, int nbf, int tv, double s,int ids,String t, double gs, boolean sp)//Constructor
    {
        super(i,d,p,l,nr,nbr,nbf,tv,s,ids,t);//constructor of the property class
        gardensurface=gs;
        swimmingpool=sp;
    }
    public double getgardensurface()
    {
        return gardensurface;
    }
    public boolean swimmingpool()
    {
        return swimmingpool;
    }
    
    
}
