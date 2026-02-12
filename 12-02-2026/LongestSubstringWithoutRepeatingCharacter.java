
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        System.out.print("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(nonRepeatingStringLength(s));
        
    }
    public static int nonRepeatingStringLength(String s){
        Set<Character> set = new HashSet<>();
        int left = 0;
        int length =0;
// we will have 2 pointers: left and right 
//remove from left, add  from right
        for (int right = 0; right< s.length(); right++ ){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            length= Math.max(length, right-left+1);
        }
        return length;
    }
}
