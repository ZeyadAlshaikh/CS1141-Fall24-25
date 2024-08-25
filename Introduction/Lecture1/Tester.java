package Introduction.Lecture1;



public class Tester {

    public static void main(String[] args) {

        Account acc1 ;
        acc1 = new Account();
        acc1.setAccountNumber("132342342342");
        acc1.setName("Ahmad Ibraheam");
        acc1.setBalance( 160.02);

        System.out.printf(acc1.toString());

        acc1.deposit(990);
        System.out.printf(acc1.toString());
        acc1.widthdraw(1000);
        System.out.printf(acc1.toString());

        acc1.setBalance(-500.00);
        System.out.printf(acc1.toString());

//        Account acc2 = new Account();
//        acc2.accountNumber = "ACC2342342";
//        acc2.name = "Muhammad Ibraheam";
//        acc2.balance = 160000.02;
//        System.out.printf(acc2.toString());
    }
}
