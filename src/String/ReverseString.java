package String;

import java.util.Scanner;

public class ReverseString {
    static void reverse(String str){
        String str1 = "";
        for (int i=str.length()-1;i>=0;i--){
            str1 = str1 + str.charAt(i);
        }
        System.out.println(str1);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = s.nextLine();
        System.out.println("String:"+str);
        reverse(str);
    }
}
