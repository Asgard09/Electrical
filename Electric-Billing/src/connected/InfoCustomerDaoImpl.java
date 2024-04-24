
package connected;
import model.InfoCustomer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Wallet;

public class InfoCustomerDaoImpl implements InfoCustomerDao {

    @Override
    public List<InfoCustomer> getList() {
        Connection cons = mysqlconnect.getConnection();
        String sql = "SELECT * FROM info_customer";
        List<InfoCustomer> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                InfoCustomer infoCustomerService = new InfoCustomer();
                infoCustomerService.setName(rs.getString("name"));
                infoCustomerService.setMetter_no(rs.getString("meter_no"));
                infoCustomerService.setAddress(rs.getString("address"));
                infoCustomerService.setCity(rs.getString("city"));
                infoCustomerService.setState(rs.getString("state"));
                infoCustomerService.setEmail(rs.getString("email"));
                infoCustomerService.setPhone(rs.getString("phone"));
                list.add(infoCustomerService);
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
    public boolean createOrUpdate(InfoCustomer infoCustomerService) {
        try {
            Connection cons = mysqlconnect.getConnection();
            String sql = "INSERT INTO info_customer(name, meter_no, address, city, state, email, phone) VALUES(?, ?, ?, ?, ?, ?, ?) ON DUPLICATE KEY UPDATE name = VALUES(name), meter_no = VALUES(meter_no), address = VALUES(address), city = VALUES(city), state = VALUES(state), email = VALUES(email), phone = VALUES(phone);";
            PreparedStatement ps = cons.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, infoCustomerService.getName());
            ps.setString(2, infoCustomerService.getMetter_no());
            ps.setString(3, infoCustomerService.getAddress());
            ps.setString(4, infoCustomerService.getCity());
            ps.setString(5, infoCustomerService.getState());
            ps.setString(6, infoCustomerService.getEmail());
            ps.setString(7, infoCustomerService.getPhone());
            boolean executedSuccessfully = ps.executeUpdate() > 0;
            ps.close();
            cons.close();
            return executedSuccessfully;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean createOrUpdateWallet(Wallet wallet) {
        try {
            Connection conn = mysqlconnect.getConnection();
            String sql = "INSERT INTO wallet(meter_no, balance) VALUES(?, ?) ON DUPLICATE KEY UPDATE balance = VALUES(balance)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, wallet.getMetter_no());
            ps.setFloat(2, wallet.getBalance());
            int rowsAffected = ps.executeUpdate();
            ps.close();
            conn.close();

            // Trả về true nếu có bản ghi nào bị ảnh hưởng bởi câu lệnh SQL
            return rowsAffected > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
            // Nếu có bất kỳ ngoại lệ nào xảy ra, trả về false
            return false;
        }
    }


    public static void main(String[] args) {
        InfoCustomerDao userDao = new InfoCustomerDaoImpl();
        System.out.println(userDao.getList());
    }
}