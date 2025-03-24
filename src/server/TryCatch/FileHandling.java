package server.TryCatch;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("\"C:\\Userss\\User\\Desktop\\java.docx\""));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Oops! We can't find your file: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Failed to close the reader: " + e.getMessage());
            }
            System.out.println("Program continues...");
        }
    }
}
