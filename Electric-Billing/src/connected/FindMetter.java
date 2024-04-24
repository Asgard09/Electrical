package connected;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.InfoCustomer;
import model.Wallet;
public class FindMetter {
    public InfoCustomer findCustomerByUsername(String username) {
        try {
            Connection cons = mysqlconnect.getConnection();
            String sql = "SELECT c.* FROM login_user lu JOIN info_customer c ON lu.meter_no = c.meter_no WHERE lu.username = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            InfoCustomer customerInfo = null;
            if (rs.next()) {
                customerInfo = new InfoCustomer();
                customerInfo.setName(rs.getString("name"));
                customerInfo.setMetter_no(rs.getString("meter_no"));
                customerInfo.setAddress(rs.getString("address"));
                customerInfo.setCity(rs.getString("city"));
                customerInfo.setState(rs.getString("state"));
                customerInfo.setEmail(rs.getString("email"));
                customerInfo.setPhone(rs.getString("phone"));
            }
            rs.close();
            ps.close();
            cons.close();
            return customerInfo;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public InfoCustomer findCustomerByMeterNumber(String meterNumber) {
        try {
            Connection cons = mysqlconnect.getConnection();
            String sql = "SELECT * FROM info_customer WHERE meter_no = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, meterNumber);
            ResultSet rs = ps.executeQuery();
            InfoCustomer customerInfo = null;
            if (rs.next()) {
                customerInfo = new InfoCustomer();
                customerInfo.setName(rs.getString("name"));
                customerInfo.setMetter_no(rs.getString("meter_no"));
                customerInfo.setAddress(rs.getString("address"));
                customerInfo.setCity(rs.getString("city"));
                customerInfo.setState(rs.getString("state"));
                customerInfo.setEmail(rs.getString("email"));
                customerInfo.setPhone(rs.getString("phone"));
            }
            rs.close();
            ps.close();
            cons.close();
            return customerInfo;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public Wallet findWalletByUserName(String username) {
        try {
            Connection conn = mysqlconnect.getConnection();
            String sql = "SELECT w.* FROM login_user lu JOIN wallet w ON lu.meter_no = w.meter_no WHERE lu.username = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            Wallet wallet = null;
            if (rs.next()) {
                wallet = new Wallet();
                wallet.setMetter_no(rs.getString("meter_no"));
                wallet.setBalance(rs.getFloat("balance"));
            }
            rs.close();
            ps.close();
            conn.close();
            return wallet;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public Wallet findWalletByMetterNo(String metterNo) {
        try {
            Connection conn = mysqlconnect.getConnection();
            String sql = "SELECT * FROM wallet WHERE meter_no = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, metterNo);
            ResultSet rs = ps.executeQuery();
            Wallet wallet = null;
            if (rs.next()) {
                wallet = new Wallet();
                wallet.setMetter_no(rs.getString("meter_no"));
                wallet.setBalance(rs.getFloat("balance"));
            }
            rs.close();
            ps.close();
            conn.close();
            return wallet;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }


}
