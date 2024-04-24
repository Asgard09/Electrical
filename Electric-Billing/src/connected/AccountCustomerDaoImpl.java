
package connected;
import model.AccountCustomer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class AccountCustomerDaoImpl implements AccountCustomerDao{
    @Override
    public AccountCustomer login(String userName, String passWord) {
        Connection cons = mysqlconnect.getConnection();
        String sql = "SELECT * FROM login_user WHERE username = ?";
        AccountCustomer accountUser = null;
        try {
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, userName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String hashedPasswordFromDB = rs.getString("password");
                if (HashingPassword.hashPassword(passWord).equals(hashedPasswordFromDB)) {
                    accountUser = new AccountCustomer();
                    accountUser.setUsername(rs.getString("username"));
                    accountUser.setPassword(hashedPasswordFromDB); // Store hashed password
                    accountUser.setMetter_no(rs.getString("meter_no"));
                    accountUser.setName(rs.getString("name"));
                }
            }
            rs.close();
            ps.close();
            cons.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return accountUser;
    }


    public boolean create(AccountCustomer accountCustomer) {
        try {
            Connection cons = mysqlconnect.getConnection();
            String sql = "INSERT INTO login_user (meter_no, username, name, password) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, accountCustomer.getMetter_no());
            ps.setString(2, accountCustomer.getUsername());
            ps.setString(3, accountCustomer.getName());
            String hashedPassword = HashingPassword.hashPassword(accountCustomer.getPassword());
            ps.setString(4, hashedPassword);
            int rowsAffected = ps.executeUpdate();

            ps.close();
            cons.close();

            return rowsAffected > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean update(AccountCustomer accountCustomer) {
        try {
            Connection cons = mysqlconnect.getConnection();
            String sql = "UPDATE login_user SET username = ?, name = ?, password = ? WHERE meter_no = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, accountCustomer.getUsername());
            ps.setString(2, accountCustomer.getName());
            String hashedPassword = HashingPassword.hashPassword(accountCustomer.getPassword());
            ps.setString(3, hashedPassword);
            ps.setString(4, accountCustomer.getMetter_no());
            int rowsAffected = ps.executeUpdate();

            ps.close();
            cons.close();

            return rowsAffected > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }



    @Override
    public int delete(String metterNo) {
        try {
            Connection cons = mysqlconnect.getConnection();
            String sql = "DELETE FROM login_user WHERE meter_no = ?";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, metterNo);
            int rowsDeleted = ps.executeUpdate();
            ps.close();
            cons.close();
            return rowsDeleted;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }
}
