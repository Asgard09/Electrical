
package controller;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;


public class CustomerMenu extends javax.swing.JFrame {


    public CustomerMenu() {
        initComponents();
        setIconInButton();
    }
    public Login loginInstance;
    public void setLoginInstance(Login loginInstance) {
        this.loginInstance = loginInstance;
        String loggedInUsername = loginInstance.getLoggedInUsername();
    }
    public String getLoggedInUsername() {
        return this.loginInstance != null ? this.loginInstance.getLoggedInUsername() : null;
    }
//    public void setImage(){
//        ImageIcon imageElectric = new ImageIcon(getClass().getResource("/images/thongke.png"));
//        Image img = imageElectric.getImage().getScaledInstance(jLabelThongKe.getWidth(),jLabelThongKe.getHeight(),Image.SCALE_SMOOTH);
//        jLabelThongKe.setIcon(new ImageIcon(img));
//    }
    public void setIconInButton(){


            //1
        UpdateInfoButton.setIcon(new ImageIcon(getClass().getResource("/images/update-cus-ic.png")));
        //2
        ViewInfoButton.setIcon(new ImageIcon(getClass().getResource("/images/info-user-ic.png")));
        // 3
        WalletButton.setIcon(new ImageIcon(getClass().getResource("/images/wallet-ic.png")));
        // 4
        BillDetailButton.setIcon(new ImageIcon(getClass().getResource("/images/bill-detail-ic.png")));
        // 5
        ThongKe.setIcon(new ImageIcon(getClass().getResource("/images/thongke-ic.png")));
        // 6
        LogoutButton.setIcon(new ImageIcon(getClass().getResource("/images/logout-ic.png")));
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        UpdateInfoButton = new javax.swing.JButton();
        BillDetailButton = new javax.swing.JButton();
        ViewInfoButton = new javax.swing.JButton();
        ThongKe = new javax.swing.JButton();
        WalletButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        UpdateInfoButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        UpdateInfoButton.setText("Cập nhật thông tin");
        UpdateInfoButton.setPreferredSize(new java.awt.Dimension(100, 100));
        UpdateInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateInfoButtonActionPerformed(evt);
            }
        });

        BillDetailButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BillDetailButton.setText("Chi tiết hóa đơn");
        BillDetailButton.setPreferredSize(new java.awt.Dimension(100, 100));
        BillDetailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillDetailButtonActionPerformed(evt);
            }
        });

        ViewInfoButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ViewInfoButton.setText("Thông tin khách hàng");
        ViewInfoButton.setPreferredSize(new java.awt.Dimension(100, 100));
        ViewInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewInfoButtonActionPerformed(evt);
            }
        });

        ThongKe.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ThongKe.setText("Thống kê");
        ThongKe.setPreferredSize(new java.awt.Dimension(100, 100));
        ThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThongKeActionPerformed(evt);
            }
        });

        WalletButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        WalletButton.setText("Ví");
        WalletButton.setPreferredSize(new java.awt.Dimension(100, 100));
        WalletButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WalletButtonActionPerformed(evt);
            }
        });

        LogoutButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LogoutButton.setText("Đăng xuất");
        LogoutButton.setPreferredSize(new java.awt.Dimension(100, 100));
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("DANH MỤC CUSTOMER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(WalletButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BillDetailButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LogoutButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewInfoButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(UpdateInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addComponent(UpdateInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(ViewInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(WalletButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(BillDetailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateInfoButtonActionPerformed
        jPanel3.removeAll();
        UpdateInfo updateinfo = new UpdateInfo(this);
        jPanel3.add(updateinfo.getContentPane());
        jPanel3.revalidate();
        jPanel3.repaint();
    }//GEN-LAST:event_UpdateInfoButtonActionPerformed

    private void BillDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillDetailButtonActionPerformed
        jPanel3.removeAll();
        BillDetail billDetail = new BillDetail(this);
        jPanel3.add(billDetail.getContentPane());
        jPanel3.revalidate();
        jPanel3.repaint();
    }//GEN-LAST:event_BillDetailButtonActionPerformed

    private void ViewInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewInfoButtonActionPerformed
        jPanel3.removeAll();
        ViewInfo viewinfo = new ViewInfo(this);
        jPanel3.add(viewinfo.getContentPane());
        jPanel3.revalidate();
        jPanel3.repaint();
    }//GEN-LAST:event_ViewInfoButtonActionPerformed

    private void ThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThongKeActionPerformed
        jPanel3.removeAll();
        ThongKeUser thongKe = new ThongKeUser(this);
        jPanel3.add(thongKe.getContentPane());
        jPanel3.revalidate();
        jPanel3.repaint();
    }//GEN-LAST:event_ThongKeActionPerformed

    private void WalletButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WalletButtonActionPerformed
        jPanel3.removeAll();
        WalletUser walletUser = new WalletUser(this);
        jPanel3.add(walletUser.getContentPane());
        jPanel3.revalidate();
        jPanel3.repaint();
    }//GEN-LAST:event_WalletButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        setVisible(false);
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_LogoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CustomerMenu customerMenu = new CustomerMenu();
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                customerMenu.setLocation(dim.width / 2 - customerMenu.getSize().width / 2, dim.height / 2 - customerMenu.getSize().height / 2);
                customerMenu.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BillDetailButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton ThongKe;
    private javax.swing.JButton UpdateInfoButton;
    private javax.swing.JButton ViewInfoButton;
    private javax.swing.JButton WalletButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
