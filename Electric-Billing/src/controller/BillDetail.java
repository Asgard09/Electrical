
package controller;
import model.Bill;
import Table.TableModel;
import java.util.List;
import javax.swing.JOptionPane;
import service.BillServiceImpl;
import javax.swing.table.DefaultTableModel;
public class BillDetail extends javax.swing.JFrame {
    private TableModel tableModel; 
    public BillServiceImpl billService;
    private CustomerMenu customerMenu;
    public BillDetail() {
        initComponents();
    }
    public BillDetail(CustomerMenu customerMenu) {
        initComponents();
        this.customerMenu = customerMenu;
        tableModel = new TableModel();
        billService = new BillServiceImpl();
        loadDataToTable();
    }

    private void loadDataToTable() {
        List<Bill> billList = billService.getBillByUsername(customerMenu.getLoggedInUsername());
        String[] columnNames = {"Metter", "Month","Year", "Units", "Total Bill", "Status","Date"};
        DefaultTableModel model = tableModel.setTableBill(billList, columnNames); 
        TableBillDetail.setModel(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TableBillDetail = new javax.swing.JTable();
        BillDetail = new javax.swing.JLabel();
        Payment = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TableBillDetail.setAutoCreateRowSorter(true);
        TableBillDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Metter", "Month", "Year", "Units", "Total Bill", "Status", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableBillDetail.setRowHeight(25);
        TableBillDetail.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TableBillDetail);

        BillDetail.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BillDetail.setText("BillDetail");

        Payment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Payment.setText("Payment");
        Payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(Payment)
                .addGap(176, 176, 176)
                .addComponent(BillDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BillDetail)
                    .addComponent(Payment))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentActionPerformed
        int selectedRow = TableBillDetail.getSelectedRow();
    
    // Kiểm tra xem có hàng nào được chọn không
    if (selectedRow != -1) {
        // Lấy dữ liệu từ hàng được chọn
        String metterNo = TableBillDetail.getValueAt(selectedRow, 0).toString();
        String month = TableBillDetail.getValueAt(selectedRow, 1).toString();
        String year = TableBillDetail.getValueAt(selectedRow, 2).toString();
        int units = Integer.parseInt(TableBillDetail.getValueAt(selectedRow, 3).toString());
        float totalBill = Float.parseFloat(TableBillDetail.getValueAt(selectedRow, 4).toString());
        String status = TableBillDetail.getValueAt(selectedRow, 5).toString();

        // Kiểm tra xem trạng thái của hóa đơn có phải là "paid" không
        if (!status.equals("paid")) {
            // Tạo một đối tượng Bill từ dữ liệu hàng được chọn
            Bill selectedBill = new Bill();
            selectedBill.setMeter_no(metterNo);
            selectedBill.setMonth(month);
            selectedBill.setYear(year);
            selectedBill.setUnits(units);
            selectedBill.setTotal_bill(totalBill);
            selectedBill.setStatus(status);

            PayBill payBill = new PayBill(selectedBill);
            payBill.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this,"Bill has already been paid.");
        }
    }
    }//GEN-LAST:event_PaymentActionPerformed
    public DefaultTableModel getTableModel() {
        return (DefaultTableModel) TableBillDetail.getModel();
    }

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
            java.util.logging.Logger.getLogger(BillDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BillDetail;
    private javax.swing.JButton Payment;
    private javax.swing.JTable TableBillDetail;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
