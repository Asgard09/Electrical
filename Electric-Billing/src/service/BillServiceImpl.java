package service;

import connected.BillDao;
import connected.BillDaoImpl;
import model.Bill;
import java.util.List;
import java.util.ArrayList;
public class BillServiceImpl implements BillService {

    private BillDao billDao;

    public BillServiceImpl() {
        billDao = new BillDaoImpl();
    }

    @Override
    public List<Bill> getList() {
        return billDao.getList();
    }

    @Override
    public int create(Bill bill) {
        return billDao.create(bill);
    }
    @Override
    public void update(Bill bill) {
        billDao.update(bill);
    }
    @Override
    public List<Integer> getUnitsByMeterNo(String meterNo) {
        List<Bill> billList = billDao.getList();
        List<Integer> unitsList = new ArrayList<>();
        for (Bill bill : billList) {
            if (bill.getMeter_no().equals(meterNo)) {
                unitsList.add(bill.getUnits());
            }
        }
        return unitsList;
    }
    @Override
    public List<Bill> getBillByMetterNo_Month(String meterNo, String month, String year) {
        return billDao.getBillByMetterNo_Month(meterNo, month, year);
    }
    @Override
    public List<Bill> getBillByUsername(String username){
        return billDao.getBillByUsername(username);
    }

}
