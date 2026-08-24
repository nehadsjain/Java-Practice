package String;

import java.util.Scanner;

public class CheckDigit {
    static void isDigit(String str){
        boolean found = true;
        for (int i=0;i<str.length();i++){
            if (!Character.isDigit(str.charAt(i))){
                found = false;
                break;
            }
        }
        if(!found){
            System.out.println("Does not contain only digits");
        }else {
            System.out.println("Contains only digits");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        isDigit(str);
    }
}
