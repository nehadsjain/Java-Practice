package Arrays;

import java.util.Scanner;

public class Minimum {
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
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<=min) min=a[i];
        }
        System.out.print("\nMinimum element:"+min);
    }
}
