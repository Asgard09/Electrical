
package model;


public class Tax {
    private float cost_per_unit;
    private float service_charge;
    private float service_tax;
    private float fixed_tax;
    public Tax() {
        this.cost_per_unit = 0.0f;
        this.service_charge = 0.0f;
        this.service_tax = 0.0f;
        this.fixed_tax = 0.0f;
    }
    public Tax(float cost_per_unit, float service_charge, float service_tax, float fixed_tax) {
        this.cost_per_unit = cost_per_unit;
        this.service_charge = service_charge;
        this.service_tax = service_tax;
        this.fixed_tax = fixed_tax;
    }
  
    public float getCost_per_unit() {
        return cost_per_unit;
    }
    
    public void setCost_per_unit(float cost_per_unit) {
        this.cost_per_unit = cost_per_unit;
    }

    public float getService_charge() {
        return service_charge;
    }

    public void setService_charge(float service_charge) {
        this.service_charge = service_charge;
    }

    public float getService_tax() {
        return service_tax;
    }

    public void setService_tax(float service_tax) {
        this.service_tax = service_tax;
    }

    public float getFixed_tax() {
        return fixed_tax;
    }

    public void setFixed_tax(float fixed_tax) {
        this.fixed_tax = fixed_tax;
    }
    
}
