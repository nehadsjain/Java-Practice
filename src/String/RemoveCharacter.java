package String;

import java.util.Scanner;

public class RemoveCharacter {
    static void removeChar(String str, char ch){
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
        System.out.println("Enetr a String:");
        String str = sc.nextLine();
        System.out.println("Enter character to be removed:");
        char ch = sc.next().charAt(0);
        removeChar(str,ch);
    }
}
