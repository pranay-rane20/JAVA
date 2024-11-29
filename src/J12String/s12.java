package J12String;
//String Builder

public class s12 {
    public static void main(String[] args) {
        String s="labrador";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb);
        sb.append("abcd");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        s= sb.toString();


        String s1= " raneji";
        String s2 = new StringBuilder(s1).reverse().toString();
        System.out.println(s2);
//        insert()
//                delete()
//                deleteCharAt()


    }
}
