
package controller;
import service.InfoCustomerServiceImpl;
import model.InfoCustomer;
import java.util.List;
import javax.swing.JOptionPane;
import model.Bill;
import service.BillServiceImpl;
import service.TaxServiceImpl;
import model.Tax;
public class CaculatorBill extends javax.swing.JFrame {

    private final InfoCustomerServiceImpl infoCustomerService;
    private final BillServiceImpl billService;
    public TaxServiceImpl taxService;
    public CaculatorBill() {
        initComponents();
        infoCustomerService = new InfoCustomerServiceImpl(); 
        billService = new BillServiceImpl();
        taxService = new TaxServiceImpl();
        addMetterNumber();
    }
    public void addMetterNumber() {
        List<String> meterNumbers = infoCustomerService.getMetterNumbers();
        
        MetterNoInput.removeAllItems();
        
        for (String meterNumber : meterNumbers) {
            MetterNoInput.addItem(meterNumber);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        PhaseBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        MonthInput = new javax.swing.JLabel();
        UnitsCosumedInput = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NameSet = new javax.swing.JLabel();
        AddressSet = new javax.swing.JLabel();
        MetterNoInput = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        YearBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Name");

        PhaseBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PhaseBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Calculate Electricity Bill");

        MonthInput.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MonthInput.setText("Month");

        UnitsCosumedInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Address");

        SubmitButton.setBackground(new java.awt.Color(51, 51, 51));
        SubmitButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Units Cosumed");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Metter No");

        NameSet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        AddressSet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        MetterNoInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MetterNoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MetterNoInputActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Year");

        YearBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MonthInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameSet, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddressSet, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MetterNoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(YearBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UnitsCosumedInput, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PhaseBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(MetterNoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(NameSet))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(AddressSet))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(UnitsCosumedInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhaseBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MonthInput))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(YearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(SubmitButton)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MetterNoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MetterNoInputActionPerformed

        String selectedMetterNumber = MetterNoInput.getSelectedItem().toString();
        InfoCustomer selectedUser = infoCustomerService.findCustomerByMeterNumber(selectedMetterNumber);
        if (selectedUser != null) {
            NameSet.setText(selectedUser.getName());
            AddressSet.setText(selectedUser.getAddress());
        } else {
            NameSet.setText("");
            AddressSet.setText("");
        }
    }//GEN-LAST:event_MetterNoInputActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        String meterNo = (String) MetterNoInput.getSelectedItem();
        String month = (String)PhaseBox.getSelectedItem();
        String year = (String)YearBox.getSelectedItem();
        int units = Integer.parseInt(UnitsCosumedInput.getText());
        String status = "not paid";
        List<Integer> bills = billService.getUnitsByMeterNo(meterNo);
        Tax tax = taxService.getTaxInfo();
        float costPerUnit = tax.getCost_per_unit();
        float serviceCharge = tax.getService_charge();
        float serviceTax = tax.getService_tax();
        float fixedTax = tax.getFixed_tax();
        float totalBill = costPerUnit * units + serviceCharge + serviceTax + fixedTax;
        List<Bill> existingBills = billService.getBillByMetterNo_Month(meterNo, month, year);
        if (existingBills.isEmpty()) {
            Bill bill = new Bill();
            bill.setMeter_no(meterNo);
            bill.setMonth(month);
            bill.setYear(year);
            bill.setUnits(units);
            bill.setTotal_bill(totalBill);
            bill.setStatus(status);
            int result = billService.create(bill);
            if (result != -1) {
                JOptionPane.showMessageDialog(this,"Hóa đơn đã được tạo thành công!");
            } else {
                JOptionPane.showMessageDialog(this,"Không thể tạo hóa đơn. Vui lòng thử lại sau!");
            }
        } else {
            JOptionPane.showMessageDialog(this,"Đã tồn tại hóa đơn cho tháng này. Vui lòng chọn tháng khác!");
        }
    }//GEN-LAST:event_SubmitButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CaculatorBill().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressSet;
    private javax.swing.JComboBox<String> MetterNoInput;
    private javax.swing.JLabel MonthInput;
    private javax.swing.JLabel NameSet;
    private javax.swing.JComboBox<String> PhaseBox;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JTextField UnitsCosumedInput;
    private javax.swing.JComboBox<String> YearBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
