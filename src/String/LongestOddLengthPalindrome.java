package String;

import java.util.Scanner;

public class LongestOddLengthPalindrome {
    static void isSubstringPalindrome(String str){
        StringBuilder res = new StringBuilder();
        int left,right;
        int maxLength=0,currLength;
        int maxStart=0;
        for (int i=0;i<str.length();i++){

                left =i;
                right =i;
            while (left>=0 && right<str.length() && str.charAt(left) == str.charAt(right)){
                left--;
                right++;
            }
            int start = left+1;
            int end = right-1;
            currLength = end-start+1;
            if (currLength>maxLength){
                maxLength = currLength;
                maxStart = start;

            }
        }
        int start1 = maxStart;
        while (start1<maxStart+maxLength){
            res.append(str.charAt(start1));
            start1++;
        }
        System.out.println(res);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the string:");
        String str = sc.nextLine();
        isSubstringPalindrome(str);
    }
}
