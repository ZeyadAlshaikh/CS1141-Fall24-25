package RelationshipsAmongClasses;

public class Tester {
    public static void main(String[] args) {



//         System.out.println("Total Objects is "+Person.getCount());
//
//         Person p1 = new Person("Ali", new _Date(1,1,2004),10001);
//         System.out.println(p1);
//         System.out.println("Total Objects is "+p1.getCount());
//
//
        Student st = new Student("Khaled", new _Date(31,12,2004), 10002,"IS");
         System.out.println(st);
         System.out.println("Total Objects is "+st.getCount());

         st.setName("Ali");
    }

}
