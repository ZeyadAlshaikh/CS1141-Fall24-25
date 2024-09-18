package Polymorphism.Lecture2;

public class CommissionEmployee extends Employee {
    protected double grossSale;
    protected double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socailSecurityNumber, double grossSale,
                              double commissionRate){
        super(firstName, lastName, socailSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSale = grossSale;
    }

    @Override
    public String toString() {
        return "CommissionEmployee [firstName=" + firstName + ", lastName=" + lastName + ", socailSecurityNumber="
                + socailSecurityNumber + ", grossSale=" + grossSale + ", commissionRate=" + commissionRate + "]";
    }

    public double earnings(){
        return grossSale * commissionRate;
    }

    public void commissionSpecial(){
        System.out.println("Special method");
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

}
