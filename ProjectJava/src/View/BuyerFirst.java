//this class if a jframe class, which coresponds to the first frame when we connect as a buyer 
package View;

import Model.Visit;
import Model.Seller;
import Model.Property;
import Model.Offer;
import Model.Employee;
import Model.Buyer;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import projectjava.First;

/**
 *
 * @author CAP
 */
public class BuyerFirst extends javax.swing.JFrame {
// a lot of code in this jframe has been automatically generated. 

    /**
     * Creates new form BuyerFirst
     */
    public BuyerFirst(Buyer a, ArrayList<Buyer> b, ArrayList<Seller> s, ArrayList<Employee> e, ArrayList<Property> prop, ArrayList<Visit> vis, ArrayList<Offer> off) {
        //constructor of the class 
        buyers = b;
        //Array List of all the buyers
        sellers = s;
        //Array List of all the sellers
        emp = e;
        //Array List of employees
        pr = prop;
        //array list of all the properties
        v = vis;
        //arraylist of all the visits 
        o = off;
        //arraylist of all the offers
        newbuyer = a;
        //the buyer coresponding to the one who connected
        tampon = 1;
        //temporary buffer

        initComponents();

        //automatic constructor of the components 
        this.nom();
        //We display a welcoming message for the buyer when he connects to his account
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
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectjava/logo 2 projet info.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jButton1.setText("See my offers");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jButton2.setText("See my viewings ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jButton4.setText("See Statistics");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(259, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addGap(43, 43, 43)
                .addComponent(jButton4)
                .addGap(116, 116, 116)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(700, Short.MAX_VALUE)))
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
        jButton5.setBounds(1350, 80, 100, 23);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Minimum nb bedrooms");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(1200, 460, 190, 40);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(1095, 620, 120, 40);

        jComboBox1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No preferences", "House", "Apartment" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(930, 360, 160, 30);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Type of property");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(930, 320, 170, 40);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("Searching for a new property ? Chose your criteria ");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(920, 250, 530, 60);

        jTextField1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(930, 550, 170, 30);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 255));
        jLabel7.setText("Maximum Price");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(1200, 390, 170, 40);

        jTextField2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
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
        jTextField2.setBounds(1200, 420, 170, 30);

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 255));
        jLabel8.setText("Minimum Surface ");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(930, 520, 210, 40);

        jTextField3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPanel2.add(jTextField3);
        jTextField3.setBounds(1200, 360, 170, 30);

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 255));
        jLabel9.setText("Location");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(1200, 330, 170, 40);

        jTextField4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField4);
        jTextField4.setBounds(1200, 490, 170, 30);

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 255));
        jLabel10.setText("Maximum surface");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(1200, 520, 210, 40);

        jTextField5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField5);
        jTextField5.setBounds(1200, 550, 170, 30);

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 255));
        jLabel11.setText("Minimum nb Rooms");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(930, 460, 210, 40);
        jLabel11.getAccessibleContext().setAccessibleName("Minimun nb Rooms");

        jTextField6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField6);
        jTextField6.setBounds(930, 490, 170, 30);

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 255));
        jLabel12.setText("Minimum Price");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(930, 390, 170, 40);

        jTextField7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField7);
        jTextField7.setBounds(930, 420, 170, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1575, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //this button is the log out button
        setVisible(false);
        //this page disappears when we log out
        new First(buyers, sellers, emp, pr, v, o).toFront();
        //we go back on the first page 
        new First(buyers, sellers, emp, pr, v, o).setState(java.awt.Frame.NORMAL);
        new First(buyers, sellers, emp, pr, v, o).setVisible(true);
        //we set the first page visible 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //button "see my viewings", enabling the buyer to see his viewings to come or passed
        ArrayList<Visit> myviewings = new ArrayList<>();
        //we create an array list of the viewings of the buyer 

        for (int i = 0; i < v.size(); ++i) {
            //we go through all the viewings list
            if (v.get(i).getidbuyer() == newbuyer.getid()) {
                //if the viewing considered is a viewing booked by this buyer
                myviewings.add(v.get(i));
                //we add this particular viewing in our personal list of viewings 
            }
        }
        if (myviewings.isEmpty()) {
            //if there is no viewings booked 
            JOptionPane.showMessageDialog(null, "You do not have any viewing");
            //message shown to say so
        } else {
            //if the buyer has booked viewings 

            this.setVisible(false);
            BuyerViewings a = new BuyerViewings(newbuyer, buyers, sellers, emp, pr, v, o, myviewings);
            //we open a new frame that will show him his viewings 
            a.setVisible(true);
            //we set this new page visivle 
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //button search after the user entered the fields to search for a property
        double minpr = this.getvalue7();
        //we have created fuctions to get all the fields entered by the user ;
        //We get the minimumprice
        double maxpr = this.getvalue2();
        //we get the maximum price 
        double minsurf = this.getvalue1();
        //we get the minimum surface
        double maxsurf = this.getvalue5();
        //Maximum surface
        double minnbrooms = this.getvalue6();
        //Minimum rooms
        double minnbbedrooms = this.getvalue4();
        //Minimum bedrooms
        ArrayList<Property> results = new ArrayList<>();
        //we create an arraylist of the properties corresponding to the criteria the user entered 
        if (tampon == 1) {
            //if the user did not select anything beteen 'apartment' or 'house in the criteria 
            if (jTextField3.getText().isEmpty()) {
                //if the loation field is empty
                for (int i = 0; i < pr.size(); ++i) {
                    //we go through all our properties that we got in the database 
                    if (pr.get(i).getprice() > minpr && pr.get(i).getprice() < maxpr && pr.get(i).getsurface() > minsurf && pr.get(i).getsurface() < maxsurf && pr.get(i).getnumberrooms() > minnbrooms && pr.get(i).getnumberbedrooms() > minnbbedrooms && pr.get(i).getsold() == false) {
                        //if the property selected coresponds to all the criteria    
                        results.add(pr.get(i));
                        //we add this property in our result arraylist
                    }
                }
            } else //otherwise, if a location is entered
            {
                for (int i = 0; i < pr.size(); ++i) {
                    //we go through all our property list
                    if (pr.get(i).getlocation().equals(jTextField3.getText()) && pr.get(i).getprice() > minpr && pr.get(i).getprice() < maxpr && pr.get(i).getsurface() > minsurf && pr.get(i).getsurface() < maxsurf && pr.get(i).getnumberrooms() > minnbrooms && pr.get(i).getnumberbedrooms() > minnbbedrooms && pr.get(i).getsold() == false) {
                        //if the selected property corresponds to all the criteria      
                        results.add(pr.get(i));
                        //we add the property in our result arraylist
                    }
                }
            }
        } else if (tampon == 2) {
            //otherwise, if the user selected a house
            if (jTextField3.getText().isEmpty()) {
                //if the location field is empty
                for (int i = 0; i < pr.size(); ++i) {
                    //we go through all our property list and look for the houses that have all these criteria
                    if (pr.get(i).gettype().equals("House") && pr.get(i).getprice() > minpr && pr.get(i).getprice() < maxpr && pr.get(i).getsurface() > minsurf && pr.get(i).getsurface() < maxsurf && pr.get(i).getnumberrooms() > minnbrooms && pr.get(i).getnumberbedrooms() > minnbbedrooms && pr.get(i).getsold() == false) {
                        //if the selected property coresponds to all the criteria     
                        results.add(pr.get(i));
                        //we add the property in our result arraylist
                    }
                }
            } else {
                //if the location field is not empty
                for (int i = 0; i < pr.size(); i++) {
                    //we go through all our property list and look for the houses that have all these criteria
                    if (pr.get(i).gettype().equals("House") && pr.get(i).getlocation().equals(jTextField3.getText()) && pr.get(i).getprice() > minpr && pr.get(i).getprice() < maxpr && pr.get(i).getsurface() > minsurf && pr.get(i).getsurface() < maxsurf && pr.get(i).getnumberrooms() > minnbrooms && pr.get(i).getnumberbedrooms() > minnbbedrooms && pr.get(i).getsold() == false) {
                        //if the selected property coresponds to all the criteria     
                        results.add(pr.get(i));
                        //we add the property in our result arraylist
                    }
                }
            }
        } else if (tampon == 3) {
            //otherwise, if the user selected an apartment
            if (jTextField3.getText().isEmpty()) {
                //if the location field is empty
                for (int i = 0; i < pr.size(); ++i) {
                    //we go through all our property list and look for all the apartments that have all these criteria
                    if (pr.get(i).gettype().equals("Apartment") && pr.get(i).getprice() > minpr && pr.get(i).getprice() < maxpr && pr.get(i).getsurface() > minsurf && pr.get(i).getsurface() < maxsurf && pr.get(i).getnumberrooms() > minnbrooms && pr.get(i).getnumberbedrooms() > minnbbedrooms && pr.get(i).getsold() == false) {
                        //if the selected property coresponds to all the criteria     
                        results.add(pr.get(i));
                        //we add the property in our result arraylist
                    }
                }
            } else {
                //if the location field is not empty
                for (int i = 0; i < pr.size(); ++i) {
                    //we go through all our property list and look for all the apartments that have all these criteria
                    if (pr.get(i).gettype().equals("Apartment") && pr.get(i).getlocation().equals(jTextField3.getText()) && pr.get(i).getprice() > minpr && pr.get(i).getprice() < maxpr && pr.get(i).getsurface() > minsurf && pr.get(i).getsurface() < maxsurf && pr.get(i).getnumberrooms() > minnbrooms && pr.get(i).getnumberbedrooms() > minnbbedrooms && pr.get(i).getsold() == false) {
                        //if the selected property coresponds to all the criteria    
                        results.add(pr.get(i));
                        //we add the property in our result arraylist
                    }
                }
            }
        }
        if (results.isEmpty()) {
            //if there is no result found     
            JOptionPane.showMessageDialog(null, "No results found");
            //message shown to say so

        } else {
            //otherwise, if there are results    

            this.setVisible(false);
            BuyerResults a = new BuyerResults(newbuyer, buyers, sellers, emp, pr, v, o, results);
            //we open a new frame which will display all the results

            a.setVisible(true);
            //we set visible the next frame            
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        //text field correspondinf to the minimum price 
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        //function that unables the user to enter something else than digit (because we want a minimum price)
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        //function that unables the user to enter something else than digit (because we want a maximum surface)
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        //function that unables the user to enter something else than digit (because we want a minimum number of bedrooms)
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        //function that unables the user to enter something else than digit (because we want a maximum price)
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        //function that unables the user to enter something else than digit (because we want a minimum surface)
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        //Text field coresponding to the minimum number of rooms
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        //function that unables the user to enter something else than digit (because we want a minimum number of bedrooms)
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        //Text field coresponding to the maximum price
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        //Text field coresponding to the minimum surface
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // jComboBox coresponding to the type of property : there can be no type, or apartment type or house type
        String selected = (String) jComboBox1.getSelectedItem();
        //we get the choice that has been selected in the combobox
        //By default the buffer is 1 because "No preferneces is the choice that the buyer sees without clicking on the jComboBox
        if (selected.equals("No preferences")) {
            //if no choice has been made  or if the user clicks on No preferences
            tampon = 1;
            //we fix the buffer to 1, and will use this later 
        } else if (selected.equals("House")) {
            //otherwise, if the type of the property is a house, 
            tampon = 2;
            //the buffer value is 2, we will use this later 
        } else if (selected.equals("Apartment")) {
            //if the type of the property is an apartment
            tampon = 3;
            //the buffer value is 3, we will use this later 
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        //Text field coresponding to the maximum surface
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //See my offers button
        ArrayList<Offer> myoffers = new ArrayList<>();
        //we create a new arraylist of the offers coresponding to the connected buyer 's one
        for (int i = 0; i < o.size(); ++i) {
            //we go through all our offers get from the database
            if (o.get(i).getidbuyer() == newbuyer.getid()) {
                //if the offer has the idbuyer that is equals to the id of the buyer connected 
                myoffers.add(o.get(i));
                //we add the offer to the personal list of offer
            }
        }
        if (myoffers.isEmpty()) {
            //if there is no offer    
            JOptionPane.showMessageDialog(null, "You do not have any offer");
            //message shown to say so

        } else {
            //otherwise, if we have offers 

            BuyerOffer a = new BuyerOffer(newbuyer, buyers, sellers, emp, pr, v, o, myoffers);
            //we open a new frame where the buyer will be able to see his offers
            a.setVisible(true);
            this.setVisible(false);
            //we set the new frame visible 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //button to see the charts 
        this.setVisible(false);
        //we close this frame
        ChartFrameStats a = new ChartFrameStats("buyer", newbuyer, null, buyers, sellers, emp, pr, v, o);
        //we open a new one to see the charts 
        //We precise that it is a buyer who is connected and not an employee that is why it is equals to null the third element
        a.setVisible(true);
        //we set it visible 

    }//GEN-LAST:event_jButton4ActionPerformed

    public double getvalue7() {
        //method to get the minimum price 
        double minpr;
        if (jTextField7.getText().trim().isEmpty()) {
            //if the field is empty
            minpr = 0;
            //we set the value to 0
        } else {
            //otherwise
            minpr = Double.parseDouble(jTextField7.getText());
            //we get the value and we convert it to a double 
        }
        return minpr;
        //we get the double value of the minimum price 

    }

    public double getvalue2() {
        //method to get the maximum price
        double maxpr;
        if (jTextField2.getText().trim().isEmpty()) {
            //if the field is empty
            maxpr = 300000000;
            //we set the value to a very big number never reached 
        } else {
            //otherwise
            maxpr = Double.parseDouble(jTextField2.getText());
            //we get the String from this fieldand we convert it to a double
        }
        return maxpr;
        //we get the double value of the maximum price
    }

    public double getvalue1() {
        //method to get the minimum surface
        double minsurf;
        if (jTextField1.getText().trim().isEmpty()) {
            //if the field is empty 
            minsurf = 0;
            //we fix the value to 0
        } else {
            //otherwise
            minsurf = Double.parseDouble(jTextField1.getText());
            //we get the String  and we convert it to a double
        }
        return minsurf;
        //we get the double value of the minimum surface
    }

    public double getvalue5() {
        //method to get the maximum surface
        double maxsurf;

        if (jTextField5.getText().trim().isEmpty()) {
            //if the field is empty 
            maxsurf = 300000000;
            //we fix the value to a very big number 
        } else {
            //otherwise
            maxsurf = Double.parseDouble(jTextField5.getText());
            //we get the String and we convert it to a double 
        }
        return maxsurf;
        //we get the value of the maximum surface
    }

    public double getvalue6() {
        //method to get the minimum number of rooms
        double minnbrooms;
        if (jTextField6.getText().trim().isEmpty()) {
            //if the field is empty 
            minnbrooms = 0;
            //we fix the value to 0
        } else {
            //otherwise
            minnbrooms = Double.parseDouble(jTextField6.getText());
            //we get the String and we convert it to a double
        }
        return minnbrooms;
        //we get the value of the minimum number of rooms 

    }

    public double getvalue4() {
        //method to get the minimum number of bedrooms
        double minnbbedrooms;
        if (jTextField4.getText().trim().isEmpty()) {
            //if the field is empty
            minnbbedrooms = 0;
            //we set the value to 0
        } else {
            //otherwise
            minnbbedrooms = Double.parseDouble(jTextField4.getText());
            //we get the String and we convert it to a double
        }
        return minnbbedrooms;
        //we get the value of the minimum number of bedrooms
    }

    public void nom() {
        //method that displays the name of the buyer
        jLabel2.setText("We are very pleased to see you again " + newbuyer.getname() + "!");
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
            java.util.logging.Logger.getLogger(BuyerFirst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuyerFirst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuyerFirst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyerFirst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BuyerFirst(newbuyer, buyers, sellers, emp, pr, v, o).setVisible(true);
            }
        });
    }

    private static ArrayList<Buyer> buyers = new ArrayList<>();
    //array list of all the application buyers 
    private static ArrayList<Seller> sellers = new ArrayList<>();
    //array list of all the application sellers 
    private static ArrayList<Employee> emp = new ArrayList<>();
    //array list of all the application sellers 
    private static ArrayList<Property> pr = new ArrayList<>();
    //array list of all the application properties 
    private static ArrayList<Visit> v = new ArrayList<>();
    //array list of all the application viewings 
    private static ArrayList<Offer> o = new ArrayList<>();
    //array list of all the application offers

    private static Buyer newbuyer;
    //the buyer who has connected
    int tampon;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
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
    // End of variables declaration//GEN-END:variables
}
