package String;

import java.util.Scanner;

public class CountSubString {
    static void isSubstringPresent(String str, String substr){
        int count = 0;
        for (int i=0;i<=str.length()-substr.length();i++){
            if (str.startsWith(substr,i)){
                count++;
            }else{
                continue;
            }
        }
        System.out.println(substr+" occurs "+count+" times");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        System.out.println("Enetr the substring:");
        String subtr = sc.nextLine();
        isSubstringPresent(str,subtr);
    }
}
