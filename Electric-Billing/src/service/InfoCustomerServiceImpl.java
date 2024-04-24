package service;

import connected.InfoCustomerDaoImpl;
import model.InfoCustomer;
import model.Wallet;
import java.util.List;
import connected.FindMetter;
import java.util.ArrayList;
import connected.InfoCustomerDao;

public class InfoCustomerServiceImpl implements InfoCustomerService {

    private InfoCustomerDao InfoCustomerDao;
    private FindMetter findMetter;

    public InfoCustomerServiceImpl() {
        InfoCustomerDao = new InfoCustomerDaoImpl();
        findMetter = new FindMetter();
    }

    @Override
    public List<InfoCustomer> getList() {
        return InfoCustomerDao.getList();
    }

    @Override
    public boolean createOrUpdate(InfoCustomer user) {
        return InfoCustomerDao.createOrUpdate(user);
    }

    @Override
    public InfoCustomer findCustomerByUsername(String username) {
        return findMetter.findCustomerByUsername(username);
    }
    @Override
    public InfoCustomer findCustomerByMeterNumber(String metterNumber){
        return findMetter.findCustomerByMeterNumber(metterNumber);
    }
    @Override
    public List<String> getMetterNumbers() {
        List<InfoCustomer> userList = InfoCustomerDao.getList();
        List<String> metterNumbers = new ArrayList<>();
        for (InfoCustomer user : userList) {
            metterNumbers.add(user.getMetter_no());
        }
        return metterNumbers;
    }
    @Override
    public boolean createOrUpdateWallet(Wallet wallet){
        return InfoCustomerDao.createOrUpdateWallet(wallet);
    }
    @Override
    public Wallet findWalletByUserName(String username){
        return findMetter.findWalletByUserName(username);
    }
    @Override
    public Wallet findWalletByMetterNo(String metterNo){
        return findMetter.findWalletByMetterNo(metterNo);
    }
    
}
