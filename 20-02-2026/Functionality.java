import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employyee {
    int id;
    String designation;

    public Employyee(String designation, int id) {
        this.designation = designation;
        this.id = id;
    }

}

public class Functionality{
    static List<Employyee> emp = new ArrayList<>();
    public static void addEmployee(int id, String designation){
        emp.add(new Employyee(designation, id));
    }
    public static void updateEmployee(int id, String designation){
        for(Employyee e : emp){
            if(e.id==id){
                e.designation = designation;
                System.out.println(id +" "+ designation );
                break;
            }
        }
    }   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String[] sol = sc.nextLine().split(" ");
            String instruction = sol[0];
            int id = Integer.parseInt(sol[1]);
            String des = sol[2];
            if(instruction=="A"){
                addEmployee(id, des);
            }else{
                updateEmployee(id, des);
            }
        }

    }
    }

