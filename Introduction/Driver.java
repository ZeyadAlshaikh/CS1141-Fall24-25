package Introduction;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Person p1 = new Person();

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your name, age, and ID");
        p1.name = in.next();
        p1.age = in.nextInt();
        p1.ID = in.next();

        System.out.println(p1);


    }
}
