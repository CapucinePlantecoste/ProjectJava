/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;
import java.sql.Timestamp;
/**
 *
 * @author thoma
 */
public class Visit {
    
    private int id;
   // private java.sql.Date d;
    private int idbuyer;
    private int idprop;
    private int idemp;
    
    public Visit(int i, int idb, int idp, int ide)
    {
        id=i;
        idbuyer=idb;
        idprop=idp;
        idemp=ide;
    }
    
    public int getidbuyer()
    {
        return idbuyer;
    }
    
    public int getidprop()
    {
        return idprop;
    }
    
    public int getidemp()
    {
        return idemp;
    }
    /*public java.sql.Date getdate()
    {
        return d;
    }*/
    
}
