package Arrays;

import java.util.Scanner;

public class KadenesAlgorithm {
    static void subArray(int[] a){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            sum = sum + a[i];
            if(sum < 0){
                sum = 0;
            }
            if(sum > max){
                max = sum;
            }
        }
        System.out.println("\nMaximum subarray sum:"+max);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no.of elements:");
        int n =s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements:");
        for (int i=0;i<a.length;i++) {
            a[i] = s.nextInt();
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
        subArray(a);
    }
}
