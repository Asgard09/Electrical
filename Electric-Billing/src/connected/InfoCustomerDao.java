
package connected;

import model.InfoCustomer;
import java.util.List;
import model.Wallet;

public interface InfoCustomerDao {
    public List<InfoCustomer> getList();
    public boolean createOrUpdate(InfoCustomer infoCustomerService);
    public boolean createOrUpdateWallet(Wallet wallet);
}
