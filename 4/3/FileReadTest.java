import java.util.*;
import java.io.*;
class FileReadTest {
    public static void main(String[] args){
        if (args.length < 1)
            System.exit(0);
        String filename = args[0];
        try {
            FileReader reader = new FileReader(filename);
            // reader.close();
            int ch = reader.read();
            System.out.println((char)ch);
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("IOError.");
        }
    }
}