package Polymorphism;

public class CommissionEmployee extends Employee{

    public CommissionEmployee(String firstName, String lastName, String socailSecurityNumber, double grossSale,
                              double commissionRate){
        super(firstName, lastName, socailSecurityNumber,grossSale,commissionRate);
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
}
