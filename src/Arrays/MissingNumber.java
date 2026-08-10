package Arrays;

import java.util.Scanner;

public class MissingNumber {
    static void missNum(int[] a){
        long actualSum=0;
        int n=a.length;
        for (int i=0;i<a.length;i++){
            actualSum += a[i];
        }
        long expectSum = 0;
        expectSum = (n*(n+1))/2;
        long missnum = expectSum - actualSum;
        System.out.println("Missing number:"+missnum);
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
        missNum(a);
    }
}
