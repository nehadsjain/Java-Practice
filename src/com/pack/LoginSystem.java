package com.pack;
import java.util.Scanner;
import java.util.*;
public class LoginSystem {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter username:");
        String name = s.next();
        System.out.println("Enter password:");
        String pass = s.next();
        if(name.equals("admin")){
            if (pass.equals("1234")){
                System.out.println("login Successful");
            }else {
                System.out.println("Wrong Password");
            }
        }else {
            System.out.println("Invalid Username");
        }
    }
}
