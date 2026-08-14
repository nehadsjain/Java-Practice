package Arrays;

import java.util.Scanner;

public class RotateK {
    static void rotateKValue(int[] a, int k){
        k = k % a.length;
        while (k>0){
            int last = a[a.length-1];
            for (int i=a.length-1;i>=1;i--){
                a[i]=a[i-1];
            }
            a[0] = last;
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
        rotateKValue(a,k);
    }
}
