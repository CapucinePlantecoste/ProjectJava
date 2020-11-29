/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.BuyerViewings;
import Model.Visit;
import Model.Seller;
import Model.Property;
import Controller.Offer;
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

    /**
     * Creates new form BuyerFirst
     */
    public BuyerFirst(Buyer a, ArrayList<Buyer> b, ArrayList<Seller> s, ArrayList<Employee> e, ArrayList<Property> prop, ArrayList<Visit> vis, ArrayList<Offer> off) {
        buyers = b;//Array List of buyers
        sellers = s;//Array List of sellers
        emp = e;//Array List of employees
        pr = prop;
        v = vis;
        o = off;

        newbuyer = a;
        tampon = 1;

        initComponents();
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

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

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

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

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
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(173, 173, 173)
                    .addComponent(jLabel2)
                    .addContainerGap(567, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(259, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(86, 86, 86)
                .addComponent(jButton1)
                .addGap(147, 147, 147)
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

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Minimum nb bedrooms");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(1200, 460, 130, 40);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(1095, 620, 120, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No preferences", "House", "Apartment" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(930, 360, 137, 26);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Type of property");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(930, 320, 110, 40);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Searching for a new property ? Chose your criteria ");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(920, 250, 530, 60);

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
        jTextField1.setBounds(930, 550, 130, 30);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setText("Maximum Price");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(1200, 390, 110, 40);

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
        jTextField2.setBounds(1200, 420, 130, 30);

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setText("Minimum Surface ");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(930, 520, 150, 40);
        jPanel2.add(jTextField3);
        jTextField3.setBounds(1200, 360, 130, 30);

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setText("Location");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(1200, 330, 110, 40);

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel2.add(jTextField4);
        jTextField4.setBounds(1200, 490, 130, 30);

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel10.setText("Maximum surface");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(1200, 520, 150, 40);

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
        jTextField5.setBounds(1200, 550, 130, 30);

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel11.setText("Minimum nb Rooms");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(930, 460, 150, 40);
        jLabel11.getAccessibleContext().setAccessibleName("Minimun nb Rooms");

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
        jTextField6.setBounds(930, 490, 130, 30);

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel12.setText("Minimum Price");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(930, 390, 110, 40);

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
        jTextField7.setBounds(930, 420, 130, 30);

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
        // TODO add your handling code here:
        //this.toBack();//if we click on the back button
        setVisible(false);//this page disappears 
        new First(buyers, sellers, emp, pr, v, o).toFront();//we go back on the first page 
        new First(buyers, sellers, emp, pr, v, o).setState(java.awt.Frame.NORMAL);
        new First(buyers, sellers, emp, pr, v, o).setVisible(true);


    }//GEN-LAST:event_jButton5ActionPerformed

    //See my viewings
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ArrayList<Visit> myviewings = new ArrayList<>();

        for (int i = 0; i < v.size(); ++i) {
            if (v.get(i).getidbuyer() == newbuyer.getid()) {
                myviewings.add(v.get(i));
            }
        }
        if (myviewings.size() == 0) {
            JOptionPane.showMessageDialog(null, "You do not have any viewing"); //message shown to say so
        } else {
        
            BuyerViewings a= new BuyerViewings (newbuyer, buyers, sellers, emp, pr, v, o, myviewings); 
            a.setVisible(true); 
            //Affichr la page avec une combo box de tous les viewings
        }
        


    }//GEN-LAST:event_jButton2ActionPerformed

    // Search Button !!!!!!!!!!!!!!
    // coucou caca c'est ici que ca se passe
    // Il faut que tu fasses deux trucs
    // Si la liste results a une size de 0 alors tu affiches un JoptionPane en disant no Result found
    //SInon alors tu fais le jcombobox a partir de ce que t'as dans results
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        double minpr = this.getvalue7();
        double maxpr = this.getvalue2();
        double minsurf = this.getvalue1();
        double maxsurf = this.getvalue5();
        double minnbrooms = this.getvalue6();
        double minnbbedrooms = this.getvalue4();
        ArrayList<Property> results = new ArrayList<>();
        if (tampon == 1) {
            if (jTextField3.getText().isEmpty()) {
                for (int i = 0; i < pr.size(); i++) {
                    if (pr.get(i).getprice() > minpr && pr.get(i).getprice() < maxpr && pr.get(i).getsurface() > minsurf && pr.get(i).getsurface() < maxsurf && pr.get(i).getnumberrooms() > minnbrooms && pr.get(i).getnumberbedrooms() > minnbbedrooms && pr.get(i).getsold()==false) {
                        results.add(pr.get(i));
                    }
                }
            } else {
                for (int i = 0; i < pr.size(); i++) {
                    if (pr.get(i).getlocation().equals(jTextField3.getText()) && pr.get(i).getprice() > minpr && pr.get(i).getprice() < maxpr && pr.get(i).getsurface() > minsurf && pr.get(i).getsurface() < maxsurf && pr.get(i).getnumberrooms() > minnbrooms && pr.get(i).getnumberbedrooms() > minnbbedrooms && pr.get(i).getsold()==false) {
                        results.add(pr.get(i));
                    }
                }
            }
        } else if (tampon == 2) {
            if (jTextField3.getText().isEmpty()) {
                for (int i = 0; i < pr.size(); i++) {
                    if (pr.get(i).gettype().equals("House") && pr.get(i).getprice() > minpr && pr.get(i).getprice() < maxpr && pr.get(i).getsurface() > minsurf && pr.get(i).getsurface() < maxsurf && pr.get(i).getnumberrooms() > minnbrooms && pr.get(i).getnumberbedrooms() > minnbbedrooms && pr.get(i).getsold()==false) {
                        results.add(pr.get(i));
                    }
                }
            } else {
                for (int i = 0; i < pr.size(); i++) {
                    if (pr.get(i).gettype().equals("House") && pr.get(i).getlocation().equals(jTextField3.getText()) && pr.get(i).getprice() > minpr && pr.get(i).getprice() < maxpr && pr.get(i).getsurface() > minsurf && pr.get(i).getsurface() < maxsurf && pr.get(i).getnumberrooms() > minnbrooms && pr.get(i).getnumberbedrooms() > minnbbedrooms && pr.get(i).getsold()==false) {
                        results.add(pr.get(i));
                    }
                }
            }
        } else if (tampon == 3) {
            if (jTextField3.getText().isEmpty()) {
                for (int i = 0; i < pr.size(); i++) {
                    if (pr.get(i).gettype().equals("Apartment") && pr.get(i).getprice() > minpr && pr.get(i).getprice() < maxpr && pr.get(i).getsurface() > minsurf && pr.get(i).getsurface() < maxsurf && pr.get(i).getnumberrooms() > minnbrooms && pr.get(i).getnumberbedrooms() > minnbbedrooms && pr.get(i).getsold()==false) {
                        results.add(pr.get(i));
                    }
                }
            } else {
                for (int i = 0; i < pr.size(); i++) {
                    if (pr.get(i).gettype().equals("Apartment") && pr.get(i).getlocation().equals(jTextField3.getText()) && pr.get(i).getprice() > minpr && pr.get(i).getprice() < maxpr && pr.get(i).getsurface() > minsurf && pr.get(i).getsurface() < maxsurf && pr.get(i).getnumberrooms() > minnbrooms && pr.get(i).getnumberbedrooms() > minnbbedrooms && pr.get(i).getsold()==false) {
                        results.add(pr.get(i));
                    }
                }
            }
        }
        if (results.size() == 0) {
            JOptionPane.showMessageDialog(null, "No results found"); //message shown to say so
            
        } else {
            
            
            BuyerResults a= new BuyerResults (newbuyer, buyers, sellers, emp, pr, v, o, results); 
            a.setVisible(true); 
            
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c) && !evt.isAltDown()) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c) && !evt.isAltDown()) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c) && !evt.isAltDown()) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c) && !evt.isAltDown()) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c) && !evt.isAltDown()) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c) && !evt.isAltDown()) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String selected = (String) jComboBox1.getSelectedItem();
        if (selected.equals("No preferences")) {
            tampon = 1;
        } else if (selected.equals("House")) {
            tampon = 2;
        } else if (selected.equals("Apartment")) {
            tampon = 3;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField5ActionPerformed

    //See my offers button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ArrayList<Offer> myoffers = new ArrayList<>();
        for (int i = 0; i < o.size(); ++i) {
            if (o.get(i).getidbuyer() == newbuyer.getid()) {
                myoffers.add(o.get(i));
            }
        }

        if (myoffers.size() == 0) {
            JOptionPane.showMessageDialog(null, "You do not have any offer"); //message shown to say so
            
        } else {
            
            BuyerOffer a= new BuyerOffer (newbuyer, buyers, sellers, emp, pr, v, o, myoffers); 
            a.setVisible(true);
            //Jotpion Pane classique
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public double getvalue7() {
        double minpr;
        if (jTextField7.getText().trim().isEmpty()) {
            minpr = 0;
        } else {
            minpr = Double.parseDouble(jTextField7.getText());
        }
        return minpr;

    }

    public double getvalue2() {
        double maxpr;
        if (jTextField2.getText().trim().isEmpty()) {
            maxpr = 300000000;
        } else {
            maxpr = Double.parseDouble(jTextField2.getText());
        }
        return maxpr;
    }

    public double getvalue1() {
        double minsurf;
        if (jTextField1.getText().trim().isEmpty()) {
            minsurf = 0;
        } else {
            minsurf = Double.parseDouble(jTextField1.getText());
        }
        return minsurf;
    }

    public double getvalue5() {
        double maxsurf;

        if (jTextField5.getText().trim().isEmpty()) {
            maxsurf = 300000000;
        } else {
            maxsurf = Double.parseDouble(jTextField5.getText());
        }
        return maxsurf;
    }

    public double getvalue6() {
        double minnbrooms;
        if (jTextField6.getText().trim().isEmpty()) {
            minnbrooms = 0;
        } else {
            minnbrooms = Double.parseDouble(jTextField6.getText());
        }
        return minnbrooms;

    }

    public double getvalue4() {
        double minnbbedrooms;
        if (jTextField4.getText().trim().isEmpty()) {
            minnbbedrooms = 0;
        } else {
            minnbbedrooms = Double.parseDouble(jTextField4.getText());
        }
        return minnbbedrooms;
    }

    public void nom() {
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
            public void run() {
                new BuyerFirst(newbuyer, buyers, sellers, emp, pr, v, o).setVisible(true);
            }
        });
    }

    private static ArrayList<Buyer> buyers = new ArrayList<>();//array list of all the application buyers 
    private static ArrayList<Seller> sellers = new ArrayList<>();//array list of all the application sellers 
    private static ArrayList<Employee> emp = new ArrayList<>();//array list of all the application sellers 
    private static ArrayList<Property> pr = new ArrayList<>();
    private static ArrayList<Visit> v = new ArrayList<>();
    private static ArrayList<Offer> o = new ArrayList<>();

    private static Buyer newbuyer;
    int tampon;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
