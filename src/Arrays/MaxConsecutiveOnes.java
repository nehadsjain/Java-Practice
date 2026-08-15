package Arrays;

import java.util.Scanner;

public class MaxConsecutiveOnes {
    static void maxConsecutiveOnes(int[] a){
        int count = 0;
        int max = 0;
        for (int i=0;i<a.length;i++){
            if(a[i] == 1){
                count++;
                if(count>max){
                    max = count;
                }
            }else {
                count =0;
            }
        }
        System.out.print("Maximum consecutive 1s = "+max);
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
        maxConsecutiveOnes(a);
    }
}
