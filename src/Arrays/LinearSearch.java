package Arrays;

import java.util.Scanner;

public class LinearSearch {
    static void linearSearch(int a[], int k){
        boolean found = false;
        int pos=0;
        for (int i=0;i<a.length;i++){
            if(a[i] == k) pos=i; found=true;
        }
        if(found){
            System.out.println("Element found at index:"+pos);
        }else {
            System.out.println("Element not found");
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
        linearSearch(a,k);
    }
}
