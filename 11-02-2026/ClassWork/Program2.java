
import java.util.function.IntBinaryOperator;

import javax.management.RuntimeErrorException;

interface Comparator<T>{
    int compare(T a, T b);
}

class UniComparator <T>  implements Comparator<T>{
    public int compare(T a, T b){
        if (a==null && b== null) return 0;
        if(a== null) return -1;
        if(b== null) return 1;

        if (a instanceof Integer && b instanceof Integer){
            return (Integer)a - (Integer)b;
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



public class Program2 {
    public static void main(String[] args) {
        Comparator<Integer> compInt = new  UniComparator<>();
        Comparator<String> compStr = new UniComparator<>();
        System.out.println(compInt.compare(10, 20));
        System.out.println(compStr.compare("abc", "cde"));
    }
}
