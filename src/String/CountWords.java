package String;

import java.util.Scanner;

public class CountWords {
    static void words(String str){
        String[] words = str.split("\\s+");
        System.out.println("No of words:"+words.length);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = s.nextLine();
        System.out.println("String:"+str);
        words(str);
    }
}
