package String;

import java.util.Scanner;

public class NonRepeat {
    static void firstNonRepeating(String str){
        boolean[] visited = new boolean[str.length()];
        boolean found = false;
        for (int i=0;i<str.length();i++){
            if (visited[i]) continue;
            int count = 1;
            char ch = str.charAt(i);

            for (int j=i+1;j<str.length();j++){
                if(ch == str.charAt(j)){
                    count++;
                    visited[j]=true;

                }
            }
            if (count == 1){
                found = true;
                System.out.println("First repeating character: "+ch);
                break;
            }
        }
        if (!found){
            System.out.println("No non-repeating character");
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = s.nextLine();
        System.out.println("String:"+str);
        firstNonRepeating(str);
    }
}
