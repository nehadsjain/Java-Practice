package Arrays;

import java.util.Scanner;

public class LeftRotateK {
    static void leftRotateK(int[] a,int k){
        k = k % a.length;
        while (k>0){
            int first = a[0];
            for (int i=1;i<a.length;i++){
                a[i-1] = a[i];
            }
            a[a.length-1] = first;
            k--;
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter K vaue:");
        int k = s.nextInt();
        System.out.print("Enter no.of elements:");
        int n =s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements:");
        for (int i=0;i<a.length;i++){
            a[i] = s.nextInt();
        }
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]+"\t");
        }
        leftRotateK(a,k);
    }
}
