package String;

import java.util.Scanner;

public class LongestWord {
    static void longWord(String str){
        String[] words = str.split("\\s+");
        int n = words[0].length();
        String longwrd=words[0];
        for (int i=0;i<words.length;i++){
            if (words[i].length()>n){
                n = words[i].length();
                longwrd = words[i];
            }
        }
        System.out.println("Longest word:"+longwrd);
        System.out.println("Length:"+n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        longWord(str);
    }
}
