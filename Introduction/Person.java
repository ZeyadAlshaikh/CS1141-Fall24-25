package Introduction;

public class Person {

    String name,ID;
    int age;
    public String toString(){
        return String.format("Name: %s%nAge:%d%nID:%s%n", name, age, ID);
    }
}
