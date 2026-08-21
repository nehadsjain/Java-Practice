package String;

import java.util.Scanner;

public class ReverseStringBuilder {
    static void reverseUsingBuilder(String str){
        StringBuilder vnam = new StringBuilder(str);
        System.out.println("String:"+vnam);
        System.out.println("Reverse:"+vnam.reverse());
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reverseUsingBuilder(str);
    }
}
