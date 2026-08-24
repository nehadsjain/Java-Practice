package String;

import java.util.Scanner;

public class SpecialCharacters {
    static void isSpecialCharacters(String str){
        int c1=0,c2=0,c3=0,c4=0;
        for (int i=0;i<str.length();i++){
            if (Character.isUpperCase(str.charAt(i))) c1++;
            else if (Character.isLowerCase(str.charAt(i))) {
                c2++;
            } else if (Character.isDigit(str.charAt(i))) {
                c3++;
            }else c4++;
        }
        System.out.print("Uppercase:"+c1+"\nLowercase:"+c2+"\nDigits:"+c3+"\nSpecial characters:"+c4);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        isSpecialCharacters(str);
    }
}
