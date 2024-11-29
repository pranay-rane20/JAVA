package J15oops;
class A{
    private  int temp;
    public int getTemp() {
        return temp;
    }
    public void setTemp(int temp) {
        this.temp = temp;
    }
}
public class oops2 {
    public static void main(String[] args) {
        A obj = new A();
//        System.out.println();
        obj.setTemp(44);
        System.out.println(obj.getTemp());
    }


}
