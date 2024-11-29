package J11OOPS;

public class student {
    String name;
    String college;
    int rollno;

    public void init(String name, int rollno , String college){
        this.name = name;
        this.college = college;
        this.rollno = rollno;
    }

    public student(){}

    public student(String name, int rollno , String college){
        this.name = name;
        this.college = college;
        this.rollno = rollno;
    }


    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", college='" + college + '\'' +
                ", rollno=" + rollno +
                '}';
    }
}
