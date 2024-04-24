package service;

import connected.AccountAdminDaoImpl;
import model.AccountAdmin;
import connected.AccountAdminDao;

public class AccountAdminServiceImpl implements AccountAdminService {
    private AccountAdminDao accountAdminDao = null;

    public AccountAdminServiceImpl() {
        accountAdminDao = new AccountAdminDaoImpl();
    }

    @Override
    public AccountAdmin login(String username, String password) {
        return accountAdminDao.login(username, password);
    }

    @Override
    public boolean createOrUpdate(AccountAdmin accountAdmin) {
        return accountAdminDao.createOrUpdate(accountAdmin);
    }

}
