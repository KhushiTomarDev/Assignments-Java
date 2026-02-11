

public class Problem5 {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(12);
        stack.push(76);
        stack.push(56);
        stack.push(34);
        
        stack.pop();
        stack.peek();
        System.out.println(stack.isEmpty());
    }
    
}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;

    }
}


class Stack{
     Node top;

    void push(int value){
         Node newNode = new Node(value);
         newNode.next= top;
         top = newNode;
         System.out.println(value + " is pushed into the Stack!");
     }

    int pop(){
        if(top==null){
            System.out.println("Stack Under flow");
            return -1;
        }
        int popped = top.data;
        top= top.next;
        System.out.println("Popped: " + popped);
        return popped;
    }

    int peek(){
        if (top == null) {
            System.out.println("Stack Under flow");
            return -1;
        }
        System.out.println("The data at top is : " + top.data);
        return top.data;
    }

    boolean isEmpty(){
        if (top == null) {
            System.out.println("Empty");
            return true;
        }
        return false;
    }
}