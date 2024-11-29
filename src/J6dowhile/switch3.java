package J6dowhile;
//in switch expression ,default is necessary
//yield is written when we have to execute more than one line

public class switch3 {
    public static void main(String[] args) {
        int day = 3;
        String res = switch (day){
            case 1 -> {
                yield "monday";
            }
            case 2 -> {
                yield "tuesday";
            }
            default -> {
                yield "glt input";
            }
            case 3 -> "wed";
        };
        System.out.println(res);
    }
}
