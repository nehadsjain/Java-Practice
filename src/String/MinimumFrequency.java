package String;

import java.util.Scanner;

public class MinimumFrequency {
    static void minimumFrequencyCharacter(String str){
        int[] arr = new int[26];
        int j=0;
        char ch;
        for (int i=0;i<str.length();i++){
            if (Character.isLetter(str.charAt(i))){
                ch = Character.toLowerCase(str.charAt(i));
                j = ch-'a';
                arr[j] = arr[j]+1;
            }
        }
        int minFreq = Integer.MAX_VALUE;
        char minCharacter = str.charAt(0);
        for (int i=0;i<str.length();i++){
            if(arr[Character.toLowerCase(str.charAt(i))-'a'] < minFreq){
                minFreq = arr[Character.toLowerCase(str.charAt(i))-'a'];
                minCharacter = str.charAt(i);
            }
        }
        System.out.println("Character with minimum frequency:"+minCharacter);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter the string:");
        String str = sc.nextLine();
        minimumFrequencyCharacter(str);
    }
}
