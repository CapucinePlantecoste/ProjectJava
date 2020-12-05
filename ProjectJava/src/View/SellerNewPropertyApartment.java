//this frame is displayed when the seller wants to introduce a new apartment 
package View;


import Model.Visit;
import Model.Seller;
import Model.Property;
import Model.Offer;
import Model.Employee;
import Model.Appartment;
import Model.Buyer;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import projectjava.First;
import Model.PropertyDAOImpl;

/**
 *
 * @author CAP
 */
public class SellerNewPropertyApartment extends javax.swing.JFrame {

    /**
     * Creates new form SellerNewPropertyApartment
     */
    public SellerNewPropertyApartment(Seller a, ArrayList<Buyer> b, ArrayList<Seller> s, ArrayList<Employee> e, ArrayList<Property> prop, ArrayList<Visit> vis, ArrayList<Offer> off) {
        //constructor of the class
        buyers = b;
        //Array List of all the buyers of the application 
        sellers = s;
        //Array List of all the sellers of the application
        emp = e;
        //Array List of all the employees of the application
        pr = prop;
        //Array List of all the properties of the application
        v = vis;
        //Array List of all the viewings of the application
        o = off;
        //Array List of all the offers of the application
        newseller = a;
        //current connected seller 
        tampon1 = 1;
        tampon2 = 1;
        //buffers 
        initComponents();
        //automatically generated constructor 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField7 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(1090, 100, 60, 100);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectjava/logo 2 projet info.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Introduce a new apartment");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Please, fill the following information to create a new property");

        jButton1.setText("<= Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(64, 64, 64))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addGap(135, 135, 135)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(0, 0, 740, 830);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton5.setText("Log Out");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(1360, 100, 100, 23);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Surface");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(1210, 360, 200, 30);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Price (in €)");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(950, 180, 150, 30);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Location");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(1210, 180, 200, 30);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Number of rooms");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(950, 270, 200, 30);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Number of Bedrooms");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(1210, 270, 200, 30);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setText("Elevator");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(950, 450, 200, 30);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("Parking");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(950, 540, 200, 30);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setText("Number of floors");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(950, 360, 200, 30);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 153));
        jLabel13.setText("Floor Number ");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(1210, 450, 200, 30);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(1210, 210, 200, 30);

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(1210, 300, 200, 30);

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField3);
        jTextField3.setBounds(950, 210, 160, 30);

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField4);
        jTextField4.setBounds(1210, 480, 200, 30);

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField5);
        jTextField5.setBounds(950, 300, 160, 30);

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField6);
        jTextField6.setBounds(950, 390, 160, 30);

        jComboBox1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(950, 570, 59, 29);

        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField7);
        jTextField7.setBounds(1210, 390, 200, 30);

        jComboBox2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2);
        jComboBox2.setBounds(950, 480, 59, 29);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton2.setText("Confirm the introduction of this property");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(1010, 660, 350, 40);
        jPanel2.add(jTextField8);
        jTextField8.setBounds(1110, 570, 400, 30);

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 153));
        jLabel15.setText("Description");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(1120, 540, 160, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1575, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // back button
        this.toBack();
        //if we click on the back button
        setVisible(false);
        //this page disappears
        SellerNewProperty a = new SellerNewProperty(newseller, buyers, sellers, emp, pr, v, o);
        //we go back on the previous page
        a.setVisible(true);
        //we set the page to visible 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //log out button
        this.toBack();
        //when we click on the button
        setVisible(false);
        //this page disappears
        new First(buyers, sellers, emp, pr, v, o).toFront();
        //we go back on the first page
        new First(buyers, sellers, emp, pr, v, o).setState(java.awt.Frame.NORMAL);
        new First(buyers, sellers, emp, pr, v, o).setVisible(true);
        //we set the first page visible 

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        //function that unables the user to enter anything else than a number (because we want a price)
         char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        //function that unables the user to enter antything else than a digit (because we want a number of rooms)
       char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        //function that unables the user to enter anything else than a digit (because we want a number of floors)
         char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        //function that unables the user to enter anything else than a digit (because we want a surface)
         char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        //function that unables the user to enter anything else than a digit (because we want a number of bedrooms)
         char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        //function that unables the user to enter anything else than a digit (because we want a floor number)
         char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        //combo box corresponding to if there is an elevator 
        String selected = (String) jComboBox2.getSelectedItem();
        //we get what has been selected in the combo box
        if (selected.equals("Yes")) {
            //if there is an elevator 
            tampon2 = 1;
            //we set the second buffer to 1
        } else if (selected.equals("No")) {
            //if there is no elevator 
            tampon2 = 2;
            //the second buffer is set to 2
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        //combo box corresponding to if there is a parking
        String selected = (String) jComboBox1.getSelectedItem();
        //we get what has been selected in the combo box
        if (selected.equals("Yes")) {
            //if there is a parking
            tampon1 = 1;
            //we fix the buffer to 1
        } else if (selected.equals("No")) {
            //if there is no parking
            tampon1 = 2;
            //we fix the buffer to 2
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // if the seller wants to introduce the new property 

        if (jTextField1.getText().trim().isEmpty() || jTextField2.getText().trim().isEmpty() || jTextField3.getText().trim().isEmpty() || jTextField4.getText().trim().isEmpty() || jTextField5.getText().trim().isEmpty() || jTextField6.getText().trim().isEmpty() || jTextField7.getText().trim().isEmpty() || jTextField8.getText().trim().isEmpty()) {
            //if one of the field is empty 
            JOptionPane.showMessageDialog(null, "One or several fields are empty. Please, try again.");
            //we let it know
        } else {
              if(Integer.parseInt(jTextField5.getText())<Integer.parseInt(jTextField2.getText()))
                    {
                        //We check if the number of rooms is higher than the number of bedrooms
                        //If it is not we display a message
                        JOptionPane.showMessageDialog(null, "The number of bedrooms can be higher than the number of rooms.");
                    }
                    else
                    {
                    //if all the conditions are respected 
            
            this.addapartment();
            //we add the appartment thanks to the addapartment function 
            JOptionPane.showMessageDialog(null, "Your apartment has been successfully registered for sale");
            //successful adding
            this.setVisible(false);
            //we need to close this frame after the registration of the property 
            SellerFirst a = new SellerFirst(newseller, buyers, sellers, emp, pr, v, o);
            //we go back on the first page 
            a.setVisible(true);
            //we set the first page visible 
                    }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        //function that unsables to enter a digit (because we want a location)
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    public void addapartment() {
        //fonction that enables to add an apartment both in the database and in the application 
        int idlast = pr.get(pr.size() - 1).getid();
        int newid = idlast + 1;
        //the id of the new apartment will be the id of the last property of the property list +1
        PropertyDAOImpl pdao = new PropertyDAOImpl();
        //we create an object of the PropertyDAOImpl class, to introduce the apartment later in the database
        if (tampon1 == 1) {
            //if there is a parking
            if (tampon2 == 1) {
                //if there is an elevator 
                pr.add(new Appartment(newid, jTextField8.getText(), Double.parseDouble(jTextField3.getText()), jTextField1.getText(), Integer.parseInt(jTextField5.getText()), Integer.parseInt(jTextField2.getText()), Integer.parseInt(jTextField6.getText()), 0, Double.parseDouble(jTextField7.getText()), newseller.getid(), false, "Apartment", true, Integer.parseInt(jTextField4.getText()), true));
                //we add the apartment to the property list with corresponding values 
            } else {
                //if there is a parking and no elevator 
                pr.add(new Appartment(newid, jTextField8.getText(), Double.parseDouble(jTextField3.getText()), jTextField1.getText(), Integer.parseInt(jTextField5.getText()), Integer.parseInt(jTextField2.getText()), Integer.parseInt(jTextField6.getText()), 0, Double.parseDouble(jTextField7.getText()), newseller.getid(), false, "Apartment", false, Integer.parseInt(jTextField4.getText()), true));
                //we add the apartment to the property list with corresponding values
            }
        } else {
            if (tampon2 == 1) {
                //if there is no parking and there is an elevator  
                pr.add(new Appartment(newid, jTextField8.getText(), Double.parseDouble(jTextField3.getText()), jTextField1.getText(), Integer.parseInt(jTextField5.getText()), Integer.parseInt(jTextField2.getText()), Integer.parseInt(jTextField6.getText()), 0, Double.parseDouble(jTextField7.getText()), newseller.getid(), false, "Apartment", true, Integer.parseInt(jTextField4.getText()), false));
                //we add the apartment to the property list with corresponding values
            } else {
                //if there is no parking and no elevator 
                pr.add(new Appartment(newid, jTextField8.getText(), Double.parseDouble(jTextField3.getText()), jTextField1.getText(), Integer.parseInt(jTextField5.getText()), Integer.parseInt(jTextField2.getText()), Integer.parseInt(jTextField6.getText()), 0, Double.parseDouble(jTextField7.getText()), newseller.getid(), false, "Apartment", false, Integer.parseInt(jTextField4.getText()), false));
                //we add the apartment to the property list with corresponding values
            }
        }
        pdao.addproperty(pr.get(pr.size() - 1), 1);
        //we finally add the property to the database 

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SellerNewPropertyApartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellerNewPropertyApartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellerNewPropertyApartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellerNewPropertyApartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SellerNewPropertyApartment(newseller, buyers, sellers, emp, pr, v, o).setVisible(true);
            }
        });
    }

    private static ArrayList<Buyer> buyers = new ArrayList<>();
    //array list of all the application buyers 
    private static ArrayList<Seller> sellers = new ArrayList<>();
    //array list of all the application sellers 
    private static ArrayList<Employee> emp = new ArrayList<>();
    //array list of all the application employees 
    private static ArrayList<Property> pr = new ArrayList<>();
    //array list of all the application properties
    private static ArrayList<Visit> v = new ArrayList<>();
    //array list of all the application viewings
    private static ArrayList<Offer> o = new ArrayList<>();
    //array list of all the application offers
    private static Seller newseller;
    //current connected seller 
    private int tampon1;
    private int tampon2;
    //temporary buffers
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
