package String;

import java.util.Scanner;

public class ValidPalindrome {
    static void checkValidPalindrome(String str){
        int i=0,j=str.length()-1;
        boolean palindrome = true;
        while (i<j){
            if (!Character.isLetterOrDigit(str.charAt(i))){
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(str.charAt(j))){
                j--;
                continue;
            }
            if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))){
                palindrome = false;
                break;
            }
            i++;
            j--;
        }
        if(palindrome){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Plaindrome");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter the string:");
        String str = sc.nextLine();
        checkValidPalindrome(str);
    }
}
