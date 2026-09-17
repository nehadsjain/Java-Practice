package String;

import java.util.Scanner;

public class RepeatFirstCharacter {
    static void firstRepeatCharacter(String str){
        boolean[] character = new boolean[26];
        int j;
        char ch;
        for (int i=0;i<str.length();i++){
            if (Character.isLetter(str.charAt(i))){
                ch = Character.toLowerCase(str.charAt(i));
                j = ch - 'a';
                if (character[j]){
                    System.out.println(str.charAt(i));
                    break;
                }else {
                    character[j] = true;
                }
            }

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter the string:");
        String str = sc.nextLine();
        firstRepeatCharacter(str);
    }
}
