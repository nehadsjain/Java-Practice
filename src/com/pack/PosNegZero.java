package com.pack;
import java.util.Scanner;
public class PosNegZero {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = s.nextInt();
        if( num > 0){
            System.out.println("Positive");
        }else if( num < 0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
}
