package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicate {
    static void findDupli(int[] a){
        boolean found = false;
        int ele=0;
        for (int i=0;i<a.length && !found;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i] == a[j]){
                    found = true;
                    ele = a[j];
                    break;
                }
            }
        }
        if(found){
            System.out.println("Duplicate number is "+ele);
        }else {
            System.out.println("Duplicate number is not present");
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
        findDupli(a);
    }
}
