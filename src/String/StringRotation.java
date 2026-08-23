package String;

import java.util.Scanner;

public class StringRotation {
    static void isRotation(String str1, String str2){
        if(str1.length() == str2.length()){
            String str = str1 + str1;
            if(str.contains(str2)){
                System.out.println("Rotation");
            }
            else {
                System.out.println("Not a rotation");
            }
        }else {
            System.out.println("Not a rotation");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String:");
        String str1 = sc.nextLine();
        System.out.println("Enetr the Second String:");
        String str2 = sc.nextLine();
        isRotation(str1,str2);
    }
}
