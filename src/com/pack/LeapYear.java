package com.pack;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = s.nextInt();
        if ( year % 400 == 0 || year % 4 == 0 ){
            System.out.println("Leap Year");
        }else if (year % 100 == 0) {
            System.out.println("Not a Leap Year");
        } else{
            System.out.println("Not a Leap Year");
        }
    }
}
