package J12String;
//Leetcode2114

public class s11Leetcode {
    public static void main(String[] args) {
        String [] s = {"hello i", "why to the", "when is to the one"};
        int max=0;
        int n = s.length;
        for(int i=0; i<n; i++){
            String one[] = s[i].split(" ");
            max= Math.max(max,one.length);
        }
        System.out.println(max);
    }
}
