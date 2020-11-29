/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.SellerFirst;
import Model.Visit;
import Model.Seller;
import Model.Property;
import Controller.Offer;
import Model.Employee;
import Model.Buyer;
import java.util.ArrayList;
import projectjava.First;

/**
 *
 * @author CAP
 */
public class SellerOffer extends javax.swing.JFrame {

    /**
     * Creates new form SellerOffer
     */
    public SellerOffer(Seller a, ArrayList<Buyer> b, ArrayList<Seller> s, ArrayList<Employee> e, ArrayList<Property> prop, ArrayList<Visit> vis, ArrayList<Offer> off, ArrayList<Offer> myo) {
        buyers = b;//Array List of buyers
        sellers = s;//Array List of sellers
        emp = e;//Array List of employees
        pr = prop;
        v = vis;
        o = off;
        newseller = a;
        myoffers= myo ;
        
        initComponents();
        this.initjcb1();
        jPanelOffers.hide();
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
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanelOffers = new javax.swing.JPanel();
        jLabelDescription = new javax.swing.JLabel();
        jLabelLocation = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelRealPrice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectjava/logo 2 projet info.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jComboBox1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select one of your offers" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215))))
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
                .addGap(139, 139, 139)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE)
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
        jButton5.setBounds(1420, 30, 100, 23);

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
                .addGroup(jPanelOffersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOffersLayout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel1))
                    .addGroup(jPanelOffersLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanelOffersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanelOffersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelRealPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanelOffersLayout.setVerticalGroup(
            jPanelOffersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOffersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanelOffersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOffersLayout.createSequentialGroup()
                        .addComponent(jLabelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanelOffersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelRealPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jPanel2.add(jPanelOffers);
        jPanelOffers.setBounds(850, 300, 620, 260);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1560, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
        int tampon = 0;
        

        String selected = (String) jComboBox1.getSelectedItem();
        if (selected.equals("Select one of your offers")) {
            
            //jPanelOffer.hide();
        } else {
            for (int i = 0; i < myoffers.size(); ++i) {
                {
                    for(int j=0;j<pr.size();++j)
                    {
                        if(selected.equals(pr.get(j).getdescription()+" idoffer : "+myoffers.get(i).getid()))
                        {
                           
                            tampon=i;
                            
                        }
                    }
                }
                
                
            }
               
            this.display(myoffers.get(tampon));

            }
        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    
    public void display (Offer a)
    {
        int stamp=0;
    
        for(int i=0;i<pr.size();++i)
        {
            if(pr.get(i).getid()==a.getidprop())
            {
                stamp=i;
            }
        }
        
        jLabelDescription.setText(" Description : "+pr.get(stamp).getdescription());
        jLabelLocation.setText( " Location : "+pr.get(stamp).getlocation());
        jLabelRealPrice.setText("Price of the property : " +pr.get(stamp).getprice()+"€");
        jLabelPrice.setText ("Amount of the offer : "+a.getprice()+"€");
        
       
        jPanelOffers.show();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.toBack();//if we click on the back button
        setVisible(false);//this page disappears
        new SellerFirst(newseller, buyers, sellers, emp, pr, v, o).toFront();//we go back on the first page
        new SellerFirst(newseller, buyers, sellers, emp, pr, v, o).setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        //this.toBack();//if we click on the back button
        setVisible(false);//this page disappears
        new First(buyers, sellers, emp, pr, v, o).toFront();//we go back on the first page
        new First(buyers, sellers, emp, pr, v, o).setState(java.awt.Frame.NORMAL);
        new First(buyers, sellers, emp, pr, v, o).setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    public void initjcb1()
    {
        for(int i=0;i<myoffers.size();++i)
        {
            for(int j=0;j<pr.size();++j)
            {
                if(myoffers.get(i).getidprop()==pr.get(j).getid())
                {
                    jComboBox1.addItem(pr.get(j).getdescription()+ " idoffer : "+myoffers.get(i).getid());
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
            java.util.logging.Logger.getLogger(SellerOffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellerOffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellerOffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellerOffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellerOffer(newseller, buyers, sellers, emp, pr, v, o, myoffers).setVisible(true);
            }
        });
    }

    private static ArrayList<Buyer> buyers = new ArrayList<>();//array list of all the application buyers 
    private static ArrayList<Seller> sellers = new ArrayList<>();//array list of all the application sellers 
    private static ArrayList<Employee> emp = new ArrayList<>();//array list of all the application sellers 
    private static ArrayList<Property> pr = new ArrayList<>();
    private static ArrayList<Visit> v = new ArrayList<>();
    private static ArrayList<Offer> o = new ArrayList<>();
    private static ArrayList<Offer> myoffers = new ArrayList<>();

    private static Seller newseller;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelLocation;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelRealPrice;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelOffers;
    // End of variables declaration//GEN-END:variables
}
