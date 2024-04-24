package connected;

import model.Bill;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BillDaoImpl implements BillDao {

    @Override
    public List<Bill> getList() {
        Connection cons = mysqlconnect.getConnection();
        String sql = "SELECT * FROM bill";
        List<Bill> list = new ArrayList<>();
        try {
            PreparedStatement ps = cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Bill bill = new Bill();
                bill.setMeter_no(rs.getString("meter_no"));
                bill.setMonth(rs.getString("month"));
                bill.setYear(rs.getString("year"));
                bill.setUnits(rs.getInt("units"));
                bill.setTotal_bill(rs.getFloat("totalbill"));
                bill.setStatus(rs.getString("status"));
                bill.setDate(rs.getDate("date"));
                list.add(bill);
            }
            ps.close();
            rs.close();
            cons.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int create(Bill bill) {
        try {
            Connection cons = mysqlconnect.getConnection();
            String sql = "INSERT INTO bill (meter_no, month, year, units, totalbill, status, date) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = cons.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, bill.getMeter_no());
            ps.setString(2, bill.getMonth());
            ps.setString(3, bill.getYear());
            ps.setInt(4, bill.getUnits());
            ps.setFloat(5, bill.getTotal_bill());
            ps.setString(6, bill.getStatus());
            ps.setNull(7, java.sql.Types.DATE);
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            int generatedKey = 0;
            if (rs.next()) {
                generatedKey = rs.getInt(1);
            }
            ps.close();
            cons.close();
            return generatedKey;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }
    @Override
    public void update(Bill bill) {
        try {
            Connection cons = mysqlconnect.getConnection();
            String sql = "UPDATE bill SET status = ?, date = ? WHERE meter_no = ? AND month = ? AND year = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, bill.getStatus());
            ps.setDate(2, new java.sql.Date(bill.getDate().getTime()));
            ps.setString(3, bill.getMeter_no());
            ps.setString(4, bill.getMonth());
            ps.setString(5, bill.getYear());
            ps.executeUpdate();
            ps.close();
            cons.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<Bill> getBillByMetterNo_Month(String meterNo, String month, String year) {
        Connection cons = mysqlconnect.getConnection();
        String sql = "SELECT * FROM bill WHERE 1=1";
        List<Bill> list = new ArrayList<>();
        try {
            StringBuilder condition = new StringBuilder();
            if (!meterNo.isEmpty()) {
                condition.append(" AND meter_no = ?");
            }
            if (!month.isEmpty()) {
                condition.append(" AND month = ?");
            }
            if (!year.isEmpty()) {
                condition.append(" AND year = ?");
            }
            sql += condition.toString();
            PreparedStatement ps = cons.prepareStatement(sql);
            int index = 1;
            if (!meterNo.isEmpty()) {
                ps.setString(index++, meterNo);
            }
            if (!month.isEmpty()) {
                ps.setString(index++, month);
            }
            if (!year.isEmpty()) {
                ps.setString(index, year);
            }

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Bill bill = new Bill();
                bill.setMeter_no(rs.getString("meter_no"));
                bill.setMonth(rs.getString("month"));
                bill.setYear(rs.getString("year"));
                bill.setUnits(rs.getInt("units"));
                bill.setTotal_bill(rs.getFloat("totalbill"));
                bill.setStatus(rs.getString("status"));
                bill.setDate(rs.getDate("date"));
                list.add(bill);
            }
            ps.close();
            rs.close();
            cons.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }



    @Override
    public List<Bill> getBillByUsername(String username) {
        Connection cons = mysqlconnect.getConnection();
        String sql = "SELECT c.* FROM login_user lu JOIN bill c ON lu.meter_no = c.meter_no WHERE lu.username = ?";
        List<Bill> list = new ArrayList<>();
        try {
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, username); // Set the meter_no parameter value
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Bill bill = new Bill();
                bill.setMeter_no(rs.getString("meter_no"));
                bill.setMonth(rs.getString("month"));
                bill.setYear(rs.getString("year"));
                bill.setUnits(rs.getInt("units"));
                bill.setTotal_bill(rs.getInt("totalbill"));
                bill.setStatus(rs.getString("status"));
                bill.setDate(rs.getDate("date"));
                list.add(bill);
            }
            ps.close();
            rs.close();
            cons.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
