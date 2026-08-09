package Arrays;

import java.util.Scanner;

public class SecondLargestElement {
    static void secondLarge(int[] a){
        int large = a[0];
        int secondLarge = Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            if(a[i]>large){
                secondLarge=large;
                large=a[i];
            }else if(a[i]>secondLarge && a[i]<large) {
                secondLarge = a[i];
            }
        }
        if(secondLarge == Integer.MIN_VALUE){
            System.out.print("\nNo second largest element");
        }else{
            System.out.print("\nLargest:"+large);
            System.out.println("\nSecond Largest:"+secondLarge);
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
            System.out.print(a[i]+"\t");
        }
        secondLarge(a);
    }
}
