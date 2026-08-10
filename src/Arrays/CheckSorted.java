package Arrays;

import java.util.Scanner;

public class CheckSorted {
    static void arraySorted(int[] a){
        boolean sorted = false;
        for (int i=1;i<a.length;i++){
            if(a[i]<a[i-1]){
                sorted=false;
                break;
            }else {
                sorted=true;
            }
        }
        if(sorted){
            System.out.println("Array is sorted");
        }else {
            System.out.println("Array is not sorted");
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
        arraySorted(a);
    }
}
