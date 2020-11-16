/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava;

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

    private ArrayList<Buyer> buyers=new ArrayList<Buyer>();
    private ArrayList<Seller> sellers=new ArrayList<Seller>();
    private ArrayList<Employee> emp=new ArrayList<Employee>();
    private ArrayList<Property> pr=new ArrayList<Property>();
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Manager26069700";
    private static final String url = "jdbc:mysql://localhost:3306/ptest?autoReconnect=true&useSSL=false";
    
    public App()
    {
        this.register();
    }

    public void register() {
        Connection conn = null;
        try {

            conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
            Statement stmt = conn.createStatement();

            String sqtStat1 = "SELECT * FROM employee";
            ResultSet result = stmt.executeQuery(sqtStat1);
            while (result.next()) {
                String a = result.getString("name");
                String b = result.getString("familyname");
                String c = result.getString("username");
                String d = result.getString("password");
                int e = result.getInt("id");
                emp.add(new Employee(a, b, c, d, e));

            }

            String sqtStat2 = "SELECT * From buyer";
            ResultSet result2 = stmt.executeQuery(sqtStat2);
            while (result2.next()) {
                String a = result2.getString("name");
                String b = result2.getString("familyname");
                String c = result2.getString("username");
                String d = result2.getString("password");
                int e = result2.getInt("id");
                
                buyers.add(new Buyer(a, b, c, d, e));
                

            }

            String sqtStat3 = "SELECT * From seller";
            ResultSet result3 = stmt.executeQuery(sqtStat3);
            while (result3.next()) {
                String a = result3.getString("name");
                String b = result3.getString("familyname");
                String c = result3.getString("username");
                String d = result3.getString("password");
                int e = result3.getInt("id");
                sellers.add(new Seller(a, b, c, d, e));

            }
            String sqtStat4 = "SELECT * From house";
            ResultSet result4 = stmt.executeQuery(sqtStat4);
            while (result4.next()) {
                int a = result4.getInt("id");
                double p = result4.getDouble("price");
                String l = result4.getString("location");
                int nr = result4.getInt("numberrooms");
                int nbr = result4.getInt("numberbedrooms");
                int nf = result4.getInt("numberfloors");
                int tv = result4.getInt(("timevisited"));
                double s = result4.getDouble("surface");
                double gs = result4.getDouble("gardensurface");
                boolean sp = result4.getBoolean("swimmingpool");
                pr.add(new House(a,p,l,nr,nbr,nf,tv,s,gs,sp));

            }
            String sqtStat5 = "SELECT * From apartment";
            ResultSet result5 = stmt.executeQuery(sqtStat5);
            while (result5.next()) {
                int a = result5.getInt("id");
                double p = result5.getDouble("price");
                String l = result5.getString("location");
                int nr = result5.getInt("numberrooms");
                int nbr = result5.getInt("numberbedrooms");
                int nf = result5.getInt("numberfloors");
                int tv = result5.getInt(("timevisited"));
                double s = result5.getDouble("surface");
                boolean elv = result5.getBoolean("elevator");
                int fn = result5.getInt("floornumber");
                boolean prkg = result5.getBoolean("parking");
                pr.add(new Appartment(a,p,l,nr,nbr,nf,tv,s,elv,fn,prkg));

            }
            

        } catch (SQLException e) {
            System.err.println(e);
        }

    }
    
    public String writeusername()
    {
        Scanner a=new Scanner(System.in);
        System.out.println("Username :");
        return a.next();
        
    }
    public String writepassword()
    {
        Scanner a=new Scanner(System.in);
        System.out.println("Password :");
        return a.next();
    }
    public Buyer loginb()
    {
        String username=this.writeusername();
        String password=this.writepassword();
        //Pour tester on saisit à la mian password et username
        //On rentre notre username et notre mot de passe
        for(int i=0;i<buyers.size();++i)
        {
            if (buyers.get(i).getusername().equals(username)&&buyers.get(i).getpassword().equals(password))
            {
                return buyers.get(i);
            }
            
        }
        
        return null;
        
        
    }
    public Buyer testloginb()
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
    }
    
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
        
        
       
        
        
    }
    
    //  A customer can't have the same username as an already existing seller or buyer
    public int checkusername(String a)
    {
        int nb=0;
        for(int i=0;i<sellers.size();++i)
        {
            if (sellers.get(i).getusername().equals(a))
                nb++;
        }
        for(int j=0;j<buyers.size();++j)
        {
            if(buyers.get(j).getusername().equals(a))
                nb++;
        }
        return nb;
    }
    
    
    public void newcustomerb()
    {
        //affichage du choix entre etre un nouveau buyer ou ou nouveau seller
        //SI on clique sur le bouton etre un nouveau buyer
        //Nouvel affichage avec les champs a rentrer
        Scanner a =new Scanner(System.in);
       System.out.println("Name :");
       String n =a.next();
       System.out.println("Family name :");
       String fn =a.next();
       
       System.out.println(" Username : ");
           String u=a.next();
       
       if(this.checkusername(u)!=0)
       do
       {
           
           System.out.println(" This username already exists, choose another one");
           System.out.println("Username");
            u=a.next();
         
           
           
       }while( this.checkusername(u)!=0);
       System.out.println(" Password");
       String p=a.next();
       int id;
       id=buyers.get(buyers.size()-1).getid()+1;
       buyers.add(new Buyer(n,fn,u,p,id)); 
       
       Connection conn = null;
        try {

            conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
            Statement stmt = conn.createStatement();
            
            conn.setAutoCommit(false);
            try
            {
          
             
         stmt.executeUpdate("INSERT INTO buyer " + " (id, name, familyname, username, password) " + "VALUES" + "('"+id+"','"+n+"','"+fn+"','"+u+"','"+p+"' )");
         conn.commit();
            }
         
         
         
         
       
         catch(SQLException f)
                 {
                 System.err.println(f);
                 }
        }
        catch (SQLException e) {
            System.err.println(e);
        }
       
    }
    public void newcustomers()
    {
           Scanner a =new Scanner(System.in);
       System.out.println("Name :");
       String n =a.next();
       System.out.println("Family name :");
       String fn =a.next();
       
       System.out.println(" Username : ");
           String u=a.next();
       
       if(this.checkusername(u)!=0)
       do
       {
           
           System.out.println(" This username already exists, choose another one");
           System.out.println("Username");
            u=a.next();
         
           
           
       }while( this.checkusername(u)!=0);
       System.out.println(" Password");
       String p=a.next();
       int id;
       id=sellers.get(sellers.size()-1).getid()+1;
 
       sellers.add(new Seller(n,fn,u,p,id));  
        Connection conn = null;
        try {

            conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
            Statement stmt = conn.createStatement();
            
            conn.setAutoCommit(false);
            try
            {
          
             
         stmt.executeUpdate("INSERT INTO seller " + " (id, name, familyname, username, password) " + "VALUES" + "('"+id+"','"+n+"','"+fn+"','"+u+"','"+p+"' )");
         conn.commit();
            }
         
         
         
         
       
         catch(SQLException f)
                 {
                 System.err.println(f);
                 }
        }
        catch (SQLException e) {
            System.err.println(e);
        }
       
       
    }

}
