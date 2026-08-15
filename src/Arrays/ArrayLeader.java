package Arrays;

import java.util.Scanner;

public class ArrayLeader {
    static void leader(int[] a){
        int[] res = new int[a.length];
        int k=0;
        int max = a[a.length-1];
        res[k] = max;
        for (int i=a.length-2;i>=0;i--){

            if (a[i] > max){
                k++;
                res[k] = a[i];

                max = a[i];
            }
        }
        for (int i=0,j=k;i<j;i++,j--){
            int temp = res[i];
            res[i] = res[j];
            res[j] = temp;
        }
        for (int i=0;i<=k;i++){
            System.out.print(res[i]+"\t");
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
            System.out.println(a[i]+"\t");
        }
        leader(a);
    }
}
