package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fh2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String proname = sc.next();
        String pathname = "//Users//prana//OneDrive//Desktop//New folder//";
        File folder = new File(pathname + proname);
        folder.mkdir();

        File flHtml = new File(pathname + proname + "//index.html");
        flHtml.createNewFile();

        FileWriter fwhtml = new FileWriter(flHtml);
        fwhtml.write("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Document</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    \n" +
                "</body>\n" +
                "</html>");
        fwhtml.close();


        //css file
        File flcss = new File(pathname + proname + "//style.css");
        flcss.createNewFile();

        FileWriter fwcss = new FileWriter(flcss);
        fwcss.write("*{\n" +
                "    margin: 0;\n" +
                "    padding: 0;\n" +
                "}");
        fwcss.close();



    }
}
