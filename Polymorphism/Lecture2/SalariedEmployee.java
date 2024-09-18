package Polymorphism.Lecture2;

public class SalariedEmployee extends Employee implements Payable{

    private double weeklySalary;


    public SalariedEmployee(String firstName, String lastName, String socailSecurityNumber, double weeklySalary){
        super(firstName,lastName,socailSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "weeklySalary=" + weeklySalary +
                '}';
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings(){
        return weeklySalary;
    }

    @Override
    public double getPaymentAmount(){
        return weeklySalary;
    }
}
