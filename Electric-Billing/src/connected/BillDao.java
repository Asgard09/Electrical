
package connected;
import model.Bill;
import java.util.List;
public interface BillDao {
    public List<Bill> getList();
    public int create(Bill bill);
    public void update(Bill bill);
    List<Bill> getBillByMetterNo_Month(String metterNo, String month, String year);
    List<Bill> getBillByUsername(String username);
}
