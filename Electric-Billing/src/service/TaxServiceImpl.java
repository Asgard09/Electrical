package service;

import connected.TaxDao;
import connected.TaxDaoImpl;
import model.Tax;

public class TaxServiceImpl implements TaxService {
    private TaxDao taxDao;

    public TaxServiceImpl() {
        taxDao = new TaxDaoImpl();
    }

    @Override
    public Tax getTaxInfo() {
        return taxDao.getTaxInfo();
    }

    @Override
    public boolean updateTaxInfo(Tax tax) {
        return taxDao.updateTaxInfo(tax);
    }
}
