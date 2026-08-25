package String;

import java.util.Scanner;

public class CompressString {
    static void isStringCompress(String str){
        StringBuilder res = new StringBuilder();
        int i=0;
        while(i<str.length()){
            int count =0;
            char current = str.charAt(i);

            while (i<str.length() && str.charAt(i)==current){
                count++;
                i++;
            }
            res.append(current);
            res.append(count);

        }
        System.out.println(res);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        isStringCompress(str);
    }
}
