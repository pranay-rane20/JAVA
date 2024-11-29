package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fh1 {
    public static void main(String[] args) throws IOException {
        File fl = new File("C://Users//prana//OneDrive//Desktop//New folder//pranay.txt");
//        fl.mkdir();
        fl.createNewFile();
//        System.out.println(fl.mkdir());
//        System.out.println(fl.createNewFile()); //creating a new file
//        fl.delete();

//        System.out.println(fl.isDirectory());
//        System.out.println(fl.exists());
//        System.out.println(fl.getName());
//        System.out.println(fl.getAbsolutePath());


        //to write in a file
        FileWriter fw = new FileWriter(fl);
        fw.write("hello bhai kya haal chall");
        fw.close();



        //without opening a file read the document
//        1->
        Scanner sc = new Scanner(fl);
        while(sc.hasNext()){
            String data = sc.nextLine();
            System.out.println(data);
        }
//        2->
        FileReader fr = new FileReader(fl);
        int i;
        while((i=fr.read())!=-1){
            System.out.print((char)i);
        }

    }
}
