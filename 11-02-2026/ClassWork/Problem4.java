
import javax.management.RuntimeErrorException;

class Student {

    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

interface Function<T, K> {

    K call(T obj);
}

// Generic Extractor Class
class DynamicExtractor<T, K> {

    private Function<T, K> function;

    // Constructor
    DynamicExtractor(Function<T, K> function) {
        this.function = function;
    }

    // Extract method
    K extract(T obj) {
        return function.call(obj);
    }
}


interface Comparator<T> {

    int compare(T a, T b);
}

class UniComparator<T> implements Comparator<T> {

    public int compare(T a, T b) {
        if (a == null && b == null) {
            return 0;
        }
        if (a == null) {
            return -1;
        }
        if (b == null) {
            return 1;
        }

        if (a instanceof Integer && b instanceof Integer) {
            return (Integer) a - (Integer) b;
        }
        if (a instanceof String && b instanceof String) {

            int len = Math.min(((String) a).length(), ((String) b).length());
            for (int i = 0; i < len; i++) {
                if (((String) a).charAt(i) != ((String) b).charAt(i)) {
                    return ((String) a).charAt(i) - ((String) b).charAt(i);
                }
            }
            return ((String) a).length() - ((String) b).length();
        }
        throw new RuntimeErrorException(null, "Unsupported Type");

    }
}




public class Problem4{

    public static void main(String[] args) {
        MyArrayList<String> arr = new MyArrayList<>();
        MyArrayList<Integer> arr1 = new MyArrayList<>();
        MyArrayList<Student> arr2 = new MyArrayList<>();

        arr2.add(new Student(1,"Sandy", 13));
        arr2.add(new Student(2,"Dam", 15));
        arr2.add(new Student(3,"Sam", 17));
        arr2.add(new Student(4,"Raj", 19));

        DynamicExtractor<Student, String> extractor = new DynamicExtractor(student -> student.name);
        Comparator<String> uc = new UniComparator<>();

        arr2.sort(extractor, uc);
        arr2.print();
        
    }

}

class MyArrayList<T> {

    private T[] data;
    private int size;

    MyArrayList() {
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
        for (int i = 0; i < size; i++) {
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

    public <K> void sort(DynamicExtractor<T,K> extractor, Comparator<K> uc ) {

        for(int i = 0; i<size-1; i++){
            for (int j = 0; j < size-1-i; j++) {
                T obj1 = data[j];
                T obj2 = data[j+1];

                K key1 = extractor.extract(obj1);
                K key2 = extractor.extract(obj2);

                if(uc.compare(key1, key2)>0){
                    T temp = data[j];
                    data[j]= data[j+1];
                    data[j+1]= temp;

                }

            }
        }
       

    }
}


