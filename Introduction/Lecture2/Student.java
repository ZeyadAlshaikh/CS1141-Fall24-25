package Introduction.Lecture2;

public class Student {

    // instance variables
    private String name, ID, major;


    public Student(){
        this("NA","NA","NA");
        System.out.println("Call no argument constructor");


    }

    public Student(String name){
        this(name, "NA", "NA");
        System.out.println(" Constructor with String name ");


    }

    public Student(String name, String ID){
        this(name, ID, "NA");
        System.out.println(" Constructor with String name and ID ");


    }

    public Student(String name, String ID, String major){
        System.out.println(" Constructor with String name, ID and major");
        this.name = name;
        this.ID = ID;
        this.major = major;
    }


    // copy constructor....
    public Student(Student s1){
        this.name = s1.name;
        this.ID = s1.ID;
        this.major = s1.major;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name ;
    }

    public void setID(String ID){
        this.ID = ID;
    }
    public String getID(){
        return ID ;
    }

    public void setMajor(String major){
        this.major = major;
    }
    public String getMajor(){
        return major ;
    }



}

class Class1{

}

class Class2{

}
