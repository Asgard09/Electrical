
package controller;
import java.awt.BasicStroke;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import service.ThongKeService;
import service.ThongKeServiceImpl;
import model.Bill;
import model.InfoCustomer;
import java.util.List;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;
public class ThongKeAdmin extends javax.swing.JFrame {
    private ThongKeService thongKeService;

    public ThongKeAdmin() {
        initComponents();
        thongKeService = new ThongKeServiceImpl();
        showBarChartBill();
        showBarChartUser();
    }
    private void showBarChartBill() {
        DefaultCategoryDataset countDataset = new DefaultCategoryDataset();
        DefaultCategoryDataset totalDataset = new DefaultCategoryDataset();

        for (Bill bill : thongKeService.getPayBillCountByDate()) {
            countDataset.addValue(bill.getCount(), "Số lượng", bill.getDate().toString());
            totalDataset.addValue(bill.getUnits(), "Tổng điện tiêu thụ", bill.getDate().toString());
        }

        JFreeChart mixedChart = ChartFactory.createBarChart(
                "Biểu đồ thống kê số lượng và Tổng điện tiêu thụ đã thanh toán",
                "Ngày", "Điện tiêu thụ",
                countDataset, PlotOrientation.VERTICAL, true, true, false);

        CategoryPlot plot = mixedChart.getCategoryPlot();
        plot.setDataset(1, totalDataset);
        plot.mapDatasetToRangeAxis(1, 1);

        NumberAxis totalAxis = new NumberAxis("Tổng điện tiêu thụ");
        plot.setRangeAxis(1, totalAxis);
        plot.setRangeAxisLocation(1, AxisLocation.BOTTOM_OR_RIGHT);

        BarRenderer barRenderer = (BarRenderer) plot.getRenderer();
        barRenderer.setBarPainter(new StandardBarPainter()); // Use StandardBarPainter for better rendering

        LineAndShapeRenderer lineRenderer = new LineAndShapeRenderer();
        lineRenderer.setSeriesStroke(0, new BasicStroke(2.0f)); // Increase thickness of the line
        plot.setRenderer(1, lineRenderer);

        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD); // Set line dataset to be rendered after bar dataset

        ChartPanel chartPanel = new ChartPanel(mixedChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(700, 330));
        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel2.add(chartPanel, java.awt.BorderLayout.CENTER);
        jPanel2.validate();
    }


    private void showBarChartUser() {
        DefaultCategoryDataset countDataset = new DefaultCategoryDataset();
        DefaultCategoryDataset totalDataset = new DefaultCategoryDataset();

        List<InfoCustomer> userDKList = thongKeService.getUserDK();
            for (InfoCustomer user : userDKList) {
                String city = user.getCity();
                if (city != null) {
                    countDataset.addValue(user.getCount(), "Số lượng", city);
                    totalDataset.addValue(user.getUnits(), "Tổng ddi", city); // Assuming user.getTotal() returns the total value
                }
            }

            JFreeChart mixedChart = ChartFactory.createBarChart(
                    "Biểu đồ hỗn hợp số lượng và tổng người đăng ký theo thành phố",
                    "Thành phố", "Số lượng",
                    countDataset, PlotOrientation.VERTICAL, true, true, false);

            CategoryPlot plot = mixedChart.getCategoryPlot();
            plot.setDataset(1, totalDataset);
            plot.mapDatasetToRangeAxis(1, 1);

            NumberAxis totalAxis = new NumberAxis("Tổng");
            plot.setRangeAxis(1, totalAxis);
            plot.setRangeAxisLocation(1, AxisLocation.BOTTOM_OR_RIGHT);

            BarRenderer barRenderer = (BarRenderer) plot.getRenderer();
            barRenderer.setBarPainter(new StandardBarPainter()); // Use StandardBarPainter for better rendering

            LineAndShapeRenderer lineRenderer = new LineAndShapeRenderer();
            lineRenderer.setSeriesStroke(0, new BasicStroke(2.0f)); // Increase thickness of the line
            plot.setRenderer(1, lineRenderer);

            plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD); // Set line dataset to be rendered after bar dataset

            ChartPanel chartPanel = new ChartPanel(mixedChart);
            chartPanel.setPreferredSize(new java.awt.Dimension(700, 330));
            jPanel3.setLayout(new java.awt.BorderLayout());
            jPanel3.add(chartPanel, java.awt.BorderLayout.CENTER);
            jPanel3.validate();
        }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
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
            java.util.logging.Logger.getLogger(ThongKeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ThongKeAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
