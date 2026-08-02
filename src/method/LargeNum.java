package method;

import java.util.Scanner;
public class LargeNum {
    static int largest(int a, int b){
        int c;
        if(a>b){
            c=a;
        }else {
            c=b;
        }
        return c;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(largest(a,b));
    }
}
