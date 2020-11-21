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
public class Employee extends Person {//Employee is a derived class of Person
    
    public Employee(String n, String fn, String u, String p, int i)//COnstructor 
    {
        super(n,fn,u,p,i);//constructor of the Person class
    }
    
    @Override
    public void display()
    {
        
    }
    
}
