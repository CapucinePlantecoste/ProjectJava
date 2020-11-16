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
public abstract class Property {
    
    private int id;
    private double price;
    private String location;
    private int numberrooms;
    private int numberbedrooms;
    private int timevisited;
    private int numberfloors;
    private double surface;
    
    public Property(int i, double p, String l, int nr, int nbr, int nbf, int tv, double s)
    {
        id=i;
        price=p;
        location=l;
        numberrooms=nr;
        numberbedrooms=nbr;
        numberfloors=nbf;
        timevisited=tv;
        surface=s;
        
    }
    
}
