/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;

/**
 *
 * @author CAP
 */
public abstract class Customer extends Person{//Customer class represents both byuers and sellers 
    
    public Customer(String n, String fn, String u, String p)//constructor 
    {
        super(n,fn,u,p);//constructor of the Person class 
    }
    
}
