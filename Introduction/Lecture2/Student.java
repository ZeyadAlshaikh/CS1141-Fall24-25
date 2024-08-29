package Introduction.Lecture2;

public class Student {

    // instance variables
    private String name, major;
    private final String ID ;
    private static int counter = 0;


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
        this.counter++;
    }


    // copy constructor....
    public Student(Student s1){
        this(s1.name,s1.ID,s1.major);

    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name ;
    }

//    public void setID(String ID){
//        this.ID = ID;
//    }
    public String getID(){
        System.out.println(getAreaCode());
        return ID ;
    }

    public void setMajor(String major){
        this.major = major;
    }
    public String getMajor(){
        return major ;
    }


    public String toString(){
        return String.format("Student Information:%nName:%s%nID:%s%nMajor:%s%n Total Students: %d%n",this.name, this.ID, this.major, this.counter);
    }

    public static int getAreaCode(){
       // System.out.println(getName()); this will cause an error
        return 966;
    }

    public static  void setCounter(int count){
        counter = count;
    }

    public static int getCounter(){
        return counter;
    }

}

class Class1{

}

class Class2{

}
