
interface Comparator<T>{
    int compare(T a, T b);//int cause we need 3 integer value -1,1,0
}

class IntegerCompare implements Comparator<Integer>{
    public int compare(Integer a, Integer b){
        return a-b;
    }
}

class StringCompare implements Comparator<String>{
    public int compare(String a, String b){
        int len = Math.min(a.length() , b.length());
        for(int i = 0; i<len; i++){
            if(a.charAt(i)!=b.charAt(i)){
                return a.charAt(i)-b.charAt(i);
            }
        }
        return a.length()-b.length();

    }
}




public class Program1 {
    public static void main(String[] args) {
        Comparator<Integer> compInt = new IntegerCompare();
        Comparator<String> compStr = new StringCompare();
        System.out.println(compInt.compare(10, 20));
        System.out.println(compStr.compare("abc","cde"));
    }
    
}
