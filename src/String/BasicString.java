package String;

import java.util.Scanner;

public class BasicString {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = s.nextLine();
        System.out.println("String:"+str);
        System.out.println("Length:"+str.length());
        for (int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}
