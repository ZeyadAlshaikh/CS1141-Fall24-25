package RelationshipsAmongClasses;//package RelationshipAmongClasses;

public class Person {
    private String name;//composition
    private final int ID;
    private _Date dob;//composition
    private static int count;



    public Person(String name, _Date dob,int iD) {
        this.name = name;
        this.ID = iD;
        this.dob = dob;
        count++;
    }

    public static int getCount(){
        return count;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getID() {
        return ID;
    }


    public _Date getDob() {
        return dob;
    }


    public void setDob(_Date dob) {
        this.dob = dob;
    }


    @Override
    public String toString() {
        return "name=" + name + ", ID=" + ID + ", dob=" + dob ;
    }






}