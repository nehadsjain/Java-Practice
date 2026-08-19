package String;

import java.util.Scanner;

public class PalindromeString {
    static void isPalindrome(String str){
        boolean same = true;
        for (int i=0,j=str.length()-1;i<j;i++,j--){
            if (str.charAt(i) != str.charAt(j)){
                same = false;
                break;
            }
        }
        if (same){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = s.nextLine();
        System.out.println("String:"+str);
        isPalindrome(str);
    }
}
