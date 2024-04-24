
package service;

import model.AccountCustomer;
public interface AccountCustomerService {
    public AccountCustomer login(String username, String password);
    boolean create(AccountCustomer accountCustomer);
    boolean update(AccountCustomer accountCustomer);
    public int delete(String metterNo);
}
