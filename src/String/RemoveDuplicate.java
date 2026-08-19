package String;

import java.util.Scanner;

public class RemoveDuplicate {
    static void duplicate(String str){
        String str1 = "";
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (str1.contains(String.valueOf(ch))){
                continue;
            }else {
                str1 = str1 + ch;
            }
        }
        System.out.println(str1);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = s.nextLine();
        System.out.println("String:"+str);
        duplicate(str);
    }
}
