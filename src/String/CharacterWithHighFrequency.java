package String;

import java.util.Scanner;

public class CharacterWithHighFrequency {
    static void firstHighFreqChar(String str){
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
        int maxFreq = 0;
        char maxCharacter=str.charAt(0);
        for (j=0;j<str.length();j++){
            if (repeat[str.charAt(j)-'a']> maxFreq){
                maxFreq = repeat[str.charAt(j)-'a'];
                maxCharacter = str.charAt(j);
            }
        }
        System.out.println(maxCharacter);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter the string:");
        String str = sc.nextLine();
        firstHighFreqChar(str);
    }
}
