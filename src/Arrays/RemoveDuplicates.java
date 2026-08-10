package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    static void removeDuplicate(int[] a){
        int j=0;
        for (int i=1;i<a.length;i++){
            if(a[i] != a[j]){
                j++;
                a[j] = a[i];
            }
        }
        System.out.println("No.of unique elements:"+(j+1));
        System.out.println("Unique elements are:");
        for (int i=0;i<=j;i++){
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
            System.out.println(a[i]+"\t");
        }
        Arrays.sort(a);
        removeDuplicate(a);
    }
}
