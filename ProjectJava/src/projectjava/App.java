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
    private ArrayList<Property> pr;//ArrayList of all the buyers properties in the database
    private static final String USERNAME = "root";//Username of MySql database
    private static final String PASSWORD = "Manager26069700";//Password of MySQL database
    private static final String url = "jdbc:mysql://localhost:3306/ptest?autoReconnect=true&useSSL=false";
    private First f;

    public App() {
        this.application();//Constructor of the class

    }

    public void register() {//function enabling the user to register 
        Connection conn = null;
        buyers = new ArrayList<Buyer>();//ArrayList of all the buyers contained in the database
        emp = new ArrayList<Employee>();//ArrayList of all the employees contained in the database
        sellers = new ArrayList<Seller>();//ArrayList of all the sellers contained in the database
        pr = new ArrayList<Property>();//ArrayList of all the properties contained in the database

        try {

            conn = DriverManager.getConnection(url, USERNAME, PASSWORD);//Connect to the database
            Statement stmt = conn.createStatement();

            String sqtStat1 = "SELECT * FROM employee";//We get the different values of the different columns of the table employee
            ResultSet result = stmt.executeQuery(sqtStat1);//we execute the query 
            while (result.next()) {

                String a = result.getString("name");//First column of the table 
                String b = result.getString("familyname");
                String c = result.getString("username");
                String d = result.getString("password");
               int e=result.getInt("idemployee");
                
                emp.add(new Employee(e,a, b, c, d));//we create an employee object with the values get ahead

            }

            String sqtStat2 = "SELECT * From buyer";//We get the different values of the different columns of the table buyer
            ResultSet result2 = stmt.executeQuery(sqtStat2);//we execute the query 
            while (result2.next()) {

                String a = result2.getString("name");//First column of the table 
                String b = result2.getString("familyname");
                String c = result2.getString("username");
                String d = result2.getString("password");
                int e=result2.getInt("idbuyer");
                

                buyers.add(new Buyer(e,a, b, c, d));

            }

            String sqtStat3 = "SELECT * From seller";//We get the different values of the different columns of the table seller
            ResultSet result3 = stmt.executeQuery(sqtStat3);//we execute the query 
            while (result3.next()) {
                String a = result3.getString("name");//First column of the table 
                String b = result3.getString("familyname");
                String c = result3.getString("username");
                String d = result3.getString("password");
                int e=result3.getInt("idseller");
                
                sellers.add(new Seller(e,a, b, c, d));

            }
            String sqtStat4 = "SELECT * From property";//We get the different values of the different columns of the table house
            ResultSet result4 = stmt.executeQuery(sqtStat4);//we execute the query
            while (result4.next()) {
                if(result4.getString("type").equals("House"))
                {
                int a = result4.getInt("id");//First column of the table 
                String d=result4.getString("description");
                double p = result4.getDouble("price");
                String l = result4.getString("location");
                int nr = result4.getInt("numberrooms");
                int nbr = result4.getInt("numberbedrooms");
                int nf = result4.getInt("numberfloors");
                int tv = result4.getInt(("timevisited"));
                double s = result4.getDouble("surface");
                double gs = result4.getDouble("gardensurface");
                boolean sp = result4.getBoolean("swimmingpool");
                int ids=result4.getInt("idseller");
                pr.add(new House(a,d, p, l, nr, nbr, nf, tv, s,ids,"House", gs, sp));
                }
                else
                {
                     int a = result4.getInt("id");//First column of the table 
                     String d=result4.getString("description");
                double p = result4.getDouble("price");
                String l = result4.getString("location");
                int nr = result4.getInt("numberrooms");
                int nbr = result4.getInt("numberbedrooms");
                int nf = result4.getInt("numberfloors");
                int tv = result4.getInt(("timevisited"));
                double s = result4.getDouble("surface");
                boolean elv = result4.getBoolean("elevator");
                int fn = result4.getInt("floornumber");
                boolean prkg = result4.getBoolean("parking");
                int ids=result4.getInt("idseller");
                pr.add(new Appartment(a,d, p, l, nr, nbr, nf, tv, s,ids,"Apartment", elv, fn, prkg));

                }

            }
            

        } catch (SQLException e) {//Possible MY SQL exception 
            System.err.println(e);
        }

    }

    public void loginb() {

        //Pour tester on saisit à la mian password et username
        //On rentre notre username et notre mot de passe
        //for(int i=0;i<buyers.size();++i)
       /* {
         if (buyers.get(i).getusername().equals(username)&&buyers.get(i).getpassword().equals(password))
         {
         return buyers.get(i);
         }
            
         }
        
         return null;*/
    }
    /*public Buyer testloginb()
     {
     if(this.loginb()==null)
     {
     do
     {
     System.out.println("Error. Your password and username don't match");
     System.out.println("Please try again");
           
           
     }while( this.loginb()==null);// ou si on clique pas  sur bouton entree
     // ! nom boutton is selected
       
     }

       
     return this.loginb();
     }*/

    /*
     public Seller logins()
     {
     String username=this.writeusername();
     String password=this.writepassword();
     //Pour tester on saisit à la mian password et username
     //On rentre notre username et notre mot de passe
     for(int i=0;i<sellers.size();++i)
     {
     if (sellers.get(i).getusername().equals(username)&&sellers.get(i).getpassword().equals(password))
     {
     return sellers.get(i);
     }
            
     }
        
     return null;
     }
     public Seller testlogins()
     {
     if(this.logins()==null)
     {
     do
     {
     System.out.println("Error. Your password and username don't match");
     System.out.println("Please try again");
           
           
     }while( this.logins()==null);// ou si on clique pas  sur bouton entree
     // ! nom boutton is selected
       
     }

       
     return this.logins();
     }
    
     public Employee logine()
     {
     String username=this.writeusername();
     String password=this.writepassword();
     //Pour tester on saisit à la mian password et username
     //On rentre notre username et notre mot de passe
     for(int i=0;i<emp.size();++i)
     {
     if (emp.get(i).getusername().equals(username)&&emp.get(i).getpassword().equals(password))
     {
     return emp.get(i);
     }
            
     }
        
     return null;
     }
    
     public Employee testlogine()
     {
     if(this.logine()==null)
     {
     do
     {
     System.out.println("Error. Your password and username don't match");
     System.out.println("Please try again");
           
           
     }while( this.logine()==null);// ou si on clique pas  sur bouton entree
     // ! nom boutton is selected
       
     }

       
     return this.logine();
     }
     public void mainmenu()
     {
        
     //SI l'utilisateur clique sur le bouton "Connexion buyer"
      
     //S'il a clique sur entree if(this.testloginb()==null)
     //afficher le menu princiapl
     // else
     //afficher.this.testloginb()
        
     // Si l'utilisateur clique sur le bouton "Connexion seller"
     //S'il a clique sur entree if(this.testlogins()==null)
     //afficher le menu princiapl
     // else
     //afficher.this.testlogins()
        
     //S'il a clique sur entree if(this.testlogine()==null)
     //afficher le menu princiapl
     // else
     //afficher.this.testlogine()
        
     //S'il a clique sur le bouton You don't have an account et you want to create one
     //creer an account
        
        
       
        
        
     }*/
    // This fnction is used to ensure a customer can't have the same username as an already existing seller or buyer
    public int checkusername(String a) {
        int nb = 0;
        for (int i = 0; i < sellers.size(); ++i)//we go through our sellers username list
        {
            if (sellers.get(i).getusername().equals(a))//we check if one of them is equal to the new one
            {
                nb++;//if nb = 1, the username already exists 
            }
        }
        for (int j = 0; j < buyers.size(); ++j)//we go through our buyers username list
        {
            if (buyers.get(j).getusername().equals(a))//we check if one of them is equal to the new one
            {
                nb++;//if nb = 1, the username already exists 
            }
        }
        return nb;//We will use this value later and make sure it is equal to zero
    }

    /* public void newcustomerb() {
        //affichage du choix entre etre un nouveau buyer ou ou nouveau seller
        //SI on clique sur le bouton etre un nouveau buyer
        Scanner a = new Scanner(System.in);
        System.out.println("Name :");//For a new user, we ask for the name
        String n = a.next();
        System.out.println("Family name :");// for the family name
        String fn = a.next();

        System.out.println(" Username : ");//for the username 
        String u = a.next();

        if (this.checkusername(u) != 0) {//we use the previous function to make sure the username is not already taken 
            do {

                System.out.println(" This username already exists, choose another one");
                System.out.println("Username");//chose an other username
                u = a.next();

            } while (this.checkusername(u) != 0);
        }
        System.out.println(" Password");//ask for the password 
        String p = a.next();
        int id;
        id = buyers.get(buyers.size() - 1).getid() + 1;//we define the id of the buyer  
        buyers.add(new Buyer(n, fn, u, p, id));//we add a new buyer in the array list of buyers 

        Connection conn = null;
        try {

            conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
            Statement stmt = conn.createStatement();

            conn.setAutoCommit(false);
            try {//we also put the new customer into our database 

                stmt.executeUpdate("INSERT INTO buyer " + " (id, name, familyname, username, password) " + "VALUES" + "('" + id + "','" + n + "','" + fn + "','" + u + "','" + p + "' )");
                conn.commit();
            } catch (SQLException f) {//possible MySql exception
                System.err.println(f);
            }
        } catch (SQLException e) {//Possible MySql connection exception
            System.err.println(e);
        }

    }*/

    /*public void newcustomers() {//function that creates a new seller
        Scanner a = new Scanner(System.in);
        System.out.println("Name :");//For a new user, we ask for the name
        String n = a.next();
        System.out.println("Family name :");// for the family name
        String fn = a.next();

        System.out.println(" Username : ");// for the username
        String u = a.next();

        if (this.checkusername(u) != 0) {//we use the previous function to make sure the username is not already taken
            do {

                System.out.println(" This username already exists, choose another one");//chose an other username
                System.out.println("Username");
                u = a.next();

            } while (this.checkusername(u) != 0);
        }
        System.out.println(" Password");//ask for the password 
        String p = a.next();
        int id;
        id = sellers.get(sellers.size() - 1).getid() + 1;//we define the id of the buyer  

        sellers.add(new Seller(n, fn, u, p, id));//we add a new buyer in the array list of buyers 
        Connection conn = null;
        try {

            conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
            Statement stmt = conn.createStatement();

            conn.setAutoCommit(false);
            try {//we also put the new customer into our database 

                stmt.executeUpdate("INSERT INTO seller " + " (id, name, familyname, username, password) " + "VALUES" + "('" + id + "','" + n + "','" + fn + "','" + u + "','" + p + "' )");
                conn.commit();
            } catch (SQLException f) {//possible MySql exception
                System.err.println(f);
            }
        } catch (SQLException e) {//possible MySql connection exception
            System.err.println(e);
        }

    }*/

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
        f = new First(buyers, sellers, emp, pr,url, USERNAME,PASSWORD);//we create an object of the frame with its 3 arguments 

        f.setVisible(true);//we open the frame and let it visible 
       
        

        // f.getcjf().compare(this.getbuyers(), this.getsellers(), this.getemp());
    }
}
