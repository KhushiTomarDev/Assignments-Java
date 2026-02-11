
public class Problem6 {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(12);
        stack.push("Hi");
        stack.push(56);
        stack.push(34);

        stack.pop();
        stack.peek();
        System.out.println(stack.isEmpty());
    }

}

class Node<T> {

    T data;
    Node next;

    Node (T data) {
        this.data = data;
        this.next = null;

    }
}

class Stack<T> {

    Node top;

    void push(T value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + " is pushed into the Stack!");
    }

     T pop() {
        if (top == null) {
            System.out.println("Stack Under flow");
            return null;
        }
        T popped = (T) top.data;
        top = top.next;
        System.out.println("Popped: " + popped);
        return popped;
    }

    T peek() {
        if (top == null) {
            System.out.println("Stack Under flow");
            return null;
        }
        System.out.println("The data at top is : " + top.data);
        return (T) top.data;
    }

    boolean isEmpty() {
        if (top == null) {
            System.out.println("Empty");
            return true;
        }
        return false;
    }
}
