package Polymorphism.Lecture2;

public abstract class Employee {
    protected final String firstName;
    protected final String lastName;
    protected final String socailSecurityNumber;



    public Employee(String firstName, String lastName, String socailSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socailSecurityNumber = socailSecurityNumber;

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


    public abstract double earnings();
}
