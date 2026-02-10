package List.Activity.Activity1;
import java.util.ArrayList;
import java.util.Collections;

public class Activity1 {
//-----------Choosing the Right Data-------------
 
//Student record system → ArrayList
//Frequent access by index (roll no / position)        

// Browser history → LinkedList
// Back & forward navigation Online shopping cart → LinkedList
// Frequent insertion / deletion

// Undo / Redo feature → LinkedList
//Move back and forth easily

 public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(70);
        marks.add(85);
        marks.add(60);
        marks.add(90);
        marks.add(75);

        
        marks.add(2, 88);

        
        int min = Collections.min(marks);
        marks.remove(Integer.valueOf(min));

        System.out.println("Final Marks: " + marks);
    }
//-------------Viva Questions----------------


// 1. Why is ArrayList access faster?
// Answer:ArrayList stores elements in a continuous array.Because of index
// -based access, any element can be accessed directly using its index, which makes access time O(1).

// Q2. Why does LinkedList consume more memory?
// Answer: LinkedList stores each element in a node that contains data
// and a reference to the next node, so extra memory is required for pointers.

// Q3. What is the time complexity of insertion at the beginning in SLL?
// Insertion at the beginning of a singly linked list is O(1)
// because only the head reference is updated.

// Q4. Difference between Singly Linked List and Doubly Linked List
// Singly Linked List: each node has data and reference to next node only.
// Doubly Linked List: each node has data, reference to previous and next node.
// Doubly linked list uses more memory but allows two-way traversal.

// Q5. What is RandomAccess interface?
// RandomAccess is a marker interface in Java that indicates
// a list supports fast index-based (random) access.
// ArrayList implements RandomAccess, LinkedList does not.




}
