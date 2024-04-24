
package service;

import java.util.List;
import model.InfoCustomer;
import model.Wallet;
public interface InfoCustomerService {
    public List<InfoCustomer> getList();
    boolean createOrUpdate(InfoCustomer infoCustomerService);
    public InfoCustomer findCustomerByUsername(String username);
    public InfoCustomer findCustomerByMeterNumber(String metterNumber);
    public List<String> getMetterNumbers();
    boolean createOrUpdateWallet(Wallet wallet);
    Wallet findWalletByUserName(String username);
    Wallet findWalletByMetterNo(String metterNo);
}
