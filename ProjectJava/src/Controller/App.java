//this class includes all functions necessary for proper operation. In this way, we will simply declare an app-like object in the main
package Controller;

import Model.Offer;//All the librairies included
import Model.Buyer;
import java.util.ArrayList;
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

    private ArrayList<Buyer> buyers;
    //ArrayList of all the buyers contained in the database
    private ArrayList<Seller> sellers;
    //ArrayList of all the sellers contained in the database
    private ArrayList<Employee> emp;
    //ArrayList of all the employees contained in the database
    private ArrayList<Property> pr;
    //ArrayList of all the  properties in the database
    private ArrayList<Visit> v;
    //ArrayList of all the visitis in the database
    private ArrayList<Offer> o;
    //ArrayList of all the offers in the databas
    private First f;
    //"First" Jframe that we set visible later 

    public App() {
        this.application();
        //Constructor of the class

    }

    public void register() {
        //function enabling the user to register 

        BuyerDAOImpl bdao = new BuyerDAOImpl();
        //creation of an object BuyerDAOIMPl that will enable to get all the buyers from our buyer table
        SellerDAOImpl sdao = new SellerDAOImpl();
        //creation of an object SellerDAOIMPl that will enable to get all the sellers from our seller table
        PropertyDAOImpl pdao = new PropertyDAOImpl();
        //creation of an object PropertyDAOIMPl that will enable to get all the properties from our property table
        EmployeeDAOImpl edao = new EmployeeDAOImpl();
        //creation of an object EmployeeDAOIMPl that will enable to get all the employees from our employee table
        VisitDAOImpl vdao = new VisitDAOImpl();
        //creation of an object VisitDAOIMPl that will enable to get all the visits from our visit table
        OfferDAOImpl odao = new OfferDAOImpl();
        //creation of an object OfferDAOIMPl that will enable to get all the offers from our offer table

        pr = pdao.registerproperty();
        //we set our arraylist of Property according to those contained in the property table
        buyers = bdao.registerbuyer();
        //we set our arraylist of Buyer according to those contained in the buyer table
        sellers = sdao.registerseller();
        //we set our arraylist of Seller according to those contained in the seller table
        emp = edao.registeremployee();
        //we set our arraylist of Employee according to those contained in the employee table
        v = vdao.registervisit();
        //we set our arraylist of Visit according to those contained in the visit table
        o = odao.registeroffer();
        //we set our arraylist of Offer according to those contained in the offer table
    }

    public void application() {

        this.register();
        // we call the first function, to register all the datas from the database
        f = new First(buyers, sellers, emp, pr, v, o);
        //creation of an object of the first  frame of our app with its 6 arguments corresponding to arraylists of buyers, sellers, employees, properties, viewings, offers...

        f.setVisible(true);
        //we open the frame and let it visible 

    }
}
