
public class Problem3 {

    public static void main(String[] args) {
        MyArrayList<String> arr = new MyArrayList<>();
        MyArrayList<Integer> arr1 = new MyArrayList<>();
        arr.add("Hell");
        arr.add("Heo");
        arr.add("Hello");
        arr.add("o");
        arr1.add(10);
        arr1.add(40);
        arr1.add(30);
        arr1.add(20);
        arr.print();
        arr1.print();
        System.out.println(arr1.search(10));
        System.out.println(arr.search("Hell"));
        //arr.remove(0);       
        //arr.remove(0);       
        arr.print();
        arr1.print();
        arr1.sort();
        arr1.print();
        arr.sort();
        arr.print();

    }

}

class MyArrayList<T> {

    private T[] data;
    private int size;

    public MyArrayList() {
        data = (T[]) new Object[4];
        size = 0;

    }

    public void add(T a) {
        if (size == data.length) {
            resize();
        }
        data[size++] = a;

    }

    private void resize() {
        T[] newData = (T[]) new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.print("]");
        System.out.println();
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size -= 1;
    }

    public int search(T find) {
        for (int i = 0; i < size; i++) {
            if (find.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }

    public void sort() {
        
        }
    }

}
