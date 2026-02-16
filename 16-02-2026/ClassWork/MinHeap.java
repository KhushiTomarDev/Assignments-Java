
class MinHeap {

    int[] heap;
    int size;
    int capacity;

    // Constructor
    MinHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.size = 0;
    }

    // Get parent index
    private int parent(int i) {
        return (i - 1) / 2;
    }

    // Get left child index
    private int leftChild(int i) {
        return 2 * i + 1;
    }

    // Get right child index
    private int rightChild(int i) {
        return 2 * i + 2;
    }

    // Swap function
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Insert element
    public void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap is full");
            return;
        }

        heap[size] = value;
        size++;

        heapifyUp(size - 1);
    }

    // Heapify Up (for insert)
    private void heapifyUp(int index) {
        while (index > 0 && heap[parent(index)] > heap[index]) {
            swap(parent(index), index);
            index = parent(index);
        }
    }

    // Extract minimum element
    public int extractMin() {
        if (size == 0) {
            System.out.println("Heap is empty");
            return -1;
        }

        int min = heap[0];

        // Move last element to root
        heap[0] = heap[size - 1];
        size--;

        heapifyDown(0);

        return min;
    }

    // Heapify Down (for delete)
    private void heapifyDown(int index) {
        int smallest = index;

        int left = leftChild(index);
        int right = rightChild(index);

        if (left < size && heap[left] < heap[smallest]) {
            smallest = left;
        }

        if (right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }

        if (smallest != index) {
            swap(index, smallest);
            heapifyDown(smallest);
        }
    }

    // Peek minimum
    public int peek() {
        if (size == 0) {
            System.out.println("Heap is empty");
            return -1;
        }
        return heap[0];
    }

    // Print heap
    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}
