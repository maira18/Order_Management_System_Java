
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class SignIn extends javax.swing.JFrame {

    /**
     * Creates new form SignIn
     */
    public String email;
    //homeScreen h=new homeScreen();
    public SignIn() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        Border panelBorder=BorderFactory.createMatteBorder(3, 2, 2, 2, Color.white);
        jPanel1.setBorder(panelBorder);
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
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1_email = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1_signin = new javax.swing.JButton();
        jPasswordField2_pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(248, 148, 6));

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jTextField1_email.setBackground(new java.awt.Color(108, 122, 137));
        jTextField1_email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1_email.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1_email.setText("email");
        jTextField1_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1_emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1_emailFocusLost(evt);
            }
        });
        jTextField1_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_emailActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 240, 241));
        jLabel2.setText("E-Mail");

        jLabel3.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(236, 240, 241));
        jLabel3.setText("Password");

        jButton1_signin.setBackground(new java.awt.Color(34, 167, 240));
        jButton1_signin.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jButton1_signin.setText("Sign In ");
        jButton1_signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1_signinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1_signinMouseExited(evt);
            }
        });
        jButton1_signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_signinActionPerformed(evt);
            }
        });

        jPasswordField2_pass.setBackground(new java.awt.Color(108, 122, 137));
        jPasswordField2_pass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPasswordField2_pass.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField2_pass.setText("abc");
        jPasswordField2_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField2_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField2_passFocusLost(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText(">>No Account? Create Account");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPasswordField2_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(85, 85, 85)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField1_email, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1_signin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(206, 206, 206))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1_email, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField2_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton1_signin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(51, 0, 255));
        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel1.setText(" SIGN IN");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.orange, java.awt.Color.black));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField2_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2_passFocusLost
        // TODO add your handling code here:
        String password=String.valueOf(jPasswordField2_pass.getPassword());
        if(password.trim().toLowerCase().equals(""))
        {
            jPasswordField2_pass.setText("abc");
            jPasswordField2_pass.setForeground(new Color(152,153,153));
        }
        jLabel3.setBorder(null);
    }//GEN-LAST:event_jPasswordField2_passFocusLost

    private void jPasswordField2_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2_passFocusGained
        // TODO add your handling code here:
        String password=String.valueOf(jPasswordField2_pass.getPassword());
        if(password.trim().toLowerCase().equals("abc"))
        {
            jPasswordField2_pass.setText("");
            jPasswordField2_pass.setForeground(Color.black);
        }
        Border labelBorder=BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel3.setBorder(labelBorder);
    }//GEN-LAST:event_jPasswordField2_passFocusGained

    private void jTextField1_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_emailActionPerformed

    private void jTextField1_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1_emailFocusLost
        // TODO add your handling code here:
        if(jTextField1_email.getText().trim().equals(""))
        {
            jTextField1_email.setText("email");
            jTextField1_email.setForeground(new Color(153,153,153));
        }
        jLabel2.setBorder(null);
    }//GEN-LAST:event_jTextField1_emailFocusLost

    private void jTextField1_emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1_emailFocusGained
        // TODO add your handling code here:
        if(jTextField1_email.getText().trim().toLowerCase().equals("email"))
        {
            jTextField1_email.setText("");
            jTextField1_email.setForeground(Color.black);
        }
        Border labelBorder=BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel2.setBorder(labelBorder);
    }//GEN-LAST:event_jTextField1_emailFocusGained

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        Border labelBorder=BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(236,240,241));
        jLabel4.setBorder(labelBorder);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
        jLabel4.setBorder(null);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        Register r=new Register();
        r.setVisible(true);
        r.setLocationRelativeTo(null);
        r.setResizable(false);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton1_signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_signinActionPerformed

        PreparedStatement st;
        ResultSet rs;
        email=jTextField1_email.getText();
        String password=String.valueOf(jPasswordField2_pass.getPassword());
        if(email.trim().toLowerCase().equals("") || email.trim().toLowerCase().equals("email"))
        {
            JOptionPane.showMessageDialog(null,"Enter your email","Empty email field",2);
        }
        else if(password.trim().toLowerCase().equals("") || password.trim().toLowerCase().equals("abc"))
        {
            JOptionPane.showMessageDialog(null,"Enter your Password","Empty password field",2);
        }
        else
        {
            String query="SELECT * FROM customer WHERE email =? AND password =?";
            try {
                st=db_connection.getConnection().prepareStatement(query);
                st.setString(1, email);
                st.setString(2, password);
                rs=st.executeQuery();
                if(rs.next())
                {
                    Menu m=new Menu();
                    m.setVisible(true);
                    m.setLocationRelativeTo(null);
                    m.setResizable(false);
                    this.setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Invalid email or Password","Login error",2);
                }

            } catch (SQLException ex) {}
        }
    }//GEN-LAST:event_jButton1_signinActionPerformed

    private void jButton1_signinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_signinMouseExited
        // TODO add your handling code here:
        jButton1_signin.setForeground(Color.black);
        jButton1_signin.setBackground(new Color(34,167,240));
    }//GEN-LAST:event_jButton1_signinMouseExited

    private void jButton1_signinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_signinMouseEntered
        // TODO add your handling code here:
        jButton1_signin.setForeground(Color.white);
        jButton1_signin.setBackground(new Color(0,153,0));
    }//GEN-LAST:event_jButton1_signinMouseEntered

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_signin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2_pass;
    private javax.swing.JTextField jTextField1_email;
    // End of variables declaration//GEN-END:variables
}
