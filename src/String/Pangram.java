package String;

import java.util.Scanner;

public class Pangram {
    static void isAllLettersPresent(String str){
        boolean[] alphabet = new boolean[26];
        int j;
        char ch;
        for (int i=0;i<str.length();i++){
            if (Character.isLetter(str.charAt(i))){
                ch = Character.toLowerCase(str.charAt(i));
                j=ch-'a';
                alphabet[j]=true;
            }
        }
        boolean found=true;
        for (j=0;j<alphabet.length;j++){
            if(!alphabet[j]){
                found=false;
                break;
            }
        }
        if (!found){
            System.out.println("Not a Pangram");
        }else {
            System.out.println("Pangram");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        isAllLettersPresent(str);
    }
}
