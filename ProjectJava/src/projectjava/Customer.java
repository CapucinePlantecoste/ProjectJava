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
    
    public Customer(String n, String fn, String u, String p, int i)//constructor 
    {
        super(n,fn,u,p,i);//constructor of the Person class 
    }
    
}
