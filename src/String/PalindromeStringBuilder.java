package String;

import java.util.Scanner;

public class PalindromeStringBuilder {
    static void isPalindromeUsingBuilder(String str){
        StringBuilder var = new StringBuilder(str);
        if(var.reverse().toString().equals(str)){
            System.out.println("Palindrom");
        }else {
            System.out.println("Not palindrome");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        isPalindromeUsingBuilder(str);
    }
}
