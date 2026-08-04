package method;

import java.util.Scanner;
public class Fact {
    static int factorial(int n){
        int fact =1;
        for (int i=n;i>0;i--){
           fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = s.nextInt();
        System.out.println("Factorial of "+n+" is:"+factorial(n));
    }
}
