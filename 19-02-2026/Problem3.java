
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Id: " + id +" Name: " + name +  " Marks: "+ marks ; 
    }

}

public class Problem3 {
    public static void main(String[] args) throws ClassNotFoundException {
        Student s1 = new Student(1, "Smith", 76);
        Student s2 = new Student(2, "Allen", 65);

        File file = new File("sample.dat");
        try {
            if(file.createNewFile()){
                System.out.println("File Created Successfully!");
            }
            else{
                System.out.println("Already exists!!");
            }
        
    
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s1);
        oos.writeObject(s2);

        oos.close();
        fos.close();

        System.out.println("---Object Serialization Done---");

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        while (true) { 
            try {
                Student student = (Student) ois.readObject();
                System.out.println(student);
                
            } catch (EOFException e) {
                System.out.println("End of file");
                break;
            }
            
        }
            ois.close();
            fis.close();

    }
     catch (IOException ex) {
           System.out.println("Exception");
    }
    finally{
        System.out.println("Task done");
    }
}}
    

