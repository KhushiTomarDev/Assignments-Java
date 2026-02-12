//https://leetcode.com/problems/contains-duplicate-ii/description/?envType=problem-list-v2&envId=sliding-window

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicate2{
    public static boolean duplicate(int[] arr, int k){
    Set<Integer> vissi = new HashSet<>();
    for(int i = 0; i<arr.length; i++){
        if(i>k){
            vissi.remove(arr[i-k-1]);
        }
        if(vissi.contains(arr[i])){
            return true;
        }
        vissi.add(arr[i]);
    }
    return false;
    }
    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter the number : ");
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0; i<n ; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println(duplicate(arr, k));

    }
}

