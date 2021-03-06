
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static javax.swing.text.html.parser.DTDConstants.NUMBERS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class OrderCart extends javax.swing.JFrame {
    /**
     * Creates new form Order
     */
    public OrderCart() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        fillCart();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_cart = new javax.swing.JTable();
        jButton1_add = new javax.swing.JButton();
        jButton1_confirm = new javax.swing.JButton();
        jButton1_remove = new javax.swing.JButton();
        jButton1_back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1_total = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jTable1_cart.setAutoCreateRowSorter(true);
        jTable1_cart.setBackground(new java.awt.Color(108, 122, 137));
        jTable1_cart.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(248, 148, 6)));
        jTable1_cart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item No.", "Name", "Quantity", "Sinle unit Price", "Total Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1_cart);
        if (jTable1_cart.getColumnModel().getColumnCount() > 0) {
            jTable1_cart.getColumnModel().getColumn(0).setHeaderValue("Item No.");
            jTable1_cart.getColumnModel().getColumn(1).setHeaderValue("Name");
            jTable1_cart.getColumnModel().getColumn(2).setHeaderValue("Quantity");
            jTable1_cart.getColumnModel().getColumn(3).setHeaderValue("Sinle unit Price");
            jTable1_cart.getColumnModel().getColumn(4).setHeaderValue("Total Price");
        }

        jButton1_add.setBackground(new java.awt.Color(34, 167, 240));
        jButton1_add.setFont(new java.awt.Font("Ebrima", 3, 14)); // NOI18N
        jButton1_add.setText("Update");
        jButton1_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1_addjButton1_registerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1_addjButton1_registerMouseExited(evt);
            }
        });
        jButton1_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_addjButton1_registerActionPerformed(evt);
            }
        });

        jButton1_confirm.setBackground(new java.awt.Color(34, 167, 240));
        jButton1_confirm.setFont(new java.awt.Font("Ebrima", 3, 14)); // NOI18N
        jButton1_confirm.setText("Confirm");
        jButton1_confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1_confirmjButton1_registerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1_confirmjButton1_registerMouseExited(evt);
            }
        });
        jButton1_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_confirmjButton1_registerActionPerformed(evt);
            }
        });

        jButton1_remove.setBackground(new java.awt.Color(34, 167, 240));
        jButton1_remove.setFont(new java.awt.Font("Ebrima", 3, 14)); // NOI18N
        jButton1_remove.setText("Remove");
        jButton1_remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1_removejButton1_registerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1_removejButton1_registerMouseExited(evt);
            }
        });
        jButton1_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_removejButton1_registerActionPerformed(evt);
            }
        });

        jButton1_back.setBackground(new java.awt.Color(34, 167, 240));
        jButton1_back.setFont(new java.awt.Font("Ebrima", 3, 14)); // NOI18N
        jButton1_back.setText("Edit Order");
        jButton1_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1_backjButton1_registerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1_backjButton1_registerMouseExited(evt);
            }
        });
        jButton1_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_backjButton1_registerActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 240, 241));
        jLabel2.setText("Total: ");

        jTextField1_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_totalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1_total, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1_add, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1_back, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1_total, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1_back, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1_add, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(51, 0, 255));
        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel1.setText("Items Cart");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.orange, java.awt.Color.black));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_addjButton1_registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_addjButton1_registerMouseEntered
        // TODO add your handling code here:
        jButton1_add.setForeground(Color.white);
        jButton1_add.setBackground(new Color(0,153,0));
    }//GEN-LAST:event_jButton1_addjButton1_registerMouseEntered

    private void jButton1_addjButton1_registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_addjButton1_registerMouseExited
        // TODO add your handling code here:
        jButton1_add.setForeground(Color.black);
        jButton1_add.setBackground(new Color(34,167,240));
    }//GEN-LAST:event_jButton1_addjButton1_registerMouseExited

    private void jButton1_addjButton1_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_addjButton1_registerActionPerformed
        String uq=JOptionPane.showInputDialog("Updated Quantity");
        
        if(uq==null){
            return;
        }
        boolean flag=true;
        for(int i =0;i<uq.length() && flag;i++){
            if(uq.charAt(i)>='0' && uq.charAt(i)<='9')
            {
                flag=true;
            }
            else{flag=false;}
        }
        if(flag==false){
            return;
        }
        int q=Integer.parseInt(uq);
        
        if(q<0)
            JOptionPane.showMessageDialog(null, "Invalid Qunatity"); 
        else if(q==0)
        {
            PreparedStatement ps;
            ResultSet rs;
            DefaultTableModel table=(DefaultTableModel) jTable1_cart.getModel();
            int r=jTable1_cart.getSelectedRow();
            String query="DELETE from orders WHERE itemID=?";
            int id=(int)table.getValueAt(r, 0);
            try {
                ps=db_connection.getConnection().prepareStatement(query);
                ps.setInt(1, id);
                ps.executeUpdate();
                table.removeRow(r);
                query="SELECT * from orders";
                int p;
                int qun;
                int total=0;
                ps=db_connection.getConnection().prepareStatement(query);
                rs=ps.executeQuery();
                while(rs.next()){
                    p=rs.getInt("price");
                    qun=rs.getInt("quantity");
                    total+=(p*qun);
                }
                jTextField1_total.setText(total + "Rs");
            }
            catch (SQLException ex) {
                Logger.getLogger(OrderCart.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            updateQuantity(q);
        }
    }//GEN-LAST:event_jButton1_addjButton1_registerActionPerformed

    private void jButton1_confirmjButton1_registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_confirmjButton1_registerMouseEntered
        // TODO add your handling code here:
        jButton1_confirm.setForeground(Color.white);
        jButton1_confirm.setBackground(new Color(0,153,0));
    }//GEN-LAST:event_jButton1_confirmjButton1_registerMouseEntered

    private void jButton1_confirmjButton1_registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_confirmjButton1_registerMouseExited
        // TODO add your handling code here:
        jButton1_confirm.setForeground(Color.black);
        jButton1_confirm.setBackground(new Color(34,167,240));
    }//GEN-LAST:event_jButton1_confirmjButton1_registerMouseExited

    private void jButton1_confirmjButton1_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_confirmjButton1_registerActionPerformed
        // TODO add your handling code here:
        
        PreparedStatement ps;
        ResultSet rs;
        String query="SELECT * FROM orders";
        try {
            ps=db_connection.getConnection().prepareStatement(query);
            rs=ps.executeQuery();
            if(rs.next())
            {
                updateMenuQuantity();
                fillCartAndItemsCart();
                reciept r=new reciept();
                this.setVisible(false);
                r.setVisible(true);
                r.setLocationRelativeTo(null);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Cart is empty");
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(OrderCart.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1_confirmjButton1_registerActionPerformed

    private void jButton1_removejButton1_registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_removejButton1_registerMouseEntered
        // TODO add your handling code here:
        jButton1_remove.setForeground(Color.white);
        jButton1_remove.setBackground(new Color(242,38,19));
    }//GEN-LAST:event_jButton1_removejButton1_registerMouseEntered

    private void jButton1_removejButton1_registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_removejButton1_registerMouseExited
        // TODO add your handling code here:
        jButton1_remove.setForeground(Color.black);
        jButton1_remove.setBackground(new Color(34,167,240));
    }//GEN-LAST:event_jButton1_removejButton1_registerMouseExited

    private void jButton1_removejButton1_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_removejButton1_registerActionPerformed
        // TODO add your handling code here:
        if(jTable1_cart.getSelectedRow()==-1)
        {
            if(jTable1_cart.getRowCount()==0)
                JOptionPane.showMessageDialog(null, "Table is empty");
            else
                JOptionPane.showMessageDialog(null, "No Product is selected");
        }
        else{
            PreparedStatement ps;
            ResultSet rs;
            String query="DELETE FROM `orders` WHERE itemID=?";
            DefaultTableModel table=(DefaultTableModel) jTable1_cart.getModel();
            int r=jTable1_cart.getSelectedRow();
            int id=(int)table.getValueAt(r, 0);
            
            try {
                ps=db_connection.getConnection().prepareStatement(query);
                ps.setInt(1, id);
                ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(OrderCart.class.getName()).log(Level.SEVERE, null, ex);
            }
            table.removeRow(r);
            int p;
            int qun;
            int total=0;
            query="SELECT * from orders";
            try {
                ps=db_connection.getConnection().prepareStatement(query);
                rs=ps.executeQuery();
                while(rs.next()){
                    p=rs.getInt("price");
                    qun=rs.getInt("quantity");
                    total+=(p*qun);
                }
            } catch (Exception e) {}
        jTextField1_total.setText(total + "Rs");

        }
    }//GEN-LAST:event_jButton1_removejButton1_registerActionPerformed

    private void jButton1_backjButton1_registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_backjButton1_registerMouseEntered
        // TODO add your handling code here:
        jButton1_back.setForeground(Color.white);
        jButton1_back.setBackground(new Color(248,148,6));
    }//GEN-LAST:event_jButton1_backjButton1_registerMouseEntered

    private void jButton1_backjButton1_registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_backjButton1_registerMouseExited
        // TODO add your handling code here:
        jButton1_back.setForeground(Color.black);
        jButton1_back.setBackground(new Color(34,167,240));
    }//GEN-LAST:event_jButton1_backjButton1_registerMouseExited

    private void jButton1_backjButton1_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_backjButton1_registerActionPerformed
        // TODO add your handling code here:
        Menu m=new Menu();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
        m.setResizable(false);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1_backjButton1_registerActionPerformed

    private void jTextField1_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_totalActionPerformed
        // TODO add your handling code here:  
    }//GEN-LAST:event_jTextField1_totalActionPerformed

    public void fillCart()
    {
        int total=0;
        try {
            PreparedStatement st;
            ResultSet rs;
            String query="SELECT * FROM orders";
            st=db_connection.getConnection().prepareStatement(query);
            rs=st.executeQuery();
            DefaultTableModel table=(DefaultTableModel)jTable1_cart.getModel();
            while(rs.next()){
                int number=rs.getInt("ItemID");
                String name=rs.getString("name");
                int unitPrice=rs.getInt("price");
                int quantity=rs.getInt("quantity");
                int totalPrice=unitPrice*quantity;
                total+=totalPrice;
                table.addRow(new Object[]{number,name,quantity,unitPrice,totalPrice});
            }
        }
        catch (SQLException ex) {}
        jTextField1_total.setText(String.valueOf(total) + "Rs");
    }
    
    public void updateMenuQuantity()
    {
        PreparedStatement ps;
        ResultSet rs;
        PreparedStatement mps;
        ResultSet mrs;
        String query="SELECT * FROM orders";
        String updateQuery="UPDATE `menu` SET `quantity`=? WHERE itemID=?";
        String menuQuery="SELECT quantity FROM menu WHERE itemID=?";
        try {
            ps=db_connection.getConnection().prepareStatement(query);
            rs=ps.executeQuery();
            mps=db_connection.getConnection().prepareStatement(menuQuery);
            PreparedStatement ups;
            ups=db_connection.getConnection().prepareStatement(updateQuery);
            int q,id;
            int mq=0;
            while(rs.next()){
                id=rs.getInt("itemID");
                q=rs.getInt("quantity");
                mps.setInt(1, id);
                mrs=mps.executeQuery();
                if(mrs.next()){
                    mq=mrs.getInt("quantity");
                }
                ups.setInt(1, mq-q);
                ups.setInt(2, id);
                ups.executeUpdate();
            }
        } catch (Exception e) {
            System.out.println("exception");
        }
        
    }
    
    public void fillCartAndItemsCart()
    {
        PreparedStatement ps;
        ResultSet rs;
        String query="SELECT * FROM orders";
        try {
            ps=db_connection.getConnection().prepareStatement(query);
            rs=ps.executeQuery();
            int p,q;
            int i=0;
            int total=0;
            while(rs.next()){
               p=rs.getInt("price");
               q=rs.getInt("quantity");
               total+=(p*q);
            }
            
            //orderCart query
            PreparedStatement cps;
            String cartQuery="INSERT INTO `ordercart`(`orderDate`, `total`) VALUES (?,?)";
            cps=db_connection.getConnection().prepareStatement(cartQuery,Statement.RETURN_GENERATED_KEYS);
            java.util.Date today = new java.util.Date();
            //cps.setInt(1, cusid);
            cps.setDate(1, (new java.sql.Date(today.getTime())));
            cps.setInt(2, total);
            cps.executeUpdate();
            //getting id of orderCart inserted
            ResultSet crs=cps.getGeneratedKeys();
            while(crs.next()){
                i=crs.getInt(1);
            }
            //order query again
            query="SELECT * FROM orders";
            ps=db_connection.getConnection().prepareStatement(query);
            rs=ps.executeQuery();
            
            PreparedStatement ips;
            //cartItems query
            String cartItemQuery="INSERT INTO `ordercartitems`(`orderID`, `itemID`, `quantity`) VALUES (?,?,?)";
            ips=db_connection.getConnection().prepareStatement(cartItemQuery);
            //filling data in orderItemCart
            int quan,id;
            while(rs.next()){
                id=rs.getInt("itemID");
                quan=rs.getInt("quantity");
                ips.setInt(1, i);
                ips.setInt(2, id);
                ips.setInt(3, quan);
                ips.executeUpdate(); 
            }
        } catch (Exception e) {
            System.out.println("exception");
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
            java.util.logging.Logger.getLogger(OrderCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderCart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_add;
    private javax.swing.JButton jButton1_back;
    private javax.swing.JButton jButton1_confirm;
    private javax.swing.JButton jButton1_remove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_cart;
    private javax.swing.JTextField jTextField1_total;
    // End of variables declaration//GEN-END:variables

    private void updateQuantity(int q) {
       
        if(jTable1_cart.getSelectedRow()==-1)
        {
            if(jTable1_cart.getRowCount()==0)
                JOptionPane.showMessageDialog(null, "Table is empty");
            else
                JOptionPane.showMessageDialog(null, "No Product is selected");
            return;  
        }
        DefaultTableModel table=(DefaultTableModel) jTable1_cart.getModel();
        int r=jTable1_cart.getSelectedRow();
        
        int price=(int) table.getValueAt(r, 3);
        int totalPrice=q*price;
        
        int id=(int)table.getValueAt(r,0);
        
        PreparedStatement ps;;
        ResultSet rs;
        String query="UPDATE `orders` SET `quantity`=? WHERE itemID=?";
        try {
            ps=db_connection.getConnection().prepareStatement(query);
            ps.setInt(1, q);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (Exception e) {}
        
        table.setValueAt(q, jTable1_cart.getSelectedRow(), 2);
        table.setValueAt(totalPrice, jTable1_cart.getSelectedRow(), 4);
        int p;
        int qun;
        int total=0;
        query="SELECT * from orders";
        try {
            ps=db_connection.getConnection().prepareStatement(query);
            rs=ps.executeQuery();
            while(rs.next()){
               p=rs.getInt("price");
               qun=rs.getInt("quantity");
               total+=(p*qun);
            }
        } catch (Exception e) {
        }
        jTextField1_total.setText(total + "Rs");
        
    }
}
