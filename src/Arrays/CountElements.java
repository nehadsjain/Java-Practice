package Arrays;

import java.util.Scanner;

public class CountElements {
    static void countOccurences(int[] a,int k){
        int count=0;
        for (int i=0;i<a.length;i++){
            if(a[i] == k){
                count++;
            }
        }
        if(count>0){
            System.out.println(k+" appears "+count+" times");
        }
        else {
            System.out.println(k+" appears 0 times");
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no.of elements:");
        int n =s.nextInt();
        System.out.print("Enter element to be searched:");
        int k = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements:");
        for (int i=0;i<a.length;i++){
            a[i] = s.nextInt();
        }
        countOccurences(a,k);
    }
}
