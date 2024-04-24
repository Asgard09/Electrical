
package service;
import model.Tax;

public interface TaxService {
    Tax getTaxInfo();
    boolean updateTaxInfo(Tax tax);
}
