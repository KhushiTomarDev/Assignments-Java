
import java.io.FileReader;
import java.io.IOException;

public class Problem2 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("logFile.txt");
            System.out.println("I/O operation completed successfully. ");
        } catch (IOException e) {
            System.out.println("An I/O error occurred");
        }
        finally{
            try{
                if(reader != null){
                    reader.close();
                
                }}catch(IOException e){
                    System.out.println("An I/O error occurred");
            }
            
        }
    }
    
}
