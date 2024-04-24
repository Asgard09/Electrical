
package service;

import model.AccountAdmin;

public interface AccountAdminService {
    public AccountAdmin login(String username, String password);
    public boolean createOrUpdate(AccountAdmin accounAdmin);
}
