package Arrays;

import java.util.Scanner;

public class FrequencyElements {
    static void frequencyOfEle(int[] a){
        boolean[] visited = new boolean[a.length];
        for (int i=0;i<a.length;i++){
            if(visited[i]) continue;

            int count=1;
            int ele = a[i];
            for (int j=i+1;j<a.length;j++){
                if(ele == a[j]){
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(ele+"->"+count+" times");
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
        frequencyOfEle(a);
    }
}
