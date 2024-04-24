package connected;
import model.AccountAdmin;

public interface AccountAdminDao {
    public AccountAdmin login(String username, String password);
    public boolean createOrUpdate(AccountAdmin accountAdmin);
}
