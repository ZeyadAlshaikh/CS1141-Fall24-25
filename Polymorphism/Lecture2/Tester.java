package Polymorphism.Lecture2;

public class Tester {
    public static void main(String[] args) {
        Payable[] pay = new Payable[2];
        pay[0] = new Invoice("HES333", "Mobile", 2,2000);
        pay[1] = new SalariedEmployee("Ali", "Khaled", "0000001", 18000);

        for(Payable p : pay){
            System.out.println(p.getPaymentAmount());
        }



//        Employee[] emp = new Employee[4];
//        emp[0] = new SalariedEmployee("Ali", "Khaled", "0000001", 18000);
//        emp[1] = new HourlyEmployee("Muhmmad", "Aws","987654",30,42);
//        emp[2] = new CommissionEmployee("Abdulaziz", "Zeyad", "876543567",50000,0.075);
//        emp[3] = new BasePlusCommissionEmployee("Abdulrahman", "Muthana",
//                "234567",
//                60000.0,
//                0.025,
//                1500.0
//        );
//
//
//        for( int i = 0 ; i< emp.length ; i++){
//            if( emp[i] instanceof BasePlusCommissionEmployee){
//                double old_base =  ((BasePlusCommissionEmployee)emp[i]).getBase_salary();
//                double new_base = old_base * 1.1;
//                ((BasePlusCommissionEmployee)emp[i]).setBase_salary(new_base );
//            }
//            System.out.println(emp[i]);
//            System.out.println(emp[i].earnings());
//        }
//
//
//
//        for( int i = 0 ; i< emp.length ; i++){
//            if( emp[i] instanceof BasePlusCommissionEmployee){
//                double old_base =  ((BasePlusCommissionEmployee)emp[i]).getBase_salary();
//                double new_base = old_base + old_base * 1.1;
//                ((BasePlusCommissionEmployee)emp[i]).setBase_salary(new_base );
//            }
//            System.out.println(emp[i]);
//            System.out.println(emp[i].earnings());
//        }
    }
}
