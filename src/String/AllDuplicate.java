package String;

import java.util.Scanner;

public class AllDuplicate {
    static void findDuplicate(String str){
        int[] freq = new int[26];
        char ch;
        int j;
        for (int i=0;i<str.length();i++){
            if (Character.isLetter(str.charAt(i))){
                ch = Character.toLowerCase(str.charAt(i));
                j = ch-'a';
                freq[j] = freq[j]+1;
            }
        }
        boolean[] found = new boolean[26];
        for (int i=0;i<str.length();i++){
            if (Character.isLetter(str.charAt(i))){
                int index = Character.toLowerCase(str.charAt(i))-'a';
                if (found[index]){
                    continue;
                }
                if (freq[Character.toLowerCase(str.charAt(i))-'a']>1){
                    System.out.println(str.charAt(i)+" ");
                    found[index] = true;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter the string:");
        String str = sc.nextLine();
        findDuplicate(str);
    }
}
