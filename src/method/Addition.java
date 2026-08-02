package method;

import java.util.Scanner;
public class Addition {
    static int add(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int res = add(a,b);
        System.out.println(res);
    }
}
