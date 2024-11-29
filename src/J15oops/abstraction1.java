package J15oops;


abstract class Animal{
    public void get(){
        System.out.println("hello animal");
    }
}
class lion extends Animal{
    public void get(){
        super.get();
        System.out.println("hello lion");
    }
}

public class abstraction1 {
    public static void main(String[] args) {
        lion a = new lion();
        a.get();
//        Animal aa = a;
//        aa.get();
    }
}
