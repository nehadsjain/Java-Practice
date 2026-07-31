package com.pack;

import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = s.nextInt();
        int b = s.nextInt();
        while (true){
            System.out.println("Enter operation:\n 1.Addition " +
                    "\t2.Subtraction\t3.Multiplication\t4.Division\t5.Exit");
            int ch = s.nextInt();
            switch (ch){
                case 1: System.out.println(a+b); break;
                case 2: System.out.println(a-b); break;
                case 3: System.out.println(a*b); break;
                case 4: if (b != 0){
                    System.out.println(a/b);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                    break;
                case 5: return;
                default: System.out.println("Invalid operator");
            }
        }
    }
}
