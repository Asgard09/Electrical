
package connected;
import model.AccountCustomer;
public interface AccountCustomerDao {
    public AccountCustomer login(String username, String password);
    public boolean create(AccountCustomer accountCustomer);
    public boolean update(AccountCustomer accountCustomer);
    public int delete(String MeterNo);
}
