
import java.util.Scanner;



public class Problem1 {

    public static void main(String[] args) {
        System.out.println("Entry Point");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();

        try {
            int c = a / b;
            System.out.println("Try Block");

        } catch (ArithmeticException e) {
            System.out.println("Invalid");

        } finally {
            sc.close();
            System.out.println("Finally Block");

        }
    }

}
    

