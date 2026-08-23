package String;

import java.util.Scanner;

public class MaxFrequency {
    static void maxFrequency(String str){
        boolean[] visited = new boolean[str.length()];
        int maxfreq = 1;
        char ch1 = str.charAt(0);
        for (int i=0;i<str.length();i++) {
            if (visited[i]) continue;
            int count = 1;
            char ch = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }
            if(count>maxfreq){
                maxfreq = count;
                ch1 = str.charAt(i);
            }
        }
        System.out.println("Maximum occuring character:"+ch1);
        System.out.println("Frequency:"+maxfreq);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = s.nextLine();
        System.out.println("String:"+str);
        maxFrequency(str);
    }
}
