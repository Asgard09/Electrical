
package service;

import java.util.List;
import model.Bill;
import model.InfoCustomer;
public interface ThongKeService {
    List<Bill> getPayBillCountByDate();
    List<InfoCustomer> getUserDK();
    List<Bill> getSortedPaidBills();
}
