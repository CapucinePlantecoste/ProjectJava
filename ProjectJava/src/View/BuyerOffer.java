//this class is the frame which the buyer seees when he wants to consult his offers
package View;

import Model.Visit;
import Model.Seller;
import Model.Property;
import Model.Offer;
import Model.Employee;
import Model.Buyer;
import java.util.ArrayList;
import projectjava.First;

/**
 *
 * @author CAP
 */
public class BuyerOffer extends javax.swing.JFrame {

    /**
     * Creates new form BuyerOffer
     */
    public BuyerOffer(Buyer a, ArrayList<Buyer> b, ArrayList<Seller> s, ArrayList<Employee> e, ArrayList<Property> prop, ArrayList<Visit> vis, ArrayList<Offer> off, ArrayList<Offer> myo) {
        //constructor of the class
        buyers = b;
        //Array List of buyers
        sellers = s;
        //Array List of sellers
        emp = e;
        //Array List of employees
        pr = prop;
        //Array List of properties
        v = vis;
        //Array List of viewings
        o = off;
        //Array List of offers

        newbuyer = a;
        //the buyer who is connected 

        myoffers = myo;
        //the arraylist of the offers corresponding to this particular buyer

        initComponents();
        //automatically generated constructor
        this.initjcb1();
        //function that enables to fill the combobox with the offers of the buyer
        jPanelOffers.hide();
        //we hide the panel showing the details of the offers 
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
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanelOffers = new javax.swing.JPanel();
        jLabelDescription = new javax.swing.JLabel();
        jLabelLocation = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelRealPrice = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectjava/logo 2 projet info.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jComboBox1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select one of your following offers" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Your offers ");

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
                .addContainerGap(188, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(253, 253, 253))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))))
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
                .addGap(44, 44, 44)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
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

        jPanelOffers.setBackground(new java.awt.Color(255, 255, 255));

        jLabelDescription.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDescription.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelDescription.setForeground(new java.awt.Color(0, 153, 153));

        jLabelLocation.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLocation.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelLocation.setForeground(new java.awt.Color(0, 153, 153));

        jLabelPrice.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPrice.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelPrice.setForeground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Details of the Offer : ");

        jLabelRealPrice.setBackground(new java.awt.Color(255, 255, 255));
        jLabelRealPrice.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelRealPrice.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanelOffersLayout = new javax.swing.GroupLayout(jPanelOffers);
        jPanelOffers.setLayout(jPanelOffersLayout);
        jPanelOffersLayout.setHorizontalGroup(
            jPanelOffersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOffersLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanelOffersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelOffersLayout.createSequentialGroup()
                        .addComponent(jLabelPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelRealPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelOffersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelOffersLayout.createSequentialGroup()
                            .addGap(176, 176, 176)
                            .addComponent(jLabel1))
                        .addComponent(jLabelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanelOffersLayout.setVerticalGroup(
            jPanelOffersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOffersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanelOffersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOffersLayout.createSequentialGroup()
                        .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addComponent(jLabelRealPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel2.add(jPanelOffers);
        jPanelOffers.setBounds(890, 340, 620, 260);

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
        //the combo box that displays all the offers belonging to the connected buyer

        int tampon = 0;
        //temporary buffer 

        String selected = (String) jComboBox1.getSelectedItem();
        //we get what has been selected in the combobox
        if (selected.equals("Select one of your following offers")) {
            //if Select One of your following offers has been selected

            jPanelOffers.hide();
            //we do not show anything but the actual combo box
        } else {
            //otherwise
            for (int i = 0; i < myoffers.size(); i++) {
                //we go through all the offers belonging to the connected buyer
                {
                    for (int j = 0; j < pr.size(); ++j) //we go through all the properties of the database 
                    {
                        if (selected.equals(pr.get(j).getdescription() + " idoffer : " + myoffers.get(i).getid())) //if the selected offer corresponds to a property of the database 
                        {
                            tampon = i;
                            //we set the value of the buffer to i 
                        }
                    }
                }
            }
            this.display(myoffers.get(tampon));
            //we show the details of the offer, through the display method, see behind with the help of the buffer
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public void display(Offer a) //method that enables to show the details of an offer once selected 
    {
        int stamp = 0;
        //temporary buffer 

        for (int i = 0; i < pr.size(); ++i) //we go through all the properties of the database 
        {
            if (pr.get(i).getid() == a.getidprop()) //if the offer that has been selected corresponds to a property of the database 
            {
                stamp = i;
                //we set the buffer to i
            }
        }

        jLabelDescription.setText(" Description : " + pr.get(stamp).getdescription());
        //we set Text to the description field, to show more details about the selected offer
        jLabelLocation.setText(" Location : " + pr.get(stamp).getlocation());
        //we set Text to the location field, to show more details about the selected offer
        jLabelPrice.setText("Amount : " + a.getprice() + "€");
        //we set Text to the amount of the offer field, to show more details about the selected offer
        jLabelRealPrice.setText("Price of the property : " + pr.get(stamp).getprice() + "€");
        //we set Text to the price field, to show more details about the selected offer
        if (a.getaccepted() == true && a.getdeclined() == false) //we want to show if the offer has been accepted or declined
        {
            jLabel3.setText(" Status of the offer : Accepted ");
            //if it has been accepted, we show it
        } else if (a.getaccepted() == false && a.getdeclined() == true) {
            jLabel3.setText(" Status of the offer : Declined");
            //if it has been declined, we show it 
        } else if (a.getaccepted() == false && a.getdeclined() == false) {
            jLabel3.setText(" Status of the offer : Not treated");
            //if it has not been accepted nor declined, it is not treated
        }
        jPanelOffers.show();
        //after all the fields have been filled, we show the panel offer 

    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //back Button 
        this.toBack();
        //if we click on the back button
        setVisible(false);
        //this page disappears
        BuyerFirst a = new BuyerFirst(newbuyer, buyers, sellers, emp, pr, v, o);
        a.setVisible(true);
        //we go back on the previous page
        new BuyerFirst(newbuyer, buyers, sellers, emp, pr, v, o).setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //Log out button
        setVisible(false);
        // if we click on this button, this page disappears
        new First(buyers, sellers, emp, pr, v, o).toFront();
        //we go back on the first page
        new First(buyers, sellers, emp, pr, v, o).setState(java.awt.Frame.NORMAL);
        new First(buyers, sellers, emp, pr, v, o).setVisible(true);
        //we set it to visible 
    }//GEN-LAST:event_jButton5ActionPerformed

    public void initjcb1() {
        //function that enables to add the offers of the connected buyer to the jcombobox
        for (int i = 0; i < myoffers.size(); ++i) {
            //we go through all the offers belonging to the connected customer 
            for (int j = 0; j < pr.size(); ++j) {
                //we go through all the properties contained in the database 

                if (myoffers.get(i).getidprop() == pr.get(j).getid()) {
                    //if an offer corresponds to the selected property 
                    jComboBox1.addItem(pr.get(j).getdescription() + " idoffer : " + myoffers.get(i).getid());
                    //we add this offer to the jcombobox
                }
            }
        }
        //here, all the offers of the connected buyer will be displayed in the combox
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
            java.util.logging.Logger.getLogger(BuyerOffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuyerOffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuyerOffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyerOffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BuyerOffer(newbuyer, buyers, sellers, emp, pr, v, o, myoffers).setVisible(true);
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
    private static ArrayList<Offer> myoffers = new ArrayList<>();
    //array list of all the offers belonging to the connected buyer 

    private static Buyer newbuyer;
    //buyer connected 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelLocation;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelRealPrice;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelOffers;
    // End of variables declaration//GEN-END:variables
}
