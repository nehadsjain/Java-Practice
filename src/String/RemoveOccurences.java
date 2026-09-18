package String;

import java.util.Scanner;

public class RemoveOccurences {
    static void removeOccurenceString(String str,char ch){
        StringBuilder res = new StringBuilder();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) == ch){
                continue;
            }else {
                res.append(str.charAt(i));
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str = sc.nextLine();
        System.out.print("Enter the Character to be removed:");
        char ch = sc.next().charAt(0);
        removeOccurenceString(str,ch);
    }
}
