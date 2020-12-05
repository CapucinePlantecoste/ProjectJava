//this class is the frame employees see when they remove a sold property
package View;

import Model.Buyer;
import Model.Employee;
import Model.Offer;
import Model.Property;
import Model.PropertyDAOImpl;
import Model.Seller;
import Model.Visit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import projectjava.First;

/**
 *
 * @author CAP
 */
public class EmployeeRemoveSoldProperty extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeRemoveSoldProperty
     */
    public EmployeeRemoveSoldProperty(Employee coucou, ArrayList<Buyer> b, ArrayList<Seller> s, ArrayList<Employee> e, ArrayList<Property> prop, ArrayList<Visit> vis, ArrayList<Offer> off, ArrayList<Property> sp) {
        //constructor of the application 
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

        employee = coucou;
        //current connected employee
        soldProperties = sp;
        //arraylist of the sold properties of the application 

        initComponents();
        //automatically generated constructor
        initjcb1();
        //function that enables to fill the combobox with the sold properties of the application

        jPanel10.hide();
        //in the beginning, all the other panels are hidden 
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
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabelidProperty = new javax.swing.JLabel();
        jLabelidSeller = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jLabelDescription1 = new javax.swing.JLabel();
        jLabelLocation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(1090, 100, 60, 100);

        jPanel4.setBackground(new java.awt.Color(255, 153, 102));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectjava/logo 2 projet info.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Remove Sold Properties");

        jButton1.setText("<= Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a property to remove" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addGap(227, 227, 227)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
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

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 102));
        jLabel6.setText("Price (in €)");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 153, 102));
        jLabel13.setText("Location");

        jLabel20.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 153, 102));
        jLabel20.setText("Id Property");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 153, 102));
        jLabel31.setText("Description");

        jLabel32.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 153, 102));
        jLabel32.setText("Id Seller");

        jLabelidProperty.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabelidSeller.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabelPrice.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabelDescription1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabelLocation.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 310, Short.MAX_VALUE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabelPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(50, 50, 50)))
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelLocation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(113, 113, 113))))
                            .addComponent(jLabelDescription1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelidProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelidSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelidProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelidSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDescription1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jPanel2.add(jPanel10);
        jPanel10.setBounds(890, 270, 490, 350);

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
        //back button
        this.toBack();
        //if we click on the back button
        setVisible(false);
        //this page disappears
        EmployeeFirst a = new EmployeeFirst(employee, buyers, sellers, emp, pr, v, o);
        //we go back on the previous page
        a.setVisible(true);
        //we set the previous page visible 
        new EmployeeFirst(employee, buyers, sellers, emp, pr, v, o).setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //log out button
        this.toBack();
        //if we click on the button
        setVisible(false);
        //this page disappears
        new First(buyers, sellers, emp, pr, v, o).toFront();
        //we go back on the first page
        new First(buyers, sellers, emp, pr, v, o).setState(java.awt.Frame.NORMAL);
        new First(buyers, sellers, emp, pr, v, o).setVisible(true);
        //we set the first page visible
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        //combo box where the sold properties appear so that the employee can remove it 
        int tampon = -1;
        //temporary buffer 
        String selected = (String) jComboBox1.getSelectedItem();
        //we get what has been selected from the combo box of the sol properties
        if (selected.equals("Select a property to remove")) {
            //if the employee doesn't select any option but remains on the first option of the combo box
            jPanel10.hide();
            //nothing happens, so we hide the next panel
        } else //if the employee selected one of the sold property displayed in the combo box
        {
            for (int i = 0; i < pr.size(); ++i) //we go through all the properties of the application 
            {
                if ((pr.get(i).getdescription() + " id : " + pr.get(i).getid()).equals(selected)) //if what is selected corresponds to the description + the id of a property in the arraylist
                {
                    tampon = i;
                    //we set the value of the buffer to i 
                }
            }
            this.display(pr.get(tampon));
            //we display the information of the property once it is selected via the display function 
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //button remove the sold property once a property has been selected 
        int tampon = -1;
        int tampon2 = -1;
        //two temporary buffers 
        PropertyDAOImpl pdao = new PropertyDAOImpl();
        //we create an object of the PropertyDAOImpl class, to remove the property later in the database
        String selected = (String) jComboBox1.getSelectedItem();
        //we get what has been selected in the combo box
        for (int i = 0; i < pr.size(); ++i) //we go through all the properties of the application 
        {
            if ((pr.get(i).getdescription() + " id : " + pr.get(i).getid()).equals(selected)) //if what is selected corresponds to the description + the id of a property contained in the arraylist 
            {
                tampon = i;
                //we set the value of the buffer to i 
            }
        }
        for (int l = 0; l < soldProperties.size(); ++l) //we go through the sold properties arraylist 
        {
            if (soldProperties.get(l).getid() == pr.get(tampon).getid()) //if the id of the sold property considered is the same id as the property considered  
            {
                tampon2 = l;
                //we set the value of the second buffer to 1
            }
        }
        pdao.deleteproperty(pr.get(tampon));
        //we delete the property in the database thanks to the function delete property in dao
        for (int j = 0; j < v.size(); ++j) //if the property has been deleted, we need to remove everything that is related to it like the viewings 
        //we go through the viewings of the application
        {
            if (v.get(j).getidprop() == pr.get(tampon).getid()) //if the id of the property of the considered viewing is the same id as the removed property 
            {
                v.remove(v.get(j));
                //we remove the viewing thanks to the remove function 
            }
        }
        for (int k = 0; k < o.size(); ++k) //if the property has been deleted, we need to remove everything that is related to it like the offers
        //we go through the offers of the application    
        {
            if (o.get(k).getidprop() == pr.get(tampon).getid()) //if the id of the property of the considered offer is the same id as the removed property 
            {
                o.remove(o.get(k));
                //we remove the offer thanks to the remove function
            }
        }
        pr.remove(pr.get(tampon));
        //after this manipulations, we can finally remove the property from the array list 
        soldProperties.remove(soldProperties.get(tampon2));
        //we also remove the sold property from the sold property array list 
        JOptionPane.showMessageDialog(null, " This property has been removed from the app");
        //we show it as worked 
        this.setVisible(false);
        if (soldProperties.isEmpty()) {
            //if there are no other sale properties to deal with we go back on the first page of the employee
            EmployeeFirst b = new EmployeeFirst(employee, buyers, sellers, emp, pr, v, o);
            b.setVisible(true);
        } else {
            //we need to refresh the frame so we close this one
            EmployeeRemoveSoldProperty a = new EmployeeRemoveSoldProperty(employee, buyers, sellers, emp, pr, v, o, soldProperties);
            //we create a new frame to regenerate this one
            a.setVisible(true);
            //we set the new frame visible     
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void initjcb1() {
        //this function adds the soldproperties of the application to the jcombobox 
        for (int i = 0; i < soldProperties.size(); ++i) {
            //we go through the sold properties of the application 
            jComboBox1.addItem(soldProperties.get(i).getdescription() + " id : " + soldProperties.get(i).getid());
            //we add every sold properties to the combobox
        }
    }

    public void display(Property a) //this method has for goal to fill the fields of the property panel, that displays when the employee selects one of the viewings for sale 
    {
        jLabelDescription1.setText(a.getdescription());
        //we fill the field of the description with the corresponding value
        jLabelidSeller.setText(Integer.toString(a.getidseller()));
        //we fill the field of the id of the seller with the corresponding value
        jLabelidProperty.setText(Integer.toString(a.getid()));
        //we fill the field of the id of the property with the corresponding value
        jLabelPrice.setText(Double.toString(a.getprice()));
        //we fill the field of the price with the corresponding value
        jLabelLocation.setText(a.getlocation());
        //we fill the field of the location with the corresponding value
        jPanel10.show();
        //we can finally show the panel with all the information about the sold property to remove 
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
            java.util.logging.Logger.getLogger(EmployeeRemoveSoldProperty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeRemoveSoldProperty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeRemoveSoldProperty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeRemoveSoldProperty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EmployeeRemoveSoldProperty(employee, buyers, sellers, emp, pr, v, o, soldProperties).setVisible(true);
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
    private static ArrayList<Property> soldProperties = new ArrayList<>();
    //array list of all the properties for sale

    private static Employee employee;
    //connected employee
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelDescription1;
    private javax.swing.JLabel jLabelLocation;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelidProperty;
    private javax.swing.JLabel jLabelidSeller;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
