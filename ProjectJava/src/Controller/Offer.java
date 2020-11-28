/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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
    
    public Offer(int i, int idb, int idp, double p)
    {
        id=i;
        idbuyer=idb;
        idproperty=idp;
        price=p;
        accepted=false;
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
    
}
