package Polymorphism;

public abstract class Employee {
    protected final String firstName;
    protected final String lastName;
    protected final String socailSecurityNumber;
    protected double grossSale;
    protected double commissionRate;

    public Employee(String firstName, String lastName, String socailSecurityNumber, double grossSale,
                              double commissionRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socailSecurityNumber = socailSecurityNumber;
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocailSecurityNumber() {
        return socailSecurityNumber;
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

    public abstract double earnings();
}
