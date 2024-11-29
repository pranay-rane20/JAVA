package J6dowhile;
//switch statements

public class switch1 {
    public static void main(String[] args) {
        int day = 2;
        switch(day){
            case 1  : {
                System.out.println("Monday");
                break;
            }
            case 2 : {
                System.out.println("tues");
                break;
            }
            case 3 : {
                System.out.println("wed");
                break;
            }
            default:{
                System.out.println("not valid");
            }

        }
    }
}
