package String;

import java.util.Scanner;

public class ReverseSentence {
    static void isWordsReversed(String str){
        StringBuilder reverse = new StringBuilder();
        String[] words = str.split("\\s+");
        for (int i=words.length-1;i>=0;i--){
            reverse.append(words[i]);
            if(i!=0){
                reverse.append(" ");
            }
        }
        System.out.println(reverse);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        isWordsReversed(str);
    }
}
