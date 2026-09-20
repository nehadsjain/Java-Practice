package String;

import java.util.Scanner;

public class LongestCommonPrefix {
    static void commonLongestPrefix(String[] str){
        StringBuilder res = new StringBuilder();
        String first = str[0];

        for (int i=0;i<first.length();i++){
            boolean matched = true;
            for (int j=1;j< str.length;j++){
                if(str[j].length() <= i){
                    matched = false;
                    break;
                }
                if (first.charAt(i) != str[j].charAt(i)){
                    matched = false;
                    break;
                }
            }
            if (matched){
                res.append(first.charAt(i));
            }else {
                break;
            }
        }
        System.out.println("Longest Common Prefix:"+res);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr no.of strings:");
        int n = sc.nextInt();
        String[] str = new String[n];
        System.out.println("Enetr strings:");
        for (int i=0;i<n;i++){
            str[i] = sc.next();
        }
        commonLongestPrefix(str);
    }
}
