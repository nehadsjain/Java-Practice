package Arrays;

import java.util.Scanner;

public class ArrayIntersection {
    static void intersection(int[] a,int[] b){
        int k=0;
        int[] res = new int[a.length];
        for (int i=0;i< a.length;i++){
            for (int j=0;j<b.length;j++){
                if(a[i] == b[j]){
                    res[k]=b[j];
                    k++;
                }
            }
        }
        for (int i=0;i<k;i++){
            System.out.print(res[i]+"\t");
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no.of elements for A:");
        int n1 =s.nextInt();
        int[] a = new int[n1];
        System.out.println("Enter elements:");
        for (int i=0;i<a.length;i++){
            a[i] = s.nextInt();
        }
        System.out.print("Enter no.of elements for B:");
        int n2 =s.nextInt();
        int[] b = new int[n2];
        System.out.println("Enter elements:");
        for (int i=0;i<b.length;i++){
            b[i] = s.nextInt();
        }

        intersection(a,b);
    }
}
