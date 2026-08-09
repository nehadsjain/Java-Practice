package Arrays;

import java.util.Scanner;

public class ReverseArray {
    static void reverseArr(int[] a){
        int n= a.length;
        for (int i=0,j=n-1;i<j;i++,j--){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        System.out.print("\nReversed Array:");
        for (int i=0;i<n;i++){
            System.out.print(a[i]+"\t");
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no.of elements:");
        int n =s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements:");
        for (int i=0;i<a.length;i++){
            a[i] = s.nextInt();
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
        reverseArr(a);
    }
}
