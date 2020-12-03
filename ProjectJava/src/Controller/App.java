//this class includes all functions necessary for proper operation. In this way, we will simply declare an app-like object in the main
package Controller;
import Model.Offer;//All the librairies included
import Model.Buyer;
import javax.swing.*;
import java.awt.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;
import java.util.Scanner;
import Model.BuyerDAOImpl;
import Model.Employee;
import Model.EmployeeDAOImpl;
import projectjava.First;
import Model.OfferDAOImpl;
import Model.Property;
import Model.PropertyDAOImpl;
import Model.Seller;
import Model.SellerDAOImpl;
import Model.Visit;
import Model.VisitDAOImpl;


/**
 *
 * @author thoma
 */
public class App {

    private ArrayList<Buyer> buyers;//ArrayList of all the buyers contained in the database
    private ArrayList<Seller> sellers;//ArrayList of all the sellers contained in the database
    private ArrayList<Employee> emp;//ArrayList of all the employees contained in the database
    private ArrayList<Property> pr;//ArrayList of all the  properties in the database
    private ArrayList<Visit> v;//ArrayList of all the visitis in the database
    private ArrayList<Offer>o;//ArrayList of all the offers in the databas
    private First f;//"First" Jframe that we set visible later 

    public App() {
        this.application();//Constructor of the class

    }

    public void register() {//function enabling the user to register 
        
            BuyerDAOImpl bdao=new BuyerDAOImpl();//creation of an object that enables the connection with buyers table 
            SellerDAOImpl sdao=new SellerDAOImpl();//creation of an object that enables the connection with sellers table
            PropertyDAOImpl pdao=new PropertyDAOImpl ();//creation of an object that enables the connection with property table
            EmployeeDAOImpl edao= new EmployeeDAOImpl();//creation of an object that enables the connection with employee table
            VisitDAOImpl vdao=new VisitDAOImpl();//creation of an object that enables the connection with viewings table
            OfferDAOImpl odao=new OfferDAOImpl();//creation of an object that enables the connection with offers table
            
            pr=pdao.registerproperty();//we get the values of the property table and we store them in an arraylist
            buyers=bdao.registerbuyer();//we get the values of the buyers table and we store them in an arraylist
            sellers=sdao.registerseller();//we get the values of the sellers table and we store them in an arraylist
            emp=edao.registeremployee();//we get the values of the employee table and we store them in an arraylist
            v=vdao.registervisit();//we get the values of the visit table and we store them in an arraylist
            o=odao.registeroffer();//we get the values of the offers table and we store them in an arraylist
    }  

    public ArrayList<Buyer> getbuyers() {//buyers getter which returns the arraylist of buyers of the application
        return buyers;
    }

    public ArrayList<Seller> getsellers() {//sellers getter which returns the arraylist of buyers of the application
        return sellers;
    }

    public ArrayList<Employee> getemp() {//employees getter which returns the arraylist of buyers of the application
        return emp;
    }

    public void afficher() {//display the first frame called first 
        f.setVisible(true);
    }

    public void application() { 

        this.register();// we call the first function, to register 
        f = new First(buyers, sellers, emp, pr,v,o);//creation of an object of the frame with its 6 arguments corresponding to arraylists of buyers
        //sellers, employees, properties, viewings, offers...

        f.setVisible(true);//we open the frame and let it visible 
        for(int i=0;i<v.size();++i)
        {
            System.out.println(v.get(i).getidbuyer());
        }
        
    }
}
