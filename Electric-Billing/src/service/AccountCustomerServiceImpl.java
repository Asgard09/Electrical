package service;

import connected.AccountCustomerDaoImpl;
import model.AccountCustomer;
import connected.AccountCustomerDao;

public class AccountCustomerServiceImpl implements AccountCustomerService {
    private AccountCustomerDao accountCustomerDao = null;

    public AccountCustomerServiceImpl() {
        accountCustomerDao = new AccountCustomerDaoImpl();
    }

    @Override
    public AccountCustomer login(String username, String password) {
        return accountCustomerDao.login(username, password);
    }

    @Override
    public boolean create(AccountCustomer accountCustomer) {
        return accountCustomerDao.create(accountCustomer);
    }
    @Override
    public boolean update(AccountCustomer accountCustomer) {
        return accountCustomerDao.update(accountCustomer);
    }
    @Override
    public int delete(String metterNo) {
        return accountCustomerDao.delete(metterNo);
    }
}
