
import java.util.Scanner;

//Stack using Array

public class CodingTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack(5);

        int choice;

        do {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;
                    case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);
    }
    
}

class Stack{
    int[] arr;
    int top;
    int size;

    Stack(int size){
        this.size = size;
        arr= new int[size];
        top=-1;
    }

    void push(int value){
        if(top==size-1){
            System.out.println("Stack Overflowed");
        }
        else{
        top++;
        arr[top]= value;
        System.out.println(value + " pushed into the Stack");
    }
    }

    void peek(){
        if(top==-1){
            System.out.println("Stack is Empty");
        }
        else{
        System.out.println(arr[top]);}
    }
    void pop(){
        if (top == -1) {
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println(arr[top]+ " Popped");
            top--;
        }
    }
    void display(){
        if (top == -1) {
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println("The elements are : ");
            for(int i = top; i>=0; i--){
                System.out.println(arr[i]);
            }
        }
    }
}
