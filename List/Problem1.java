

public class Problem1 {
    public static void main(String[] args) {
        MyArrayList arr = new MyArrayList();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.add(70);
        arr.add(90);
        arr.add(80);
        arr.add(100);
        
        arr.print();
        System.out.println(" ");
        System.out.println(arr.search(90));
        arr.remove(3);
        //System.out.println(" ");
        System.out.println(arr.get(5));
        //  System.out.println(arr.get(40));
        arr.sort();
        arr.print();

    }
    
}

class MyArrayList{
    private int[] data;
    private int size;

    public MyArrayList() {
        data=new int[4];
        size=0;
        
    }

    

    public void add(int a) {
        if(size==data.length){
            resize();
        }
        data[size++]=a;
        
    }
    private void resize(){
        int[] newData = new int[data.length*2];
        for(int i =0; i<data.length; i++){
            newData[i]=data[i];
        }
        data=newData;
    }
    public void print(){
        System.out.print("[");
        for(int i = 0; i<size;i++){
            System.out.print(data[i]+" ");
        }
        System.out.print("]");
    }
    public int get(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }

    public void remove(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }


        for(int i=index;i<size-1;i++){
            data[i]=data[i+1];
        }
        data[size-1]=0;
        size-=1;
    }

    public int search(int find){
        for(int i =0; i<size; i++){
            if(find==data[i]){
                return i;
            }
        }
        return -1;
    }
    public void sort(){
        for (int i = 1; i < size; i++) {
            int key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
    }

}