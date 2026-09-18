package String;

import java.util.Scanner;

public class ContainsOnlyDigits {
    static void isOnlyDigits(String str){
        boolean found = true;
        for (int i=0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
                found = false;
                break;
            }
        }
        if (!found){
            System.out.println("Not only digits");
        }else {
            System.out.println("Only digits");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        isOnlyDigits(str);
    }
}
