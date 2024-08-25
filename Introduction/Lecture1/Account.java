package Introduction.Lecture1;

public class Account {

    // Instance variables
    private String  name, accountNumber;
    private double balance;
    //class variable
    static String bankName = "Alrajhi";


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setBalance(Double balance){
        if( balance <0){
            System.out.println("balance must be >=0");
        }else
            this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

    public void widthdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("Take the money ");
        }else{
            System.out.println("No fund ");
        }

    }

    public void deposit(double amount){
        balance += amount;

    }

    public String toString(){
        return String.format("Bank Name:%s%nName: %s%nAccount Number:%s%nBalance: %.2f%n", bankName, name, accountNumber, balance);
    }

}
