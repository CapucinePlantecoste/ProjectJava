//this class is the buyerViewings class, it enables the buyer to check his viewings to come, and to confirm when a viewing has been done 
package View;

import Model.Visit;
import Model.Seller;
import Model.Property;
import Model.Offer;
import Model.Employee;
import Model.Buyer;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Model.PropertyDAOImpl;
import Model.VisitDAOImpl;

/**
 * Class BuyerViewings that corresponds to the JFrame that is displayed when a
 * buyer wants to see his viewings
 *
 * @author CAP
 */
public class BuyerViewings extends javax.swing.JFrame {

    /**
     * Constructor of the class
     *
     * @param a is the Buyer who is connected
     * @param b is the ArrayList of all the buyers of the app
     * @param s is the ArrayList of all the sellers of the app
     * @param e is the ArrayList of all the employees of the app
     * @param prop is the ArrayList of all the properties of the app
     * @param vis is the ArrayList of all the visits of the app
     * @param off is the ArrayList of all the offers of the app
     * @param myv is the ArrayList of all the visits of the buyer connected
     */
    public BuyerViewings(Buyer a, ArrayList<Buyer> b, ArrayList<Seller> s, ArrayList<Employee> e, ArrayList<Property> prop, ArrayList<Visit> vis, ArrayList<Offer> off, ArrayList<Visit> myv) {
        //constructor of the class 
        buyers = b;
        //Array List of all the buyers of the database
        sellers = s;
        //Array List of all the sellers of the database 
        emp = e;
        //Array List of all the employees of the database 
        pr = prop;
        //Array List of all the properties of the database
        v = vis;
        //Array List of all the viewings of the database
        o = off;
        //Array List of all the offers of the database

        newbuyer = a;
        //connected buyer
        myviewings = myv;
        //arraylist of the personal viewings of the connected buyer 

        initComponents();
        //automatically generated constructor 
        this.initjcb1();
        //function that enables to fill the combobox with the viewings of the connected buyer
        jPanelViewings.hide();
        //in the beginning, all the other panels are hidden 
    }

    @SuppressWarnings("unchecked")

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanelViewings = new javax.swing.JPanel();
        jLabelHour = new javax.swing.JLabel();
        jLabelDescription = new javax.swing.JLabel();
        jLabelLocation = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectjava/logo 2 projet info.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jComboBox1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select one of your following viewings" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Your viewings ");

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
                .addGap(46, 46, 46)
                .addComponent(jButton1)
                .addContainerGap(621, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addGap(157, 157, 157)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(720, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(0, 0, 740, 850);

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

        jPanelViewings.setBackground(new java.awt.Color(255, 255, 255));

        jLabelHour.setBackground(new java.awt.Color(255, 255, 255));
        jLabelHour.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelHour.setForeground(new java.awt.Color(102, 102, 255));

        jLabelDescription.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDescription.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelDescription.setForeground(new java.awt.Color(102, 102, 255));

        jLabelLocation.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLocation.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelLocation.setForeground(new java.awt.Color(102, 102, 255));

        jLabelPrice.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPrice.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelPrice.setForeground(new java.awt.Color(102, 102, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Details of the Viewing : ");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton2.setText("This visit has been done ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelViewingsLayout = new javax.swing.GroupLayout(jPanelViewings);
        jPanelViewings.setLayout(jPanelViewingsLayout);
        jPanelViewingsLayout.setHorizontalGroup(
            jPanelViewingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViewingsLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanelViewingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelViewingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelViewingsLayout.createSequentialGroup()
                            .addComponent(jLabelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26))
                        .addGroup(jPanelViewingsLayout.createSequentialGroup()
                            .addGroup(jPanelViewingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelHour, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelViewingsLayout.createSequentialGroup()
                                    .addGap(126, 126, 126)
                                    .addComponent(jButton2)))
                            .addGap(97, 97, 97)))
                    .addGroup(jPanelViewingsLayout.createSequentialGroup()
                        .addComponent(jLabelLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViewingsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(155, 155, 155))
        );
        jPanelViewingsLayout.setVerticalGroup(
            jPanelViewingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViewingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabelHour, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanelViewingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(30, 30, 30))
        );

        jPanel2.add(jPanelViewings);
        jPanelViewings.setBounds(880, 350, 620, 310);

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

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        //combo box where all the viewings of the connected buyer appear

        int tampon = 0;
        //temporary buffer

        String selected = (String) jComboBox1.getSelectedItem();
        //we get what has been selected in the combo box
        if (selected.equals("Select one of your following viewings")) {
            //if the buyer doesn't select any viewing but remains on the first option of the combo box

            jPanelViewings.hide();
            //nothing happens, so we hide the viewing panel
        } else {
            //otherwise, the buyer clicked on an option 
            for (int i = 0; i < myviewings.size(); i++) {
                //we go through the list of the personal viewings of the connected buyer 

                for (int j = 0; j < pr.size(); ++j) {
                    //we go through the all the properties of the database 
                    if (selected.equals(pr.get(j).getdescription() + " idvisit:" + myviewings.get(i).getid())) {
                        //if the selected viewing corresponds to a property of the database
                        tampon = i;
                        //we set the value of the buffer to i 
                    }
                }
            }
            this.display(myviewings.get(tampon));
            //we show the details of the viewing, through the display method, see ahead with the help of the buffer
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //back button
        this.toBack();
        //if we click on the back button
        setVisible(false);
        //this page disappears
        BuyerFirst a = new BuyerFirst(newbuyer, buyers, sellers, emp, pr, v, o);
        //we go back on the previous page
        a.setVisible(true);
        //we set the previous page visible
        new BuyerFirst(newbuyer, buyers, sellers, emp, pr, v, o).setState(java.awt.Frame.NORMAL);

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Methpd that displays all the information about one of the viewing of the buyer connected
     * @param inch is the Visit considered
     */
    public void display(Visit inch) {
        //this method has for goal to fill the fields of the viewings panel, that displays when the buyer selects one of his viewings 

        int stamp = 0;
        //temporary buffer

        for (int i = 0; i < pr.size(); ++i) {
            //we go through all the properties registered 
            if (pr.get(i).getid() == inch.getidprop()) {
                //if the viewing that has been selected corresponds to a property of the database 
                stamp = i;
                //we set the value of the buffer to i 
            }
        }

        jLabelHour.setText("Time of the visit : " + inch.gettime());
        //we set the value of the time field corresponding to the selected viewing 
        jLabelDescription.setText(" Description : " + pr.get(stamp).getdescription());
        //we set the value of the description field corresponding to the property of the selected viewing
        jLabelLocation.setText(" Location : " + pr.get(stamp).getlocation());
        //we set the value of the location field corresponding to the property of the selected viewing
        jLabelPrice.setText(" Price : " + pr.get(stamp).getprice() + "€");
        //we set the value of the price field corresponding to the property of the selected viewing

        jPanelViewings.show();
        //finally, we show the viewing panel to display all those information

    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //Log out button
        setVisible(false);
        //when this button is clicked, this page disappears
        new First(buyers, sellers, emp, pr, v, o).toFront();
        //we go back on the first page
        new First(buyers, sellers, emp, pr, v, o).setState(java.awt.Frame.NORMAL);
        new First(buyers, sellers, emp, pr, v, o).setVisible(true);
        //we set the first page visible 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //button "this visit has been done", that the buyer has to click after he has done a viewing 

        PropertyDAOImpl pdao = new PropertyDAOImpl();
        //we create an object of the PropertyDAOImpl class, to update the properties of the visited property in the database 
        VisitDAOImpl vdao = new VisitDAOImpl();
        //we create an object of the VisitDAOImpl class, to update the properties of the done viewings in the database 
        int tampon = 0;
        int tampon2 = 0;
        int tampon3 = 0;
        //3 temporary buffers 
        String selected = (String) jComboBox1.getSelectedItem();
        //we get what has been selected in the combo box of the viewings of the connected buyer 
        for (int i = 0; i < myviewings.size(); i++) {
            //we go through the list of all the viewings of the connected buyer 

            for (int j = 0; j < pr.size(); ++j) {
                //we go through all the properties of the database
                if (selected.equals(pr.get(j).getdescription() + " idvisit: " + myviewings.get(i).getid())) {
                    //if what has been selected in the combo box corresponds to the description of the property +the id of the viewing 
                    tampon = i;
                    tampon2 = j;
                    //we set the values of the two buffers to i and j respectively
                }
            }
        }
        for (int k = 0; k < v.size(); ++k) {
            //then we go through all the viewings of the database 
            if (v.get(k).getid() == myviewings.get(tampon).getid()) {
                //if the id of one of the viewing is the same as the id of one of the viewing of the connected buyer
                tampon3 = k;
                //we set the value of the third buffer to k 
            }
        }
        pr.get(tampon2).settimevisited(pr.get(tampon2).gettimevisited() + 1);
        //when the buyer clicks on "this viewing has been done", we set +1 to the times visited of the property 
        pdao.updatetv(pr.get(tampon2));
        //we update the times visited in the database 
        vdao.deleteviewing(myviewings.get(tampon));
        //because the viewing has been done, we delete it of the database viewings 
        myviewings.remove(myviewings.get(tampon));
        //we also remove it from the personal viewings of the connected buyer 
        v.remove(v.get(tampon3));
        //and we remove it from all the viewings get from the database 
        JOptionPane.showMessageDialog(null, " Thank you for this update");
        //the update has been successfull
        this.setVisible(false);
        if (myviewings.isEmpty()) {
            //if the buyer has no viewings left we go back on his first page
            BuyerFirst b = new BuyerFirst(newbuyer, buyers, sellers, emp, pr, v, o);
            b.setVisible(true);
        } else {
            //we need to reload the page so we set this on to unvisible
            BuyerViewings a = new BuyerViewings(newbuyer, buyers, sellers, emp, pr, v, o, myviewings);
            //we open a new frame of buyerViewings
            a.setVisible(true);
            //we set it visible 
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Method to fill a jComboBox with all the visits of the buyer conneceted
     */
    public void initjcb1() {
        //this function adds the viewings of the connected buyer to the jcombobox 
        for (int i = 0; i < myviewings.size(); ++i) {
            //we go through the arralist of the personal viewings of the connected buyer
            for (int j = 0; j < pr.size(); ++j) {
                //we go through all the properties of the database

                if (myviewings.get(i).getidprop() == pr.get(j).getid()) {
                    //if a viewing corresponds to the selected property 
                    jComboBox1.addItem(pr.get(j).getdescription() + " idvisit: " + myviewings.get(i).getid());
                    //we add this viewinig in the combo box
                }
            }
        }
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
            java.util.logging.Logger.getLogger(BuyerViewings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuyerViewings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuyerViewings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyerViewings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BuyerViewings(newbuyer, buyers, sellers, emp, pr, v, o, myviewings).setVisible(true);
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
    private static ArrayList<Visit> myviewings = new ArrayList<>();
    //array list of all the personal viewings of the connected buyer 

    private static Buyer newbuyer;
    //connected buyer 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelHour;
    private javax.swing.JLabel jLabelLocation;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelViewings;
    // End of variables declaration//GEN-END:variables
}
