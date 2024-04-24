package connected;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Bill;
import java.sql.Date;
import model.InfoCustomer;

public class ThongKeDaoImpl implements ThongKeDao {

    @Override
    public List<Bill> getPayBillCountByDate() {
        List<Bill> payBillCountByDate = new ArrayList<>();
        try {
            Connection conn = mysqlconnect.getConnection();
            String sql = "SELECT date, COUNT(*) AS count, SUM(units) AS units FROM bill WHERE status = 'paid' GROUP BY date";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Date date = rs.getDate("date");
                if (date != null) {
                    Bill bill = new Bill();
                    int count = rs.getInt("count");
                    int units = rs.getInt("units");
                    bill.setDate(date);
                    bill.setCount(count);
                    bill.setUnits(units);
                    payBillCountByDate.add(bill);
                }
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return payBillCountByDate;
    }

    @Override
    public List<InfoCustomer> getUserDK() {
        List<InfoCustomer> customerDKList = new ArrayList<>();
        try {
            Connection conn = mysqlconnect.getConnection();
            String sql = "SELECT c.city, COUNT(DISTINCT c.meter_no) AS count, SUM(b.units) AS units " +
                         "FROM info_customer c " +
                         "INNER JOIN bill b ON c.meter_no = b.meter_no " +
                         "GROUP BY c.city";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                InfoCustomer InfoCustomer = new InfoCustomer();
                InfoCustomer.setCity(rs.getString("city"));
                InfoCustomer.setCount(rs.getInt("count"));
                InfoCustomer.setUnits(rs.getInt("units"));
                customerDKList.add(InfoCustomer);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return customerDKList;
    }


    
    @Override
    public List<Bill> getSortedPaidBills() {
        List<Bill> sortedPaidBills = new ArrayList<>();
        try {
            Connection conn = mysqlconnect.getConnection();
            String sql = "SELECT date, totalbill FROM bill WHERE status = 'paid' ORDER BY date ASC";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Date date = rs.getDate("date");
                float totalBill = rs.getFloat("totalbill");
                if (date != null) {
                    Bill bill = new Bill();
                    bill.setDate(date);
                    bill.setTotal_bill(totalBill);
                    sortedPaidBills.add(bill);
                }
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return sortedPaidBills;
    }
    

}
