package String;

import java.util.Scanner;

public class VowelsConsonants {
    static void countVowelsConsonants(String str){
        int cnt1 =0;
        int cnt2 = 0;
        String str1;
        str1=str.toLowerCase();
        for (int i=0;i<str1.length();i++){
            if(Character.isLetter(str1.charAt(i))){
                if( str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u'){
                    cnt1++;
                }else {
                    cnt2++;
                }
            }else {
                continue;
            }
        }
        System.out.println("Vowels:"+cnt1);
        System.out.println("Consonants:"+cnt2);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = s.nextLine();
        System.out.println("String:"+str);
        countVowelsConsonants(str);
    }
}
