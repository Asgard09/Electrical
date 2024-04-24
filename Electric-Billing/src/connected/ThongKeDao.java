
package connected;
import model.Bill;
import java.util.List;
import model.InfoCustomer;
public interface ThongKeDao {
    List<Bill> getPayBillCountByDate();
    List<InfoCustomer> getUserDK();
    List<Bill> getSortedPaidBills();
    
}
