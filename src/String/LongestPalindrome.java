package String;

import java.util.Scanner;

public class LongestPalindrome {
    static void isPalindrome(String str){
        StringBuilder res = new StringBuilder();
        int left,right;
        if(str.length()%2 == 0){
            left = (str.length()/2)-1;
            right = (str.length()/2);
        }else {
            left = (str.length()/2);
            right = (str.length()/2);
        }
        while (left>=0 && right<str.length() && str.charAt(left) == str.charAt(right)){
            left--;
            right++;
        }
        int start = left+1;
        int end = right-1;
        while (start<=end){
            res.append(str.charAt(start));
            start++;
        }
        System.out.println(res);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the string:");
        String str = sc.nextLine();
        isPalindrome(str);
    }
}
