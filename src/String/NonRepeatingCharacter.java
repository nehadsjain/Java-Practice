package String;

import java.util.Scanner;

public class NonRepeatingCharacter {
    static void firstNonRepeatingCharacter(String str){
        int[] repeat = new int[26];
        int j;
        char ch;
        for (int i=0;i<str.length();i++){
            if (Character.isLetter(str.charAt(i))){
                ch=Character.toLowerCase(str.charAt(i));
                j=ch-'a';
                repeat[j]=repeat[j]+1;
            }
        }
        for (j=0;j<str.length();j++){
            if (repeat[str.charAt(j)-'a']==1){
                System.out.println(str.charAt(j));
                break;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter the string:");
        String str = sc.nextLine();
        firstNonRepeatingCharacter(str);
    }
}
