
package connected;
import model.Tax;
public interface TaxDao {
    Tax getTaxInfo();
    boolean updateTaxInfo(Tax tax);
}
