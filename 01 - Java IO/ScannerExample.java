import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ScannerExample {

    public static void main(String args) throws IOException {
        InputStream is = System.in;
        FileInputStream fis = new FileInputStream("path");
        Scanner in = new Scanner(is);
        //Scanner in = new Scanner(fis); // to read from the file with the given path

        int a = in.nextInt();
        double b = in.nextDouble();
        long c = in.nextLong();
        String d = in.next();
        String line = in.nextLine();

        /*
        * next(): Reads the next token until a delimiter (whitespace) is encountered.
        * nextLine(): Reads the entire line of input, including spaces, until the newline character is reached.
         */

        
        //reading until the end-of-file
        while (in.hasNextLine()) {
            String currline = in.nextLine();
        }

        fis.close();

        in.close(); // always close your resources it's good practice
    }
}


// 9/4/2024 7:43 PM by Yassine Abbou