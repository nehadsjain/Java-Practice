package com.pack;

import java.util.Scanner;
class Solution {
    public int forLoop(int low, int high) {
        // Your code goes here
        int sum=0;
        for(int i=low;i<=high;i++){
            sum+=i;
        }
        return sum;
    }
}
public class Addition {
    public static void main(String[] args){
        Solution obj = new Solution();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Low value(>0):");
        int low = s.nextInt();
        System.out.println("Enter High value(>0):");
        int high = s.nextInt();
        int res = obj.forLoop(low,high);
        System.out.println("Sum:"+res);
    }
}
