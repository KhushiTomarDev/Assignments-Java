
class Node {

    String key;
    int value;
    Node next;

    Node(String key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

class MyHashMap {

    private Node[] table;
    private int size;

    // Constructor
    public MyHashMap(int capacity) {
        table = new Node[capacity];
        size = capacity;
    }

    // Custom hash function (replacement for hashCode)
    private int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash += key.charAt(i);
        }
        return hash % size;
    }

    // PUT operation
    public void put(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);

        // If bucket is empty
        if (table[index] == null) {
            table[index] = newNode;
            return;
        }

        // Collision handling using chaining
        Node current = table[index];
        while (current != null) {

            // If key already exists, update value
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }

            if (current.next == null) {
                break;
            }

            current = current.next;
        }

        // Insert at end of chain
        current.next = newNode;
    }

    // GET operation
    public Integer get(String key) {
        int index = hash(key);
        Node current = table[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null; // key not found
    }

    // REMOVE operation
    public void remove(String key) {
        int index = hash(key);
        Node current = table[index];
        Node prev = null;

        while (current != null) {
            if (current.key.equals(key)) {

                // If node is first in chain
                if (prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }

            prev = current;
            current = current.next;
        }
    }
}

public class Main {

    public static void main(String[] args) {

        MyHashMap map = new MyHashMap(10);

        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("A", 100); // update

        System.out.println(map.get("A")); // 100
        System.out.println(map.get("B")); // 20
        System.out.println(map.get("Z")); // null

        map.remove("B");
        System.out.println(map.get("B")); // null
    }
}
