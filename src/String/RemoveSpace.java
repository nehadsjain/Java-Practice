package String;

import java.util.Scanner;

public class RemoveSpace {
    static void isSpaceRemoved(String str){
        StringBuilder var = new StringBuilder();
        for (int i=0;i<str.length();i++){
            if (Character.isWhitespace(str.charAt(i))){
                continue;
            }else {
                var.append(str.charAt(i));
            }
        }
        System.out.println("After removing space: "+var);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        isSpaceRemoved(str);
    }
}
