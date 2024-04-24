package connected;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Tax;

public class TaxDaoImpl implements TaxDao{

    @Override
    public Tax getTaxInfo() {
        Connection cons = mysqlconnect.getConnection();
        String sql = "SELECT * FROM tax";
        try {
            PreparedStatement ps = cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Tax tax = new Tax();
                tax.setCost_per_unit(rs.getFloat("cost_per_unit"));
                tax.setService_charge(rs.getFloat("service_charge"));
                tax.setService_tax(rs.getFloat("service_tax"));
                tax.setFixed_tax(rs.getFloat("fixed_tax"));
                ps.close();
                rs.close();
                cons.close();
                return tax;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean updateTaxInfo(Tax tax) {
        Connection cons = mysqlconnect.getConnection();
        String sql = "UPDATE tax SET cost_per_unit = ?, service_charge = ?, service_tax = ?, fixed_tax = ?";
        try {
            PreparedStatement ps = cons.prepareStatement(sql);
            ps.setFloat(1, tax.getCost_per_unit());
            ps.setFloat(2, tax.getService_charge());
            ps.setFloat(3, tax.getService_tax());
            ps.setFloat(4, tax.getFixed_tax());
            int rowsAffected = ps.executeUpdate();
            ps.close();
            cons.close();
            return rowsAffected > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
