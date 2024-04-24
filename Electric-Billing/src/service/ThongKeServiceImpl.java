package service;

import java.util.List;
import model.Bill;
import model.InfoCustomer;
import connected.ThongKeDao;
import connected.ThongKeDaoImpl;
public class ThongKeServiceImpl implements ThongKeService {
    private ThongKeDao thongKeDao;

    public ThongKeServiceImpl() {
        thongKeDao = new ThongKeDaoImpl();
    }

    @Override
    public List<Bill> getPayBillCountByDate() {
        return thongKeDao.getPayBillCountByDate();
    }
    @Override
    public List<InfoCustomer> getUserDK() {
        return thongKeDao.getUserDK();
    }
    @Override
    public List<Bill> getSortedPaidBills(){
        return thongKeDao.getSortedPaidBills();
    }
}
