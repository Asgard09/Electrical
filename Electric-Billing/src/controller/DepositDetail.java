
package controller;
import model.Bill;
import model.InfoCustomer;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import Table.TableModel;
import javax.swing.JOptionPane;
import service.BillServiceImpl;
import service.InfoCustomerServiceImpl;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class DepositDetail extends javax.swing.JFrame {

    private final TableModel tableModel; 
    public BillServiceImpl billService ;
    public InfoCustomerServiceImpl infoCustomerService;
    public DepositDetail() {
        initComponents();
        tableModel = new TableModel();
        billService = new BillServiceImpl();
        infoCustomerService = new InfoCustomerServiceImpl();
        loadDataToTable();
    }
  
    private void createBillTable(List<Bill> bills) {
        String[] columnNames = {"Metter", "Month", "Year", "Units", "Total Bill", "Status", "Date"};
        DefaultTableModel model = tableModel.setTableBill(bills, columnNames); 
        TableDepositDetail.setModel(model);
    }
    private void loadDataToTable() {
        List<Bill> billList = billService.getList();
        createBillTable(billList);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        SearchMetterNumberInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        SearchButton = new javax.swing.JButton();
        PrintButton = new javax.swing.JButton();
        SearchTable = new javax.swing.JScrollPane();
        TableDepositDetail = new javax.swing.JTable();
        SortMonthBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        SortYearBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Sort By Metter Number");

        SearchMetterNumberInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Sort By Month");

        SearchButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        PrintButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PrintButton.setText("Print");
        PrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintButtonActionPerformed(evt);
            }
        });

        SearchTable.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(""));

        TableDepositDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Metter", "Month", "Year", "Units", "Total Bill", "Status", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
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
        TableDepositDetail.setRowHeight(30);
        SearchTable.setViewportView(TableDepositDetail);

        SortMonthBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SortMonthBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Sort By Year");

        SortYearBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SortYearBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(SearchMetterNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(SearchButton)
                        .addGap(34, 34, 34)
                        .addComponent(PrintButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SortMonthBox, 0, 165, Short.MAX_VALUE)
                    .addComponent(SortYearBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
            .addComponent(SearchTable)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(SearchMetterNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(SortMonthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchButton)
                            .addComponent(PrintButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(SortYearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        String meterNo = SearchMetterNumberInput.getText();
        String month = (String) SortMonthBox.getSelectedItem();
        String year = (String) SortYearBox.getSelectedItem();
        List<Bill> bills = billService.getBillByMetterNo_Month(meterNo, month, year);
        createBillTable(bills);
    }//GEN-LAST:event_SearchButtonActionPerformed
    private Bill getSelectedBillFromTable() {
        int selectedRowIndex = TableDepositDetail.getSelectedRow();
        if (selectedRowIndex != -1) { // Check if a row is selected
            // Get the data from the selected row
            String meterNo = TableDepositDetail.getValueAt(selectedRowIndex, 0).toString();
            String month = TableDepositDetail.getValueAt(selectedRowIndex, 1).toString();
            String year = TableDepositDetail.getValueAt(selectedRowIndex, 2).toString();
            int units = Integer.parseInt(TableDepositDetail.getValueAt(selectedRowIndex, 3).toString());
            float totalBill = Float.parseFloat(TableDepositDetail.getValueAt(selectedRowIndex, 4).toString());
            String status = TableDepositDetail.getValueAt(selectedRowIndex, 5).toString();
            java.util.Date date = (java.util.Date) TableDepositDetail.getValueAt(selectedRowIndex, 6);

            Bill selectedBill = new Bill();
            selectedBill.setMeter_no(meterNo);
            selectedBill.setMonth(month);
            selectedBill.setYear(year);
            selectedBill.setUnits(units);
            selectedBill.setTotal_bill(totalBill);
            selectedBill.setStatus(status);
            selectedBill.setDate(date);

            return selectedBill;
        } else {
            JOptionPane.showMessageDialog(this, "Please select a bill to print!");
            return null;
        }
    }
    private void generateBillPDF(Bill bill) {
        try {
            Document document = new Document();
            // Set the output file path
            PdfWriter.getInstance(document, new FileOutputStream("Bill_" + bill.getMeter_no() + ".pdf"));
            document.open();

            // Title
            Paragraph title = new Paragraph("HÓA ĐƠN", new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 20, com.itextpdf.text.Font.BOLD));
            title.setAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
            document.add(title);

            // Add blank line
            document.add(new Paragraph("\n"));

            // Bill details
            com.itextpdf.text.Font boldFont = new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 12, com.itextpdf.text.Font.BOLD);
            com.itextpdf.text.Font normalFont = new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.HELVETICA, 12);

            document.add(new Paragraph("Thông tin hóa đơn", boldFont));
            document.add(new Paragraph("Số đồng hồ: " + bill.getMeter_no(), normalFont));
            document.add(new Paragraph("Tháng: " + bill.getMonth(), normalFont));
            document.add(new Paragraph("Năm: " + bill.getYear(), normalFont));
            document.add(new Paragraph("Số đơn vị: " + bill.getUnits(), normalFont));
            document.add(new Paragraph("Tổng hóa đơn: " + bill.getTotal_bill(), normalFont));
            document.add(new Paragraph("Trạng thái: " + bill.getStatus(), normalFont));
            document.add(new Paragraph("Ngày: " + bill.getDate(), normalFont));

            // Add blank line
            document.add(new Paragraph("\n"));

            // Customer details
            InfoCustomer customer = infoCustomerService.findCustomerByMeterNumber(bill.getMeter_no());
            if (customer != null) {
                document.add(new Paragraph("Thông tin khách hàng", boldFont));
                document.add(new Paragraph("Tên: " + customer.getName(), normalFont));
                document.add(new Paragraph("Địa chỉ: " + customer.getAddress(), normalFont));
                document.add(new Paragraph("Thành phố: " + customer.getCity(), normalFont));
                document.add(new Paragraph("Tỉnh: " + customer.getState(), normalFont));
                document.add(new Paragraph("Email: " + customer.getEmail(), normalFont));
                document.add(new Paragraph("Số điện thoại: " + customer.getPhone(), normalFont));
            }

            // Close the document
            document.close();

            JOptionPane.showMessageDialog(this, "PDF generated successfully!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error generating PDF: " + ex.getMessage());
        }
    }
    private void PrintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintButtonActionPerformed
        Bill selectedBill = getSelectedBillFromTable();
        if (selectedBill != null) {
            // Generate PDF
            generateBillPDF(selectedBill);
        }
    }//GEN-LAST:event_PrintButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DepositDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepositDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepositDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepositDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepositDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PrintButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SearchMetterNumberInput;
    private javax.swing.JScrollPane SearchTable;
    private javax.swing.JComboBox<String> SortMonthBox;
    private javax.swing.JComboBox<String> SortYearBox;
    private javax.swing.JTable TableDepositDetail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
