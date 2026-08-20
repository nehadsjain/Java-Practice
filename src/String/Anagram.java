package String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static void isAnagram(String str1, String str2){
        if(str1.length() == str2.length()){
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1,ch2)){
                System.out.println("Anagram");
            }else {
                System.out.println("Not Anagram");
            }
        }else {
            System.out.println("Not Anagram");
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first string:");
        String str1 = s.nextLine();
        System.out.print("Enter second string:");
        String str2 = s.nextLine();
        System.out.println(str1);
        System.out.println(str2);
        isAnagram(str1,str2);
    }
}
