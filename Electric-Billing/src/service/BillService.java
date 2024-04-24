
package service;
import java.util.List;
import model.Bill;
public interface BillService {
    public List<Bill> getList();
    public int create(Bill bill);
    public void update (Bill bill);
    public List<Integer> getUnitsByMeterNo(String meterNo);
    List<Bill> getBillByMetterNo_Month(String metterNo, String month, String year);
    List<Bill> getBillByUsername(String username);
}
