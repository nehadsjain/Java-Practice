package method;

import java.util.Scanner;
public class EvenOdd {
    static void checkEvenOdd(int n){
        if (n%2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = s.nextInt();
        checkEvenOdd(n);
    }
}
