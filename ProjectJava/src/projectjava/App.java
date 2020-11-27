/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;//All the librairies included

import javax.swing.*;
import java.awt.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author thoma
 */
public class App {

    private ArrayList<Buyer> buyers;//ArrayList of all the buyers contained in the database
    private ArrayList<Seller> sellers;//ArrayList of all the sellers contained in the database
    private ArrayList<Employee> emp;//ArrayList of all the employees contained in the database
    private ArrayList<Property> pr;//ArrayList of all the  properties in the database
    private ArrayList<Visit> v;//ArrayList of all the visitis in the databas
    private ArrayList<Offer>o;
    private First f;

    public App() {
        this.application();//Constructor of the class

    }

    public void register() {//function enabling the user to register 
      

      

            
            BuyerDAOImpl bdao=new BuyerDAOImpl();
            SellerDAOImpl sdao=new SellerDAOImpl();
            PropertyDAOImpl pdao=new PropertyDAOImpl ();
            EmployeeDAOImpl edao= new EmployeeDAOImpl();
            VisitDAOImpl vdao=new VisitDAOImpl();
            OfferDAOImpl odao=new OfferDAOImpl();
            
            pr=pdao.registerproperty();
            buyers=bdao.registerbuyer();
            sellers=sdao.registerseller();
            emp=edao.registeremployee();
            v=vdao.registervisit();
            o=odao.registeroffer();
            
           

            

        

    }

  

    public ArrayList<Buyer> getbuyers() {//buyers getter 
        return buyers;
    }

    public ArrayList<Seller> getsellers() {//sellers getter
        return sellers;
    }

    public ArrayList<Employee> getemp() {//employee getter
        return emp;
    }

    public void afficher() {//display the frame 
        f.setVisible(true);
        //comparer directement ici
    }

    public void application() { 

        this.register();//We call the first function, to regoster 
        f = new First(buyers, sellers, emp, pr,v,o);//we create an object of the frame with its 3 arguments 

        f.setVisible(true);//we open the frame and let it visible 
       
            
      
       
        

        // f.getcjf().compare(this.getbuyers(), this.getsellers(), this.getemp());
    }
}
