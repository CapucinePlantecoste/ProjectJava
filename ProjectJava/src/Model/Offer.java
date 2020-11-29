/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author thoma
 */
public class Offer {
    
    private int id;
    private int idbuyer;
    private int idproperty;
    private double price;
    private boolean accepted;
    private boolean declined;
    
    public Offer(int i, int idb, int idp, double p, boolean a, boolean d)
    {
        id=i;
        idbuyer=idb;
        idproperty=idp;
        price=p;
        accepted=a;
        declined=d;
        
    }
    
    public int getidbuyer()
    {
        return idbuyer;
    }
    public void setidbuyer(int idb)
    {
        idbuyer=idb;
    }
    public int getidprop()
    {
        return idproperty;
    }
    public double getprice()
    {
        return price;
    }
    public boolean getaccepted()
    {
        return accepted;
    }
          
    public void setaccepted(boolean a)
    {
        accepted=a;
    }
    
    public int getid()
    {
        return id;
    }
    
    public boolean getdeclined()
    {
        return declined;
    }
    
    public void setdeclined(boolean d)
    {
        declined=d;
    }
            
}
