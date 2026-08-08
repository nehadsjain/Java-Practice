package Arrays;

import java.util.Scanner;

public class Maximum {
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
            System.out.print(a[i]+"\n");
        }
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>=max) max=a[i];
        }
        System.out.print("\nMaximum element:"+max);
    }
}
