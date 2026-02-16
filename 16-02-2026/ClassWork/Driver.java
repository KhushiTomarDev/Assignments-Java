
public class Driver{

    public static void main(String[] args) {

        MinHeap h = new MinHeap(10);

        h.insert(30);
        h.insert(10);
        h.insert(20);
        h.insert(5);

        h.printHeap();   // Heap elements

        System.out.println("Min: " + h.peek());

        System.out.println("Extract Min: " + h.extractMin());

        h.printHeap();


//Max Heap

        MaxHeap h1 = new MaxHeap(10);

        h1.insert(30);
        h1.insert(10);
        h1.insert(20);
        h1.insert(5);

        h1.printHeap();   // Heap elements

        System.out.println("Min: " + h1.peek());

        System.out.println("Extract Min: " + h.extractMin());

        h.printHeap();

    }
}
