/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Visit;
import Model.Seller;
import Model.Property;
import Model.Offer;
import Model.Employee;
import Model.Buyer;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Model.BuyerDAOImpl;
import projectjava.First;
import Model.SellerDAOImpl;
import java.util.regex.Pattern;

/**
 *
 * @author CAP
 */
public class SignInJFrame extends javax.swing.JFrame {

    /**
     * Creates new form SignInJFrame
     */
    public SignInJFrame(ArrayList<Buyer> b, ArrayList<Seller> s, ArrayList<Employee> e, ArrayList<Property> prop, ArrayList<Visit> vis, ArrayList<Offer> off) {//Connstructor 
        initComponents();//initialisation of the frame components, automatically generated by Netbeans
        buyers = b;//array list of all the buyers 
        sellers = s;//array list of all the sellers 
        emp = e;//array list of all the employees 
        pr = prop;// arraylist of all the properties
        v = vis;//arraylist of all the viewings
        o = off;//arraylist of all the offers
        tampon = 1;//buffer initialized at 1

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
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome on the application ! ");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Please, select whether you are a buyer or a seller");

        jComboBox1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buyer", "Seller" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectjava/logo 2 projet info.png"))); // NOI18N

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
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton1)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addGap(124, 124, 124)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(0, 0, 740, 830);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton5.setText("Sign In");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(990, 630, 100, 23);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Confirm Password ");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel7);
        jLabel7.setBounds(940, 540, 150, 26);

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("First Name");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel9);
        jLabel9.setBounds(940, 220, 80, 26);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(940, 330, 210, 40);

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Username (email adress)");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel10);
        jLabel10.setBounds(940, 380, 200, 26);

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Surname");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel11);
        jLabel11.setBounds(940, 300, 80, 26);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField3);
        jTextField3.setBounds(940, 250, 210, 40);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField4);
        jTextField4.setBounds(940, 410, 210, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectjava/logo projet info.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(1010, 130, 70, 70);

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Password");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel8);
        jLabel8.setBounds(940, 460, 70, 26);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordField1);
        jPasswordField1.setBounds(940, 570, 210, 40);

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordField2);
        jPasswordField2.setBounds(940, 490, 210, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1575, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        // TODO add your handling code here:
        int t;

        // We check that each textfield is not empty.
        // In order to do that we use the get text function to see if what the text field contains
        // We then use the trim function that doesn't take in consideration the blank ( in case the user has put blanks)
        // Then we test if the text is empty without the blanks
        if (jPasswordField2.getText().trim().isEmpty() || jTextField2.getText().trim().isEmpty() || jTextField3.getText().trim().isEmpty() || jTextField4.getText().trim().isEmpty() || jPasswordField2.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "One or several fields are empty. Please, try again.");
            //We show a message if one of them is empty

        } else if (!jPasswordField2.getText().equals(jPasswordField1.getText())) {
            //We check if the password field and the check passwordfield are the same
            JOptionPane.showMessageDialog(null, "The two passwords are not the same. Please, try again.");
        } //This next else if checks if the username field has an email format
        // We use a regex in order to deal with that
        //We use the Pattern.matches function that checks if the patternf of the text field is valid for an email adress
        //^:indicate that the field must start with a character that can only be a letter(lower or upper case) or a number 
        //Then it is followed by a string that contains only letters, numbers or  points(length max =100000 and length min=0 in case if the email adress has only one character before the arobase) 
        //Then this string must have an @ and only 1 that is why we have [@]{1}
        //Then it is followed by a string that contains only letters or numbers
        // Then we have 1 and only 1 point that is why we have [.]{1}
        // It is followed by a string which contains only letters
        //The $ sign indicates that the string must end here
        else if (!(Pattern.matches("^[a-zA-Z0-9]{1}+[a-zA-Z0-9-.]{0,10000}+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z]+$", jTextField4.getText()))) {
            JOptionPane.showMessageDialog(null, " Please enter a valid email adress");
            //if the format of the email adress is not correct, we let it kow
        } else {
            if (tampon == 1) {
                //if we click on buyer
                t = this.test();
                //by calling the test fuction, we check if the entered username is not already taken by one of our sellers or buyers or employees

                if (t != 0) {
                    //if t !=0, it means the entered username is amready used by someone else
                    JOptionPane.showMessageDialog(null, "Username already used. Please, chose another one.");
                    //so we let it know 
                } else {
                    //otherwise, the username is good 
                    this.addbuyer();
                    //we call the addbuyer function to add the new buyer to the application 
                    JOptionPane.showMessageDialog(null, "The account has been successfully created");
                    //We lead the new buyer to his account
                    BuyerFirst newframe = new BuyerFirst(buyers.get(buyers.size() - 1), buyers, sellers, emp, pr, v, o);
                    //We show him his name
                    newframe.nom();
                    this.setVisible(false);
                    //If the user clicks on connect as a buyer

                    newframe.setVisible(true); //we open the new frame
                    newframe.toFront();

                }

            } else {
                //if we click on seller
                t = this.test();
                //by calling the test fuction, we check if the entered username is not already taken by one of our sellers or buyers or employees
                if (t != 0) {
                    //if t !=0, it means the entered username is amready used by someone else
                    JOptionPane.showMessageDialog(null, "Username already used. Please, chose another one.");
                    //so we let it know 
                } else {
                    //otherwise, the username is good 
                    this.addseller();
                    //we call the addseller function to add the new seller to the application 
                    JOptionPane.showMessageDialog(null, "The account has been successfully created");
                    //We lead the new seller to his account
                    SellerFirst newframe = new SellerFirst(sellers.get(sellers.size() - 1), buyers, sellers, emp, pr, v, o);
                    //We show him his name
                    newframe.nom();
                    this.setVisible(false);
                    newframe.setVisible(true); //we open the new frame
                    newframe.toFront();
                }

            }
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    public void addbuyer() {
        //function to add a buyer in the app and in the database
        BuyerDAOImpl bdao = new BuyerDAOImpl();
        //We create a BuyerDAOImpl object to add the buyer to the database
        int idlast = buyers.get(buyers.size() - 1).getid();
        // we get the id of the last buyer on the buyers list
        int newid = idlast + 1;
        //We add one to the value of the id of the last buyer
        buyers.add(new Buyer(newid, jTextField3.getText(), jTextField2.getText(), jTextField4.getText(), jPasswordField2.getText()));
        //We create our new object buyer with all the needed attributes
        bdao.addbuyer(buyers.get(buyers.size() - 1));
        //We add the buyer to the database

    }

    public void addseller() {
        //function to add a seller in the app and in the database
        SellerDAOImpl sdao = new SellerDAOImpl();
        //We create a SellerDAOImpl object to add the seller to the database
        int idlast = sellers.get(sellers.size() - 1).getid();
        // we get the id of the last seller on the sellers list
        int newid = idlast + 1;
        //We add one to the value of the id of the last buyer
        sellers.add(new Seller(newid, jTextField3.getText(), jTextField2.getText(), jTextField4.getText(), jPasswordField2.getText()));
        //We create our new object seller with all the needed attributes
        sdao.addseller(sellers.get(sellers.size() - 1));
        //We add the buyer to the database

    }

    public int test() {
        //fuction that checks if the entered username is not already in the application 
        int t = 0;
        //temporary variable 
        for (int i = 0; i < buyers.size(); ++i) {
            //we go through all the buyers of the application 
            if (buyers.get(i).getusername().equals(jTextField4.getText())) {
                //if the username of the buyer at the index i is equal to the one that the new customer wants
                t++;
                //We increment the variable
            }
        }
        for (int j = 0; j < sellers.size(); ++j) {
            //we go through all the sellers of the application 
            if (sellers.get(j).getusername().equals(jTextField4.getText())) {
                //if the username of the seller at the index j is equal to the one that the new customer wants
                t++;
                // We increment the variable
            }
        }
        for (int k = 0; k < emp.size(); ++k) {
            //we go through all the employees of the application 
            if (emp.get(k).getusername().equals(jTextField4.getText())) {
                //if the username of the employee at the index k is equal to the one that the new customer wants
                t++;
                //We increment the variable
            }
        }
        return t;
        //We return variable t

    }
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String selected = (String) jComboBox1.getSelectedItem();
        // We get what has been selected in the jcombobox
        if (selected.equals("Buyer")) {
            tampon = 1;
            //if it is buyer the value of the buffer is 1
        } else {
            tampon = 2;
            //else it is 2
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.toBack(); //if we click on the back button
        setVisible(false);//This page disappaears 
        First a = new First(buyers, sellers, emp, pr, v, o);
        a.toFront();//We go back on the FIrst page
        a.setState(java.awt.Frame.NORMAL);
        a.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        //function that doesn't allow the buyer to enter a digit for the name field
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        //function that doesn't allow the buyer to enter a digit for the surname field
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

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
            java.util.logging.Logger.getLogger(SignInJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignInJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignInJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignInJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SignInJFrame(buyers, sellers, emp, pr, v, o).setVisible(true);//We create a sign in Jframe object to run the process
            }
        });
    }

    private static ArrayList<Buyer> buyers = new ArrayList<>();//array list of all the buyers of the application
    private static ArrayList<Seller> sellers = new ArrayList<>();//array list of all the sellers of the application
    private static ArrayList<Employee> emp = new ArrayList<>();//array list of all the employees of the application
    private static ArrayList<Property> pr = new ArrayList<>();// arraylist of all the properties
    private static ArrayList<Visit> v = new ArrayList<>();// arraylist of all the viewings
    private static ArrayList<Offer> o = new ArrayList<>();// arraylist of all the offers

    private int tampon;//buffer

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
