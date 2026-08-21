package String;

import java.util.Scanner;

public class StringBuilderDemo {
    static void stringBuilder(String str){
        StringBuilder vname = new StringBuilder(str);
        vname.append("Hello");
        vname.append(" Java");
        System.out.println(vname);
        System.out.println("Length:"+vname.length());
        System.out.println("Reverse string builder:"+vname.reverse());
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        stringBuilder(str);
    }
}
