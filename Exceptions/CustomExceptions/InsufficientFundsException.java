package Exceptions.CustomExceptions;

public class InsufficientFundsException extends Exception{

    private  double amount ;

    InsufficientFundsException(double amount){
        this.amount = amount;
    }

//    @Override
//    public String toString(){
//        return "You are short of $"+amount+"\n";
//    }

    public double getAmount(){
        return amount;
    }
}
