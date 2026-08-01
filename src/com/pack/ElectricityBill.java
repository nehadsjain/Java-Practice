package com.pack;

import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int unit = s.nextInt();
        int total=0;
        if (unit<0){
            System.out.println("Invalid units");
        } else {
            if (unit <= 100) {
                total = unit * 2;
            } else if (unit <= 200) {
                total = (100 * 2) + (unit - 100) * 3;
            } else {
                total = (100 * 2) + (100 * 3) + (unit - 200) * 5;
            }
            System.out.println("Total Bill:" + total);
        }
    }
}
