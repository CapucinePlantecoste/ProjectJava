/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import projectjava.First ; 

/**
 *
 * @author CAP
 */
public class EmployeeAddViewing extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeAddViewing
     */
    public EmployeeAddViewing(Employee coucou, ArrayList<Buyer> b, ArrayList<Seller> s, ArrayList<Employee> e, ArrayList<Property>prop, ArrayList<Visit>vis, ArrayList<Offer>off) {
        buyers = b;//Array List of buyers
        sellers = s;//Array List of sellers
        emp = e;//Array List of employees
        pr=prop;
        v=vis;
        o=off;
       
        employee = coucou;
        
        initComponents();
        initjcb1(); 
        jPanelViewing.hide(); 
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
        jButton6 = new javax.swing.JButton();
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

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

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

        jComboBox1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
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
                        .addComponent(jLabel3)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164))))
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
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
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

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton6.setText("Log Out");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(1360, 100, 100, 23);

        jPanelViewing.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Enter the date of the viewing");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Day (dd)");

        jTextFieldHour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldHourKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
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

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
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

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
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

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
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
                        .addGap(124, 124, 124)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelViewingLayout.createSequentialGroup()
                        .addGroup(jPanelViewingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViewingLayout.createSequentialGroup()
                                .addGroup(jPanelViewingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(jPanelViewingLayout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addGroup(jPanelViewingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(22, 22, 22)))
                        .addGroup(jPanelViewingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldYear, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldHour, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelViewingLayout.setVerticalGroup(
            jPanelViewingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViewingLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelViewingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelViewingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelViewingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelViewingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelViewingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jButton2)
                .addGap(20, 20, 20))
        );

        jPanel2.add(jPanelViewing);
        jPanelViewing.setBounds(940, 310, 460, 380);

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
        // TODO add your handling code here:
        this.toBack();//if we click on the back button
        setVisible(false);//this page disappears
        EmployeeFirst a=new EmployeeFirst(employee, buyers, sellers, emp,pr,v,o);//we go back on the first page
        a.setVisible(true);
        new EmployeeFirst(employee, buyers, sellers, emp,pr,v,o).setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        //faire code pour log out
        this.toBack();
        setVisible(false);//this page disappears
        new First(buyers, sellers, emp, pr,v,o).toFront();//we go back on the first page
        new First(buyers, sellers, emp,pr,v,o).setState(java.awt.Frame.NORMAL);
        new First(buyers, sellers, emp,pr,v,o).setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String selected = (String) jComboBox1.getSelectedItem();
        if (selected.equals("Select one of the properties for sale")) {  
            jPanelViewing.hide();
        }
        else
        {
            jPanelViewing.show(); 
        }
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextFieldHourKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldHourKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldHourKeyTyped

    private void jTextFieldYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldYearActionPerformed

    private void jTextFieldYearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldYearKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldYearKeyTyped

    private void jTextFieldMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMonthActionPerformed

    private void jTextFieldMonthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMonthKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldMonthKeyTyped

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextFieldMinutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMinutesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMinutesActionPerformed

    private void jTextFieldMinutesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMinutesKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMinutesKeyPressed

    private void jTextFieldMinutesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMinutesKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldMinutesKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
              Date date=new Date();
        Timestamp ts= new Timestamp(date.getTime());
        SimpleDateFormat sdf= new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
      
        int tampon = -1;
        int c;
        
        String selected = (String) jComboBox1.getSelectedItem();
        for (int i = 0; i < pr.size(); i++) {
            if (selected.equals(pr.get(i).getdescription()+" idproperty : "+pr.get(i).getid())) {

                tampon = i;
            }

        }
      
        //TO see which house or apartment is concerner by this new viewing
        
       
        
        

        if (jTextFieldMonth.getText().trim().isEmpty() || jTextFieldYear.getText().trim().isEmpty() || jTextFieldHour.getText().trim().isEmpty() || jTextField1.getText().trim().isEmpty() || jTextFieldMinutes.getText().trim().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "One or several fields are empty. Please, try again.");
        } else {
            if (jTextFieldYear.getText().length() != 4 || jTextFieldMonth.getText().length() != 2 || jTextFieldHour.getText().length() != 2 || jTextField1.getText().length() != 2 || jTextFieldMinutes.getText().length() != 2) {
                JOptionPane.showMessageDialog(null, "Wrong date format");
            } else {
                if (Integer.parseInt(jTextFieldMonth.getText()) > 12 || Integer.parseInt(jTextFieldMonth.getText())<1 || Integer.parseInt(jTextField1.getText()) > 31 || Integer.parseInt(jTextField1.getText())<1 || Integer.parseInt(jTextFieldHour.getText()) > 23 || Integer.parseInt(jTextFieldMinutes.getText()) > 59) {
                    JOptionPane.showMessageDialog(null, " Impossible date");
                }
                else
                {
                    if((jTextFieldMonth.getText().equals("02")|| jTextFieldMonth.getText().equals("04") ||jTextFieldMonth.getText().equals("06")|| jTextFieldMonth.getText().equals("09") || jTextFieldMonth.getText().equals("11")) && (jTextField1.getText().equals("31")))
                    {
                        JOptionPane.showMessageDialog(null, " This date doesn't exist");
                    }
                    else
                    {
                        String newd=(jTextFieldYear.getText()+"-"+jTextFieldMonth.getText()+"-"+jTextField1.getText()+" "+jTextFieldHour.getText()+":"+jTextFieldMinutes.getText()+":00");
                        try
                        {
                            Date dateparse=sdf.parse(newd);
                            Timestamp d=new Timestamp(dateparse.getTime());
                            c=d.compareTo(ts);
                       if(c<0)
                       {
                          JOptionPane.showMessageDialog(null, "Date already passed"); 
                       }
                       else
                       {
                           
                           
                           v.add(new Visit(v.get(v.size()-1).getid()+1,-1,pr.get(tampon).getid(),employee.getid(),d,30));
                            VisitDAOImpl vdao=new VisitDAOImpl();
                            vdao.addvisit(v.get(v.size()-1));
                            JOptionPane.showMessageDialog(null, "Viewing added"); 
                            this.setVisible(false);
                            EmployeeAddViewing a =new EmployeeAddViewing(employee, buyers, sellers, emp, pr,v,o);
                            a.setVisible(true);
                           
                       }
                        }
                        catch(ParseException e)
                        {
                            e.printStackTrace();
                        }
                       /* System.out.println(jTextFieldYear.getText());
                        int y=Integer.parseInt(jTextFieldYear.getText());
                        System.out.println(y);*/
                        
                      
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void initjcb1() {
        for (int i = 0; i < pr.size(); i++) {

            jComboBox1.addItem(pr.get(i).getdescription()+" idproperty : "+pr.get(i).getid());

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
            public void run() {
                new EmployeeAddViewing(employee, buyers, sellers, emp,pr,v,o).setVisible(true);
            }
        });
    }

    
    private static ArrayList<Buyer> buyers = new ArrayList<>();//array list of all the application buyers 
    private static ArrayList<Seller> sellers = new ArrayList<>();//array list of all the application sellers 
    private static ArrayList<Employee> emp = new ArrayList<>();//array list of all the application sellers 
    private static ArrayList<Property> pr=new ArrayList<>();
    private static ArrayList<Visit>v=new ArrayList<>();
    private static ArrayList<Offer>o=new ArrayList<>();
    private static Seller newseller ; 
    private static Employee employee ; 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
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
