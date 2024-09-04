package Tut02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex01 {
public static void shortenFile(String inputfile, String outputfile)  {
    try{
        Scanner sc = new Scanner(new File(inputfile));
        PrintWriter pw = new PrintWriter(outputfile);

        while(sc.hasNextLine()) {
            String line = sc.nextLine().trim().replaceAll("\\s+", " ");
            pw.println(line);
        }

        sc.close();
        pw.close();
        System.out.println("File processing complete");
    }catch(Exception e){
        System.out.println("File not found: " + e.getMessage());
    }


}

    public static void main(String[] args) {

    if (args.length !=2){
        System.out.println("Usage: java SimpleFileShortener <inputFilename> <outputFilename>");
        return ;
    }
        String inputfile = args[0];
        String outputfile = args[1];
        shortenFile(inputfile, outputfile);
    }
}
