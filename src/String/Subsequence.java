package String;

import java.util.Scanner;

public class Subsequence {
    static void isSubsequence(String str1, String str2){
        int i=0,j=0;
        boolean reached = false;
        while (i<str1.length() && j<str2.length()){
            if (str1.charAt(i) == str2.charAt(j)){
                i++;
                j++;
            }else {
                j++;
            }
        }
        if(i == str1.length()){
            reached = true;
        }
        if (reached){
            System.out.println("Subsequence");
        }else {
            System.out.println("Not Subsequence");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String:");
        String str1 = sc.nextLine();
        System.out.println("Enetr the Second String:");
        String str2 = sc.nextLine();
        isSubsequence(str1,str2);
    }
}
