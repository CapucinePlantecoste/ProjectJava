//rhis frame is the frame that the employee sees when he wants to add a viewing to one of the properties 
package View;

import Model.Buyer;
import Model.Employee;
import Model.Offer;
import Model.Property;
import Model.Seller;
import Model.Visit;
import Model.VisitDAOImpl;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *Class EmployeeAddViewing that allows an Employee to add a viewing (and display the appropriate JFrame)
 * @author CAP
 */
public class EmployeeAddViewing extends javax.swing.JFrame {

     /**
     * Constructor of the class
     *
     * @param coucou is the Employee who is connected
     * @param b is the ArrayList of all the buyers of the app
     * @param s is the ArrayList of all the sellers of the app
     * @param e is the ArrayList of all the employees of the app
     * @param prop is the ArrayList of all the properties of the app
     * @param vis is the ArrayList of all the visits of the app
     * @param off is the ArrayList of all the offers of the app
     */
    public EmployeeAddViewing(Employee coucou, ArrayList<Buyer> b, ArrayList<Seller> s, ArrayList<Employee> e, ArrayList<Property> prop, ArrayList<Visit> vis, ArrayList<Offer> off) {
        //constructor of the class
        buyers = b;
        //Array List of all the registered buyers
        sellers = s;
        //Array List of all the registered sellers
        emp = e;
        //Array List of all the registered employees
        pr = prop;
        //Array List of all the registered properties
        v = vis;
        //Array List of all the registered viewings
        o = off;
        //Array List of all the registered offers 

        employee = coucou;
        //curent connected employee 

        initComponents();
        //automatically generated constructor for components 
        initjcb1();
        //function that enables to fill the combobox with the properties of the application
        jPanelViewing.hide();
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
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        jPanelViewing = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldHour = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldYear = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldMonth = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldMinutes = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(1090, 100, 60, 100);

        jPanel4.setBackground(new java.awt.Color(255, 153, 102));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectjava/logo 2 projet info.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add a Viewing to a Property");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select one of the properties to add a new viewing");

        jButton1.setText("<= Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select one of the properties for sale" }));
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
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(115, 115, 115))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addGap(140, 140, 140)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addGap(44, 44, 44)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
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
        jButton5.setBounds(1360, 100, 100, 23);

        jPanelViewing.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 102));
        jLabel4.setText("Enter the date of the viewing");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 102));
        jLabel6.setText("Day (dd)");

        jTextFieldHour.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextFieldHour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldHourKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 102));
        jLabel7.setText("Month (MM)");

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

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 102));
        jLabel8.setText("Year (yyyy)");

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

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 102));
        jLabel9.setText("Hour (hh)");

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

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 102));
        jLabel10.setText("Minutes (mm)");

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

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton2.setText("Validate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelViewingLayout = new javax.swing.GroupLayout(jPanelViewing);
        jPanelViewing.setLayout(jPanelViewingLayout);
        jPanelViewingLayout.setHorizontalGroup(
            jPanelViewingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViewingLayout.createSequentialGroup()
                .addGroup(jPanelViewingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelViewingLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelViewingLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(jPanelViewingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelViewingLayout.createSequentialGroup()
                                .addGroup(jPanelViewingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(jPanelViewingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldHour, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelViewingLayout.createSequentialGroup()
                                .addGroup(jPanelViewingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelViewingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldYear, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViewingLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
        );
        jPanelViewingLayout.setVerticalGroup(
            jPanelViewingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViewingLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanelViewingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(26, 26, 26)
                .addGroup(jPanelViewingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanelViewingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldYear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanelViewingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHour, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelViewingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanelViewing);
        jPanelViewing.setBounds(940, 310, 520, 470);

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
        //we go back on the first page
        a.setVisible(true);
        //we set visible the previous page 
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
        //combo box where all the properties available for sale are displayed, so that the employee can select one and add to it a viewing
        String selected = (String) jComboBox1.getSelectedItem();
        //we get the proeprty that has been selected 
        if (selected.equals("Select one of the properties for sale")) {
            //if the employee doesn't select any property but remains on the first option of the combo box
            jPanelViewing.hide();
            //nothing happens, the panels remain hidden
        } else //otherwise, the employee selected a property option 
        {
            jPanelViewing.show();
            //we show the viewing panel, that asks for a date for the viewing to add
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextFieldHourKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldHourKeyTyped
        //function that unables the user to enter something else than digit (because we want an hour)
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldHourKeyTyped

    private void jTextFieldYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldYearActionPerformed
        //text field for the year of the viewing to add
    }//GEN-LAST:event_jTextFieldYearActionPerformed

    private void jTextFieldYearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldYearKeyTyped
        //function that unables the user to enter something else than digit (because we want a year)
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldYearKeyTyped

    private void jTextFieldMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMonthActionPerformed
        //text field for the month of the viewing to add
    }//GEN-LAST:event_jTextFieldMonthActionPerformed

    private void jTextFieldMonthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMonthKeyTyped
        //function that unables the user to enter something else than digit (because we want a month)
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldMonthKeyTyped

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        //text field for the day of the viewing to add 
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        //function that unables the user to enter something else than digit (because we want a day)
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextFieldMinutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMinutesActionPerformed
        //text field for the minutes of the viewing to add
    }//GEN-LAST:event_jTextFieldMinutesActionPerformed

    private void jTextFieldMinutesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMinutesKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMinutesKeyPressed

    private void jTextFieldMinutesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMinutesKeyTyped
        //function that unables the user to enter something else than digit (because we want a minute)
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldMinutesKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //button validate the viewing
        Date date = new Date();
        //we create a date object with no arguments so that it is the current date
        Timestamp ts = new Timestamp(date.getTime());
        //we create an object of time stamp, that enables to have the same type as in the database
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //we will use this format for the time of the aded viewing : yyyy-MM-dd hh:mm:ss

        int tampon = -1;
        //temporary buffer 
        int c;
        //temporary variable 

        String selected = (String) jComboBox1.getSelectedItem();
        //we get what has been selected in the combo box of all the properties 
        for (int i = 0; i < pr.size(); i++) {
            //we go through all the properties of the application 
            if (selected.equals(pr.get(i).getdescription() + " idproperty : " + pr.get(i).getid())) {
                //if what has been selected corresponds to the description + the id of one of the property of the application 
                tampon = i;
                //we set the value of the buffer to i
            }
        }
        if (jTextFieldMonth.getText().trim().isEmpty() || jTextFieldYear.getText().trim().isEmpty() || jTextFieldHour.getText().trim().isEmpty() || jTextField1.getText().trim().isEmpty() || jTextFieldMinutes.getText().trim().isEmpty()) {
            //if one or several fields of the date are empty    
            JOptionPane.showMessageDialog(null, "One or several fields are empty. Please, try again.");
            //we let it know 
        } else {
            //otherwise, all the fields have been filled 
            if (jTextFieldYear.getText().length() != 4 || jTextFieldMonth.getText().length() != 2 || jTextFieldHour.getText().length() != 2 || jTextField1.getText().length() != 2 || jTextFieldMinutes.getText().length() != 2) {
                //here, the date format has not been repected : yyyy-MM-dd hh:mm:ss
                JOptionPane.showMessageDialog(null, "Wrong date format");
                //if it is not respected we let it know 
            } else {
                //otherwise, the format is good 
                if (Integer.parseInt(jTextFieldMonth.getText()) > 12 || Integer.parseInt(jTextFieldMonth.getText()) < 1 || Integer.parseInt(jTextField1.getText()) > 31 || Integer.parseInt(jTextField1.getText()) < 1 || Integer.parseInt(jTextFieldHour.getText()) > 23 || Integer.parseInt(jTextFieldMinutes.getText()) > 59) {
                    //we make sure the month is not bigger than 12, the days are not bigger than 31, the hour is not bigger than 23 etc    
                    JOptionPane.showMessageDialog(null, " Impossible date");
                    //if it is not repecting those conditions, we let it know 
                } else //otherwise, the dates are the good format and respect the previous conditions 
                {
                    if ((jTextFieldMonth.getText().equals("02") || jTextFieldMonth.getText().equals("04") || jTextFieldMonth.getText().equals("06") || jTextFieldMonth.getText().equals("09") || jTextFieldMonth.getText().equals("11")) && (jTextField1.getText().equals("31"))) //if the user selects the 31 of february, or 31st of april... (which are days that do not exist)
                    {
                        JOptionPane.showMessageDialog(null, " This date doesn't exist");
                        //we let it know 
                    } else //all the fields are filled correctly, we can finally save the date of the viewing 
                    {
                        String newd = (jTextFieldYear.getText() + "-" + jTextFieldMonth.getText() + "-" + jTextField1.getText() + " " + jTextFieldHour.getText() + ":" + jTextFieldMinutes.getText() + ":00");
                        //we create a new string by getting all the fields and adding some "-" between the fields to respect this format : yyyy-MM-dd hh:mm:ss
                        try {
                            Date dateparse = sdf.parse(newd);
                            //we convert the date (in string) to a date  written in the viewing panel with the good format : yyyy-MM-dd hh:mm:ss
                            Timestamp d = new Timestamp(dateparse.getTime());
                            //we transform the date in a timetsamp object and we send in parameter the time in ms that passed since 1970
                            c = d.compareTo(ts);
                            //c compares the date d of the viewing to the current date 
                            if (c < 0) //if, c is negative, it means the date of the viewing is before the current date  
                            {
                                JOptionPane.showMessageDialog(null, "Date already passed");
                                //it means the entered date is passed
                            } else //otherwise, all the conditions are fine to register the date of the viewng 
                            {
                                v.add(new Visit(v.get(v.size() - 1).getid() + 1, -1, pr.get(tampon).getid(), employee.getid(), d, 30));
                                //so we add the new viewing in the array list of all the viewngs of the application
                                VisitDAOImpl vdao = new VisitDAOImpl();
                                //we create an object of the VisitDAOImpl class, to create the viewing in the database 
                                vdao.addvisit(v.get(v.size() - 1));
                                //we add the viewing to the database
                                JOptionPane.showMessageDialog(null, "Viewing added");
                                //the update worked
                                this.setVisible(false);
                                //we need to regenerate this frame, so we close this one
                                EmployeeAddViewing a = new EmployeeAddViewing(employee, buyers, sellers, emp, pr, v, o);
                                //we open a new frame to regenerate 
                                a.setVisible(true);
                                //we set the new frame visible 
                            }
                        } catch (ParseException e) //possible parsing exception
                        {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Method that fills a jComboBox with all the properties of the app
     */
    public void initjcb1() {
        //this function adds the properties of the application to the jcombobox 
        for (int i = 0; i < pr.size(); ++i) {
            //we go through all the poperties registered in the application

            jComboBox1.addItem(pr.get(i).getdescription() + " idproperty : " + pr.get(i).getid());
            //we add every property to the combo box
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
            java.util.logging.Logger.getLogger(EmployeeAddViewing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeAddViewing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeAddViewing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeAddViewing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EmployeeAddViewing(employee, buyers, sellers, emp, pr, v, o).setVisible(true);
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
    private static Employee employee;
    //connected employee
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanelViewing;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldHour;
    private javax.swing.JTextField jTextFieldMinutes;
    private javax.swing.JTextField jTextFieldMonth;
    private javax.swing.JTextField jTextFieldYear;
    // End of variables declaration//GEN-END:variables
}
