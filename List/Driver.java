public class Driver{
    public static void main(String[] args) {
        SinglyLinkedList s1 = new SinglyLinkedList();
        s1.insertAtBeginning(23);
        s1.insertAtBeginning(24);
        s1.insertAtLast(76);
        s1.insertAtLast(45);
        s1.traverse();
    }
}

class SinglyLinkedList {
    Node head;
    void insertAtBeginning(int data){
        Node newNode= new Node(data);
        newNode.next= head;
        head = newNode;
    }

    void insertAtLast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void traverse(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp=temp.next;
        }
        System.out.println("Null");
    }


}


class Node{
    int data;
    Node next;

    Node(int data){
        this.data= data;
        this.next= null;
    }
}