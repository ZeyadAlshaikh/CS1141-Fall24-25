package RelationshipsAmongClasses;

public class Student extends Person{
    private String major;
    Object ob;


    public Student(String name, _Date dob,int ID,String major){
        super(name, dob, ID);
        this.major = major;
        //this.name = "kjlkjl";

    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString() +  "Student{" +
                "major='" + major + '\'' +
                '}';
    }
}
