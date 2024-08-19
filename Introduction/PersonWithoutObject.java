package Introduction;
import java.util.Scanner;
public class PersonWithoutObject {

    public static void main(String[] args) {
        String name,ID;
        int age;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your name, age, and ID");
        name = in.next();
        age = in.nextInt();
        ID = in.next();

        System.out.printf("Name: %s%nAge:%d%nID:%s%n", name, age, ID);

    }
}