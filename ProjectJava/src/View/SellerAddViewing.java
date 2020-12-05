//this class is the jframe a seller uses when he wants to add a vewing to one of his properties 
package View;

import javax.swing.JOptionPane;
import Model.Visit;
import Model.Seller;
import Model.Property;
import Model.Offer;
import Model.Employee;
import Model.Buyer;
import java.util.ArrayList;
import projectjava.First;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import Model.VisitDAOImpl;

/**
 *
 * @author CAP
 */
public class SellerAddViewing extends javax.swing.JFrame {

    /**
     * Creates new form SellerAddViewing
     */
    public SellerAddViewing(Seller a, ArrayList<Buyer> b, ArrayList<Seller> s, ArrayList<Employee> e, ArrayList<Property> prop, ArrayList<Visit> vis, ArrayList<Offer> off, ArrayList<Property> myp) {
        //constructor 
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
        myprop = myp;
        //array list of the properties belonging to the connected seller
        initComponents();
        //automatically generated constructor 
        this.initjcb1();
        //function that enables to fill the combobox with the properties of the connected seller
        jPanel1.hide();
        //in the beginning, all the other panels are hiden 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldDay = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldMonth = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldHour = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldYear = new javax.swing.JTextField();
        jTextFieldMinutes = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        jTextFieldDay.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextFieldDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDayActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add a Viewing to one of your property ");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectjava/logo 2 projet info.png"))); // NOI18N

        jButton1.setText("<= Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select one of your property to add a new viewing");

        jComboBox1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select one of your properties for sale" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jButton1)
                .addGap(87, 87, 87)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Month (MM)");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Enter the date of the viewing");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Day (dd)");

        jTextFieldMonth.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextFieldMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMonthActionPerformed(evt);
            }
        });
        jTextFieldMonth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMonthKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Year (yyyy)");

        jTextFieldHour.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextFieldHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHourActionPerformed(evt);
            }
        });
        jTextFieldHour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldHourKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Hour (hh)");

        jButton2.setText("Validate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Minutes (mm)");

        jTextFieldYear.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextFieldYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldYearActionPerformed(evt);
            }
        });
        jTextFieldYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldYearKeyTyped(evt);
            }
        });

        jTextFieldMinutes.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextFieldMinutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMinutesActionPerformed(evt);
            }
        });
        jTextFieldMinutes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldMinutesKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMinutesKeyTyped(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 328, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(271, 271, 271))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldMonth, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(jTextFieldHour, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(jTextFieldYear, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(jTextFieldMinutes, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(410, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jButton2)
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(401, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(800, 260, 670, 450);

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
        //we set the new frame visible 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //back button
        this.toBack();
        //if we click on the back button
        setVisible(false);
        //this page disappears
        SellerFirst a = new SellerFirst(newseller, buyers, sellers, emp, pr, v, o);
        //we go back on the first page
        a.setVisible(true);
        //we set the frame visible 
        new SellerFirst(newseller, buyers, sellers, emp, pr, v, o).setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        //combo box where all the properties belonging to the connected seller are displayed
        String selected = (String) jComboBox1.getSelectedItem();
        //we get what has been selected
        if (selected.equals("Select one of your properties for sale")) {
        //if the seller doesn't select any option but remains on the first option of the combo box
            jPanel1.hide();
            //nothing happens so we hide all the other panels

        } else {
            //otherwise, the seller selected a property 
            jPanel1.show();
            //the panel to add the viewing is displayed 
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextFieldMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMonthActionPerformed
        //text field for the month of the viewing
    }//GEN-LAST:event_jTextFieldMonthActionPerformed

    private void jTextFieldHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHourActionPerformed
        //text field for the hour of the viewing
    }//GEN-LAST:event_jTextFieldHourActionPerformed

    private void jTextFieldYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldYearActionPerformed
        //text field for the year of the viewing
    }//GEN-LAST:event_jTextFieldYearActionPerformed

    private void jTextFieldMinutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMinutesActionPerformed
        //text field for the minutes of the viewing
    }//GEN-LAST:event_jTextFieldMinutesActionPerformed

    private void jTextFieldMonthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMonthKeyTyped
        //function that unables the user to enter something else than digit (because we want a month)
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldMonthKeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        //function that unables the user to enter something else than digit (because we want a day)
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextFieldYearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldYearKeyTyped
        //function that unables the user to enter something else than digit (because we want a year)
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldYearKeyTyped

    private void jTextFieldHourKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldHourKeyTyped
        //function that unables the user to enter something else than digit (because we want an hour)
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldHourKeyTyped

    private void jTextFieldMinutesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMinutesKeyPressed
        //text field for the minutes of the viewing
    }//GEN-LAST:event_jTextFieldMinutesKeyPressed

    private void jTextFieldMinutesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMinutesKeyTyped
        //function that unables the user to enter something else than digit (because we want a minute)
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldMinutesKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //button add a viewing once all the fields have been selected
        Date date = new Date();
        //we create a date object with no argument so it is the current date
        Timestamp ts = new Timestamp(date.getTime());
        //we create an object of time stamp, that enables to get the date in the same format that the one in our database. We get as the attribute date.gettime() which
        //is the time that passed from the current date since 1970 1 january
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //we will use this format for the time of the aded viewing : yyyy-MM-dd hh:mm:ss

        int tampon = 0;
        int tampon2 = 0;
        int c;
        //temporary buffers

        String selected = (String) jComboBox1.getSelectedItem();
        //we get what has been selected 
        for (int i = 0; i < myprop.size(); i++) {
        //we go through the properties that belong to the connected sller
            if (selected.equals(myprop.get(i).getdescription() + " idproperty : " + myprop.get(i).getid())) {
            //if what is selected corresponds to the description + the id of the coresponding property 
                tampon = i;
                //we set the value of the buffer to i 
            }
        }
        for (int j = 0; j < pr.size(); ++j) {
            //we go through the array list of the properties of the app
            if (pr.get(j).getid() == myprop.get(tampon).getid()) {
                //if the id of the property is the same id as the proeprty of the seller
                tampon2 = j;
                //we set the value of the second buffer to j 
            }
        }
        int size = emp.size() - 1;
        //we need to set an employee that will supervise the viewing
        int randomnumber = 0 + (int) (Math.random() * ((size - 0) + 1));
        //we define this employee randomly

        if (jTextFieldYear.getText().trim().isEmpty() || jTextFieldMonth.getText().trim().isEmpty() || jTextField1.getText().trim().isEmpty() || jTextFieldHour.getText().trim().isEmpty() || jTextFieldMinutes.getText().trim().isEmpty()) {
        //if one or several fields of the date are empty 
            JOptionPane.showMessageDialog(null, "One or several fields are empty. Please, try again.");
            //we let it know
        } else {
            //otherwise, all the fields have been filled 
            if (jTextFieldYear.getText().length() != 4 || jTextFieldMonth.getText().length() != 2 || jTextField1.getText().length() != 2 || jTextFieldHour.getText().length() != 2 || jTextFieldMinutes.getText().length() != 2) {
                //here, the date format has not been repected : yyyy-MM-dd hh:mm:ss
                JOptionPane.showMessageDialog(null, "Wrong date format");
                //if it is not respected we let it know 
            } else {
                //otherwise, the format is good
                if (Integer.parseInt(jTextFieldMonth.getText()) > 12 || Integer.parseInt(jTextFieldMonth.getText()) < 1 || Integer.parseInt(jTextField1.getText()) > 31 || Integer.parseInt(jTextField1.getText()) < 1 || Integer.parseInt(jTextFieldHour.getText()) > 23 || Integer.parseInt(jTextFieldMinutes.getText()) > 59) {
                    //we make sure the month is not bigger than 12, the days are not bigger than 31, the hour is not bigger than 23 etc 
                    JOptionPane.showMessageDialog(null, " Impossible date");
                    //if it is not repecting those conditions, we let it know
                } else {
                    //otherwise, the dates are the good format and respect the previous conditions 
                    if ((jTextFieldMonth.getText().equals("02") || jTextFieldMonth.getText().equals("04") || jTextFieldMonth.getText().equals("06") || jTextFieldMonth.getText().equals("09") || jTextFieldMonth.getText().equals("11")) && (jTextField1.getText().equals("31"))) {
                        //if the user selects the 31 of february, or 31st of april... (which are days that do not exist)
                        JOptionPane.showMessageDialog(null, " This date doesn't exist");
                        //we let it know 
                    } else {
                        //all the fields are filled correctly, we can finally save the date of the viewing 
                        String newd = (jTextFieldYear.getText() + "-" + jTextFieldMonth.getText() + "-" + jTextField1.getText() + " " + jTextFieldHour.getText() + ":" + jTextFieldMinutes.getText() + ":00");
                        //we create a String date by getting all the fields and adding some "-" between the fields to respect this format : yyyy-MM-dd hh:mm:ss
                        try {
                            Date dateparse = sdf.parse(newd);
                            //we convert the string date that was written in the viewing panel to the good format : yyyy-MM-dd hh:mm:ss
                            Timestamp d = new Timestamp(dateparse.getTime());
                            //we transform the date in a timetsamp object and we send in parameter the time in ms that passed since 1970
                            c = d.compareTo(ts);
                            //c compares the date d of the viewing to the current date 
                            if (c < 0) {
                                //if, c is negative, it means the date of the viewing is before the current date 
                                JOptionPane.showMessageDialog(null, "Date already passed");
                                //it means the entered date is passed
                            } else {
                                //otherwise, all the conditions are fine to register the date of the viewng 
                                v.add(new Visit(v.get(v.size() - 1).getid() + 1, -1, pr.get(tampon2).getid(), emp.get(randomnumber).getid(), d, 30));
                                //so we add the new viewing in the array list of all the viewngs of the application
                                VisitDAOImpl vdao = new VisitDAOImpl();
                                //we create an object of the VisitDAOImpl class, to create the viewing in the database
                                vdao.addvisit(v.get(v.size() - 1));
                                //we add the viewing to the database
                                JOptionPane.showMessageDialog(null, "Viewing added");
                                //the update worked
                                this.setVisible(false);
                                //we need to regenerate this frame, so we close this one
                                SellerAddViewing a = new SellerAddViewing(newseller, buyers, sellers, emp, pr, v, o, myprop);
                                //we open a new frame to regenerate 
                                a.setVisible(true);
                                //we set the new frame visible 
                            }
                        } catch (ParseException e) {
                            //possible exception
                            e.printStackTrace();
                        }                        
                    }
                }
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDayActionPerformed
        //text field corresponding of the date of the viewing
    }//GEN-LAST:event_jTextFieldDayActionPerformed

    public void initjcb1() {
        //function that enables to fill the combobox with the properties of the connected seller
        for (int i = 0; i < myprop.size(); ++i) {
            //we go through all the properties of the connected seller 

            jComboBox1.addItem(myprop.get(i).getdescription() + " idproperty : " + myprop.get(i).getid());
            //we add his properties one by one 
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
            java.util.logging.Logger.getLogger(SellerAddViewing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellerAddViewing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellerAddViewing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellerAddViewing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SellerAddViewing(newseller, buyers, sellers, emp, pr, v, o, myprop).setVisible(true);
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

    private static ArrayList<Property> myprop = new ArrayList<>();
    //array list of all the personal properties of the connnected seller

    private static Seller newseller;
    //current connected seller 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldDay;
    private javax.swing.JTextField jTextFieldHour;
    private javax.swing.JTextField jTextFieldMinutes;
    private javax.swing.JTextField jTextFieldMonth;
    private javax.swing.JTextField jTextFieldYear;
    // End of variables declaration//GEN-END:variables
}
