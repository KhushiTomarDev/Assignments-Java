
import java.util.Scanner;

//https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/description/?envType=problem-list-v2&envId=sliding-window

public class KReapeating {
    public static void main(String[] args) {
        System.out.print("Enter your String : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(longestString(s, 3));
        
    }
    public static int longestString(String s,int k){
        int n = s.length();
        int[] freq= new int[26]; 
        for(int i =0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }

        for(int i =0; i<s.length(); i++){
            if(freq[s.charAt(i)-'a']<k){
                int leftSubArray = longestString(s.substring(0, i), k);
                int rightSubArray = longestString(s.substring(i+1), k);
                return Math.max(leftSubArray, rightSubArray);
            }
        }
        return n;
    }
}
