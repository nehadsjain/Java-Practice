package com.pack;

import java.util.Scanner;
public class Grade {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int mark = s.nextInt();
        if (mark >= 90 && mark <= 100){
            System.out.println("Grade A");
        } else if (mark >=75 && mark<=89) {
            System.out.println("Grade B");
        } else if (mark >= 60 && mark <= 74) {
            System.out.println("Grade C");
        } else if (mark >= 40 && mark <= 59) {
            System.out.println("Grade D");
        }else {
            System.out.println("Grade F");
        }
    }
}
