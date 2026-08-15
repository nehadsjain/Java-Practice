package Arrays;

import java.util.Scanner;

public class TwoSum {
    static void sum(int[] a, int k){
        int sum1 = 0;
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i] + a[j] == k){
                    System.out.print("\n"+a[i]+" + "+a[j]+" = "+k);
                }
            }
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
        System.out.print("Enter the target:");
        int k = s.nextInt();
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
        sum(a,k);
    }
}
