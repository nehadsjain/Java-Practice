package String;

import java.util.Scanner;

public class ToggleCase {
    static void stringToggle(String str){
        StringBuilder var = new StringBuilder();
        for (int i=0;i<str.length();i++){
            if (Character.isLowerCase(str.charAt(i))){
                var.append(Character.toUpperCase(str.charAt(i)));
            }else if (Character.isUpperCase(str.charAt(i))){
                var.append(Character.toLowerCase(str.charAt(i)));
            }else {
                var.append(str.charAt(i));
            }
        }
        System.out.println("Toggled String: "+var);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        stringToggle(str);
    }
}
