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
public class SellerProperty extends javax.swing.JFrame {

    /**
     * Creates new form SellerProperty
     */
    public SellerProperty(Seller a, ArrayList<Buyer> b, ArrayList<Seller> s, ArrayList<Employee> e, ArrayList<Property> prop, ArrayList<Visit> vis, ArrayList<Offer> off, ArrayList<Property> myp) {
        buyers = b;//Array List of buyers
        sellers = s;//Array List of sellers
        emp = e;//Array List of employees
        pr = prop;
        v = vis;
        o = off;
        newseller = a;
        myprop = myp ; 
        
        initComponents();
        jPanelApartment.hide();
        jPanelHouse.hide();
        this.initjcb1();
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
        jPanelHouse = new javax.swing.JPanel();
        jLabelType = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jLabelNumberFloors = new javax.swing.JLabel();
        jLabelLocation1 = new javax.swing.JLabel();
        jLabelNumberRooms1 = new javax.swing.JLabel();
        jLabelNumberSurface = new javax.swing.JLabel();
        jLabelNumberBedrooms2 = new javax.swing.JLabel();
        jLabelGardenSurface = new javax.swing.JLabel();
        jLabelSwimmingPool = new javax.swing.JLabel();
        jLabelDescription = new javax.swing.JLabel();
        jPanelApartment = new javax.swing.JPanel();
        jLabelType1 = new javax.swing.JLabel();
        jLabelDescription1 = new javax.swing.JLabel();
        jLabelPrice2 = new javax.swing.JLabel();
        jLabelNumberFloors1 = new javax.swing.JLabel();
        jLabelLocation2 = new javax.swing.JLabel();
        jLabelNumberRooms2 = new javax.swing.JLabel();
        jLabelNumberSurface1 = new javax.swing.JLabel();
        jLabelNumberBedrooms3 = new javax.swing.JLabel();
        jLabelFloorNumber = new javax.swing.JLabel();
        jLabelElevator = new javax.swing.JLabel();
        jLabelParking = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectjava/logo 2 projet info.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jComboBox1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select one of your properties for sale" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Your current available properties");

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
                        .addGap(215, 215, 215))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177))))
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
                .addGap(52, 52, 52)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 311, Short.MAX_VALUE)
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

        jPanelHouse.setBackground(new java.awt.Color(255, 255, 255));

        jLabelType.setBackground(new java.awt.Color(255, 255, 255));
        jLabelType.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelType.setForeground(new java.awt.Color(0, 153, 153));
        jLabelType.setText("Type : House");

        jLabelPrice.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelPrice.setForeground(new java.awt.Color(0, 153, 153));

        jLabelNumberFloors.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelNumberFloors.setForeground(new java.awt.Color(0, 153, 153));

        jLabelLocation1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelLocation1.setForeground(new java.awt.Color(0, 153, 153));

        jLabelNumberRooms1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelNumberRooms1.setForeground(new java.awt.Color(0, 153, 153));

        jLabelNumberSurface.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelNumberSurface.setForeground(new java.awt.Color(0, 153, 153));

        jLabelNumberBedrooms2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelNumberBedrooms2.setForeground(new java.awt.Color(0, 153, 153));

        jLabelGardenSurface.setBackground(new java.awt.Color(255, 255, 255));
        jLabelGardenSurface.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelGardenSurface.setForeground(new java.awt.Color(0, 153, 153));

        jLabelSwimmingPool.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelSwimmingPool.setForeground(new java.awt.Color(0, 153, 153));

        jLabelDescription.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDescription.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelDescription.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanelHouseLayout = new javax.swing.GroupLayout(jPanelHouse);
        jPanelHouse.setLayout(jPanelHouseLayout);
        jPanelHouseLayout.setHorizontalGroup(
            jPanelHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHouseLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanelHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelType, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelGardenSurface, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumberFloors, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSwimmingPool, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumberSurface, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLocation1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumberBedrooms2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumberRooms1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanelHouseLayout.setVerticalGroup(
            jPanelHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHouseLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanelHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHouseLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelLocation1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNumberRooms1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNumberBedrooms2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNumberSurface, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelSwimmingPool, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(jPanelHouseLayout.createSequentialGroup()
                        .addComponent(jLabelType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabelGardenSurface, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNumberFloors, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel2.add(jPanelHouse);
        jPanelHouse.setBounds(780, 230, 760, 390);

        jPanelApartment.setBackground(new java.awt.Color(255, 255, 255));

        jLabelType1.setBackground(new java.awt.Color(0, 153, 153));
        jLabelType1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelType1.setForeground(new java.awt.Color(0, 153, 153));
        jLabelType1.setText("Type : Apartment");

        jLabelDescription1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDescription1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelDescription1.setForeground(new java.awt.Color(0, 153, 153));

        jLabelPrice2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelPrice2.setForeground(new java.awt.Color(0, 153, 153));

        jLabelNumberFloors1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelNumberFloors1.setForeground(new java.awt.Color(0, 153, 153));

        jLabelLocation2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelLocation2.setForeground(new java.awt.Color(0, 153, 153));

        jLabelNumberRooms2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelNumberRooms2.setForeground(new java.awt.Color(0, 153, 153));

        jLabelNumberSurface1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelNumberSurface1.setForeground(new java.awt.Color(0, 153, 153));

        jLabelNumberBedrooms3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelNumberBedrooms3.setForeground(new java.awt.Color(0, 153, 153));

        jLabelFloorNumber.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFloorNumber.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelFloorNumber.setForeground(new java.awt.Color(0, 153, 153));

        jLabelElevator.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelElevator.setForeground(new java.awt.Color(0, 153, 153));

        jLabelParking.setBackground(new java.awt.Color(255, 255, 255));
        jLabelParking.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelParking.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanelApartmentLayout = new javax.swing.GroupLayout(jPanelApartment);
        jPanelApartment.setLayout(jPanelApartmentLayout);
        jPanelApartmentLayout.setHorizontalGroup(
            jPanelApartmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelApartmentLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanelApartmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelApartmentLayout.createSequentialGroup()
                        .addGroup(jPanelApartmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNumberFloors1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelType1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFloorNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelParking, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(126, 126, 126)
                        .addGroup(jPanelApartmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelApartmentLayout.createSequentialGroup()
                                .addGroup(jPanelApartmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNumberBedrooms3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNumberRooms2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNumberSurface1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelLocation2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanelApartmentLayout.createSequentialGroup()
                                .addComponent(jLabelElevator, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(140, Short.MAX_VALUE))))
                    .addGroup(jPanelApartmentLayout.createSequentialGroup()
                        .addComponent(jLabelDescription1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(123, 123, 123))))
        );
        jPanelApartmentLayout.setVerticalGroup(
            jPanelApartmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelApartmentLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanelApartmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelApartmentLayout.createSequentialGroup()
                        .addComponent(jLabelLocation2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNumberRooms2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNumberBedrooms3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNumberSurface1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelElevator, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelApartmentLayout.createSequentialGroup()
                        .addComponent(jLabelType1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelParking, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabelPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNumberFloors1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelFloorNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabelDescription1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        jPanel2.add(jPanelApartment);
        jPanelApartment.setBounds(780, 290, 780, 390);

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
        // TODO add your handling code here:

        int tampon = 0;

        String selected = (String) jComboBox1.getSelectedItem();
        if (selected.equals("Select one of your properties for sale")) {
            
        } else {
            for (int i = 0; i < myprop.size(); i++) {
                if (selected.equals(myprop.get(i).getdescription())) {

                    tampon = i;
                }

            }
        }

        this.display(myprop.get(tampon));
    }//GEN-LAST:event_jComboBox1ActionPerformed

    
    public void display (Property nprop)
    {
        if (nprop.gettype().equals("Apartment")) {
            
            jLabelDescription1.setText(" Description : " + nprop.getdescription());
            jLabelPrice2.setText(" Price : " + Double.toString(nprop.getprice()));
            jLabelNumberFloors1.setText(" Number of floors : " + Integer.toString(nprop.getnumberfloors()));
            jLabelFloorNumber.setText(" Floor Number : " + Integer.toString(nprop.getfloornumber()));
            if (nprop.getparking() == true) {
                jLabelParking.setText(" Parking : Yes");
            } else {
                jLabelParking.setText(" Parking : No");
            }
            jLabelNumberRooms2.setText(" Number of rooms : " + Integer.toString(nprop.getnumberrooms()));
            jLabelLocation2.setText(" Location : " + nprop.getlocation());
            jLabelNumberBedrooms3.setText(" Number of bedrooms : " + Integer.toString(nprop.getnumberbedrooms()));
            jLabelNumberSurface1.setText(" Surface : " + Double.toString(nprop.getsurface()));
            if (nprop.getelevator() == true) {
                jLabelElevator.setText(" Elevator : Yes");
            } else {
                jLabelElevator.setText("Elevator : No");
            }
           jPanelApartment.show();
            jPanelHouse.hide();

        } else {
            jLabelDescription.setText(" Description : " + nprop.getdescription());
            jLabelPrice.setText(" Price : " + Double.toString(nprop.getprice()));
            jLabelNumberFloors.setText(" Number of floors : " + Integer.toString(nprop.getnumberfloors()));
            jLabelGardenSurface.setText(" Garden surface : " + Double.toString(nprop.getgardensurface()));
            jLabelLocation1.setText(" Location : " + nprop.getlocation());
            jLabelNumberRooms1.setText(" Number of rooms : " + Integer.toString(nprop.getnumberrooms()));
            jLabelNumberBedrooms2.setText(" Number of bedrooms : " + Integer.toString(nprop.getnumberbedrooms()));
            jLabelNumberSurface.setText(" Surface : " + Double.toString(nprop.getsurface()));
            if (nprop.getswimmingpool() == true) {
                jLabelSwimmingPool.setText(" Swimmingpool : Yes");
            } else {
                jLabelSwimmingPool.setText("Swimmingpool : No");
            }
            jPanelHouse.show();
            
            jPanelApartment.hide();

        }
        
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
         for (int i = 0; i < myprop.size(); i++) {

            jComboBox1.addItem(myprop.get(i).getdescription());

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
            java.util.logging.Logger.getLogger(SellerProperty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellerProperty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellerProperty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellerProperty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellerProperty(newseller, buyers, sellers, emp, pr, v, o, myprop).setVisible(true);
            }
        });
    }

    private static ArrayList<Buyer> buyers = new ArrayList<>();//array list of all the application buyers 
    private static ArrayList<Seller> sellers = new ArrayList<>();//array list of all the application sellers 
    private static ArrayList<Employee> emp = new ArrayList<>();//array list of all the application sellers 
    private static ArrayList<Property> pr = new ArrayList<>();
    private static ArrayList<Visit> v = new ArrayList<>();
    private static ArrayList<Offer> o = new ArrayList<>();
    private static ArrayList<Property> myprop = new ArrayList<>();

    private static Seller newseller;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelDescription1;
    private javax.swing.JLabel jLabelElevator;
    private javax.swing.JLabel jLabelFloorNumber;
    private javax.swing.JLabel jLabelGardenSurface;
    private javax.swing.JLabel jLabelLocation1;
    private javax.swing.JLabel jLabelLocation2;
    private javax.swing.JLabel jLabelNumberBedrooms2;
    private javax.swing.JLabel jLabelNumberBedrooms3;
    private javax.swing.JLabel jLabelNumberFloors;
    private javax.swing.JLabel jLabelNumberFloors1;
    private javax.swing.JLabel jLabelNumberRooms1;
    private javax.swing.JLabel jLabelNumberRooms2;
    private javax.swing.JLabel jLabelNumberSurface;
    private javax.swing.JLabel jLabelNumberSurface1;
    private javax.swing.JLabel jLabelParking;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelPrice2;
    private javax.swing.JLabel jLabelSwimmingPool;
    private javax.swing.JLabel jLabelType;
    private javax.swing.JLabel jLabelType1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelApartment;
    private javax.swing.JPanel jPanelHouse;
    // End of variables declaration//GEN-END:variables
}
