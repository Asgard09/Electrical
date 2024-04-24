
package connected;
import model.AccountAdmin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class AccountAdminDaoImpl implements AccountAdminDao {
    @Override
    public AccountAdmin login(String userName, String passWord) {
        Connection cons = mysqlconnect.getConnection();
        String sql = "SELECT * FROM admin WHERE username = ?";
        AccountAdmin accountAdmin = null;
        try {
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, userName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String hashedPasswordFromDB = rs.getString("password");
                if (HashingPassword.hashPassword(passWord).equals(hashedPasswordFromDB)) {
                    accountAdmin = new AccountAdmin();
                    accountAdmin.setUsername(rs.getString("username"));
                    accountAdmin.setPassword(hashedPasswordFromDB); // Store hashed password
                }
            }
            rs.close();
            ps.close();
            cons.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return accountAdmin;
    }

    @Override
    public boolean createOrUpdate(AccountAdmin accountAdmin) {
        try {
            Connection cons = mysqlconnect.getConnection();
            String sql = "INSERT INTO admin (username, name, password) VALUES (?, ?, ?) ON DUPLICATE KEY UPDATE username = VALUES(username), name = VALUES(name), password = VALUES(password)";
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setString(1, accountAdmin.getUsername());
            ps.setString(2, accountAdmin.getName());
            String hashedPassword = HashingPassword.hashPassword(accountAdmin.getPassword());
            ps.setString(3, hashedPassword);
            int rowsAffected = ps.executeUpdate();

            ps.close();
            cons.close();

            // Nếu có bản ghi nào bị ảnh hưởng, trả về true, ngược lại trả về false
            return rowsAffected > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}

