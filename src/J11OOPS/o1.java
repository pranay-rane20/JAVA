package J11OOPS;

public class o1 {
    public static void main(String[] args) {
        student obj = new student();
        obj.name = "arpit";
        obj.college = "LNCT";
        obj.rollno = 23;

        //reference
        student obj2 = new student();
        obj2.name = "rane";
        obj2.college = "LNCT";

        //method
        student obj3 = new student();
        obj3.init("pranay",21,"LNCT");

        //constructor
        student obj4 = new student("rane",33,"LNCT");

        System.out.println(obj4.toString());
        System.out.println(obj4);

    }
}
