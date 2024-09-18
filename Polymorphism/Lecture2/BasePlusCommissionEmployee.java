package Polymorphism.Lecture2;

import Polymorphism.Lecture2.CommissionEmployee;

public  class BasePlusCommissionEmployee extends CommissionEmployee {

    private double base_salary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socailSecurityNumber, double grossSale,
                                      double commissionRate, double base_salary){
        super(firstName,lastName,socailSecurityNumber,grossSale,commissionRate);
        this.base_salary = base_salary;
    }

    public double getBase_salary() {
        return base_salary;
    }

    public void setBase_salary(double base_salary) {
        this.base_salary = base_salary;
    }

    @Override
    public double earnings(){

        return base_salary + ( grossSale * commissionRate);
    }

    @Override
    public String toString() {
        return super.toString() +  "\nBasePlusCommissionEmployee{" +
                "base_salary=" + base_salary +
                '}';
    }
}
