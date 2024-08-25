package Introduction.Lecture2;

public class Tester {

    public static void main(String[] args) {
        Student s1 ;
        s1 = new Student("Khaled", "44590890890", "IS");
        Student s2 = new Student(s1);
//        s2.setName(s1.getName());
//        s2.setID(s1.getID());
//        s2.setMajor(s1.getMajor());



//        s1.setName("Ali");
//        s1.setID( "44512345");
//        s1.setMajor( "IS");

        System.out.printf("Student 1 Information:%nName:%s%nID:%s%nMajor:%s%n",s1.getName(), s1.getID(), s1.getMajor());

        System.out.printf("Student 2 Information:%nName:%s%nID:%s%nMajor:%s%n",s2.getName(), s2.getID(), s2.getMajor());


    }
}
