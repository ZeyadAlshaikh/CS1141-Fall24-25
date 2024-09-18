package Polymorphism.Lecture2;

public class HourlyEmployee extends Employee{

    private double wage;
    private int hours;

    public HourlyEmployee(String firstName, String lastName, String socailSecurityNumber, double wage, int hours){
        super(firstName,lastName,socailSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double earnings(){
        if( hours <= 40)
            return wage * hours;
        else
            return ( wage * 40 ) + ( hours-40) * (wage * 1.5);


    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "wage=" + wage +
                ", hours=" + hours +
                '}';
    }
}
