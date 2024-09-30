package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExamples {

    public static void main(String[] args) {

        boolean wrongType = true;
        //while(true ) {
            try {
                //ArrayIndexOutOfBoundsException
//                int[] array = new int[5];
//                array[6] = 10;
                //ClassCastException
                A a = new A();
                B b = (B) a;
                //NullPointerException
                Integer num1 = null;
                Integer num2= 20;
                Integer num3 = num1 + num2;

                //ArithmeticException
                int number1 = 5;
                number1 -= 5;
                int number2 = 10/number1;

                //divide by zero with float
                float floatNumber1 = 5;
                floatNumber1 -= 5;
                float floatNumber2 = 10/floatNumber1;
                System.out.println(floatNumber2);
                Scanner in = new Scanner(System.in);
                int x = in.nextInt();
                //wrongType = false;
                //break;

            }catch (ArrayIndexOutOfBoundsException| InputMismatchException ex){
                System.out.println("You entered index out of bound" );
            }
            catch (Exception e) {
                System.err.println("You entered a wrong type");
                System.out.println(e.toString());
                e.printStackTrace();
            }
            finally{
                System.out.println("Finally block");
            }
        //}

        System.out.println("Have a nice day");




    }
}

class A{

}
class B extends A{

}
