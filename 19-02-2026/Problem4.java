
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Problem4 {

    public static void main(String[] args) {

        
        File file = new File("sample.txt");

        try {
            
            if (file.createNewFile()) {
                System.out.println("File created successfully ");
            } else {
                System.out.println("File already exists");
            }

            
            FileWriter writer = new FileWriter(file);
            writer.write("This is a sample text");
            writer.close();

            System.out.println("Data written successfully");

           
            FileReader reader = new FileReader(file);

            int data;
            System.out.println("File content:");

            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred");
            
        }
    }
}
