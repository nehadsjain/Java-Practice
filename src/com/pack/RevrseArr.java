package com.pack;
import java.util.Scanner;
public class RevrseArr {
    static void reverse(int[] arr) {
        int i=0;
        int j= arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no.of elements:");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        reverse(arr);
        System.out.println("Reversed array:");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
