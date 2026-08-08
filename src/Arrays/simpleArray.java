package Arrays;

import java.util.Scanner;
public class simpleArray {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no.of elements:");
        int n =s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements:");
        for (int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.print(a[i]+"\t");
        }
    }
}
