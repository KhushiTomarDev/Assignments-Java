
import java.util.PriorityQueue;
//import java.util.Random;

public class MinHeapExample {

    public static void main(String[] args) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Insert 10 random numbers
//-------------------Method 1--------------------------------------       
        // Random random = new Random();
        // for (int i = 0; i < 10; i++) {
        //     int num = random.nextInt(100);
        //     minHeap.add(num);
        //     System.out.print(num + " ");
        // }

//--------------------Method 2--------------------------------------
        minHeap.add(34);
        minHeap.add(23);
        minHeap.add(89);
        minHeap.add(44);
        minHeap.add(100);
        minHeap.add(3);
        minHeap.add(0);
        minHeap.add(45);
        minHeap.add(90);
        minHeap.add(88);

        System.out.println(minHeap);
        System.out.print("\nSorted order: ");
        System.out.println(minHeap.peek());
        // Print in sorted order
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
        //System.out.println(minHeap);
    }
}
