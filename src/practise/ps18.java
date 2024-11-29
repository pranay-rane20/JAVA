package practise;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ps18 {
    public static void main(String[] args)  throws IOException {
        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(str);

        String dt = br.readLine();
        System.out.println(dt);
        Integer data = Integer.parseInt(br.readLine());
        System.out.println(data);

    }
}
