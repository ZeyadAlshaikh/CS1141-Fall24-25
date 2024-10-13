package Generic;

public class Person <T>{
    String name;
    Object id;

    public Person(String name, T id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        Person<Integer> p1 = new Person<>("Ali", 123454);
        Person<String> p2 = new Person<>("Khaled","122423");

        System.out.println(p1);
        System.out.println(p2);

    }
}
