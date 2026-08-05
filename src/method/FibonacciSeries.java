package method;

import java.util.Scanner;
public class FibonacciSeries {
    static void fibonacci(int n){
        int fib1=0,fib2=1,fib=0;
        for (int i=0;i<=n;i++){
            System.out.print(fib1+"\t");
            fib = fib1+fib2;
            fib1=fib2;
            fib2=fib;
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = s.nextInt();
        fibonacci(n);
    }
}
