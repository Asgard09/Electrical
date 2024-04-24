
package model;

import java.util.Date;

public class Metter_info {
    private String metter_no;
    private String metter_location;
    private String metter_type;
    private String phase_code;
    private String bill_type;
    private Date days;

    public String getMetter_no() {
        return metter_no;
    }

    public void setMetter_no(String metter_no) {
        this.metter_no = metter_no;
    }

    public String getMetter_location() {
        return metter_location;
    }

    public void setMetter_location(String metter_location) {
        this.metter_location = metter_location;
    }

    public String getMetter_type() {
        return metter_type;
    }

    public void setMetter_type(String metter_type) {
        this.metter_type = metter_type;
    }

    public String getPhase_code() {
        return phase_code;
    }

    public void setPhase_code(String phase_code) {
        this.phase_code = phase_code;
    }

    public String getBill_type() {
        return bill_type;
    }

    public void setBill_type(String bill_type) {
        this.bill_type = bill_type;
    }

    public Date getDays() {
        return days;
    }

    public void setDays(Date days) {
        this.days = days;
    }
    
}
