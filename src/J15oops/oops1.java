package J15oops;
import java.util.Scanner;
class studentt{
    int roll;
    String name;
    int marks;
    public int get() {
        System.out.println(roll + " " + name + " " + marks);
        return 0;
    }
    //method
    public void set(int roll , int marks , String name) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    public studentt(){}
    public studentt(String name, int roll , int marks){
        this.name = name;
        this.marks = marks;
        this.roll = roll;
    }
    @Override
    public String toString() {
        return "studentt{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
public class oops1 {
    public static void main(String[] args) {

        //reference
        studentt obj = new studentt();
        obj.name = "rane";
        obj.roll = 221;
        obj.marks = 98;
        System.out.println(obj);

        //method
        studentt obj1 = new studentt();
        obj1.set(121,98 , "Pranay");
        obj1.get();

        //constructor
        studentt obj4 = new studentt("rane",33,98);
        System.out.println(obj4.toString());
        System.out.println(obj4);
    }
}
