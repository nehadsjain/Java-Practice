package com.pack;

import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
         if (n1 > n2){
             System.out.println(n1+" is greater");
         }
         else {
             System.out.println(n2+" is greater");
         }
    }
}
