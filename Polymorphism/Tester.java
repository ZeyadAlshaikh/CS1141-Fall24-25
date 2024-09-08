package Polymorphism;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Employee[] emp = {
                new BasePlusCommissionEmployee("Ali","Ahmad",
                "12312342", 500000.0, 0.1, 15000)
                    , new CommissionEmployee("Ali","Ahmad",
                "12312342", 500000.0, 0.1)};

        for( int i =0; i< emp.length; i++)
            if( emp[i] instanceof  CommissionEmployee)
                ((CommissionEmployee)emp[i]).commissionSpecial();
//


//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Please enter the number of employee");
//        int size = in.nextInt();
//
//        Employee[] emp = new Employee[size];
//        {
//                new BasePlusCommissionEmployee("Ali","Ahmad",
//                "12312342", 500000.0, 0.1, 15000)
//                    , new CommissionEmployee("Ali","Ahmad",
//                "12312342", 500000.0, 0.1)};

        //System.out.println(emp[0].earnings());


//        for( int i =0; i< emp.length; i++){
//            System.out.println("Please enter 1 if Commission Employee or 2 if Base Plus Commission Employee");
//            int type = in.nextInt();
//            if( type == 1){
//                System.out.println("Please enter the following information: first name, last name, SSN, gross sale and commission rate");
//                String firstName = in.next();
//                String lastName = in.next();
//                String SSN = in.next();
//                double grossSale = in.nextDouble();
//                double commissionRate = in.nextDouble();
//                emp[i] = new CommissionEmployee(firstName,lastName,SSN,grossSale,commissionRate);
//
//            }else{
//                System.out.println("Please enter the following information: first name, last name, SSN, gross sale, commission rate and base salary");
//                emp[i] = new BasePlusCommissionEmployee(in.next(),in.next(),in.next(),in.nextDouble(), in.nextDouble(), in.nextDouble());
//            }
//
//        }
//
//
//
//        for( int i =0; i< emp.length; i++)
//            System.out.println(emp[i].earnings());



//        SuperClass[] array = new SuperClass[3];
//
//        array[0] =new SubClass1();
//        array[0].print();
//
//        array[1]= new SubClass2();
//        array[1].print();
//
//        array[2]= new SubClass3();
//        array[2].print();

    }
}
