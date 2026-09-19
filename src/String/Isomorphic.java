package String;

import java.util.Scanner;

public class Isomorphic {
    static void isIsomorphic(String str1, String str2){
        char[] a1 = new char[26];
        char[] a2 = new char[26];
        int i=0;
        char c1,c2;
        boolean isomorphic = true;
        if (str1.length() != str2.length()){
            isomorphic = false;
        }else {
            while (i<str1.length() && i<str2.length()){
                c1=str1.charAt(i);
                c2=str2.charAt(i);
                if(a1[c1-'a']=='\0' && a2[c2-'a']=='\0'){
                    a1[c1-'a'] = c2;
                    a2[c2-'a'] = c1;
                }else if (a1[c1-'a']!=c2 || a2[c2-'a']!=c1){
                    isomorphic = false;
                    break;
                }
                i++;
            }
        }
        if (!isomorphic){
            System.out.println("Not Isomorphic");
        }else {
            System.out.println("Isomorphic");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String:");
        String str1 = sc.nextLine();
        System.out.println("Enetr the Second String:");
        String str2 = sc.nextLine();
        isIsomorphic(str1,str2);
    }
}
