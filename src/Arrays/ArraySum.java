package Arrays;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no.of elements:");
        int n =s.nextInt();
        int[] a = new int[n];
        int sum=0;
        System.out.println("Enter elements:");
        for (int i=0;i<a.length;i++){
            a[i] = s.nextInt();
        }
        for (int i=0;i<a.length;i++){
            sum += a[i];
        }
        System.out.println("Sum:"+sum);
    }
}
