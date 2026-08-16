package Arrays;

import java.util.Scanner;

public class SelectionSort {
    static void selectionAlgorithm(int[] a){
        for (int i=0;i<a.length;i++){
            int min = i;
            for (int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
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
            System.out.println(a[i]+"\t");
        }
        selectionAlgorithm(a);
    }
}
