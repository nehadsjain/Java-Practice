package method;

import java.util.Scanner;
public class Calculator {
    static int add(int a, int b){
        return a+b;
    }
    static int subtract(int a, int b){
        return a-b;
    }
    static int multiply(int a, int b){
        return a*b;
    }
    static int divide(int a, int b){
        return a/b;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enetr 2 numbers:");
        int a=s.nextInt();
        int b=s.nextInt();
        while (true){
            System.out.println("1.Add\t2.Subtract\t3.Multiply\t4.Divide\t5.Exit");
            System.out.println("Enter the choice:");
            int ch = s.nextInt();
            switch (ch){
                case 1: System.out.println(add(a,b)); break;
                case 2:System.out.println(subtract(a,b)); break;
                case 3: System.out.println(multiply(a,b)); break;
                case 4: if (b != 0){
                    System.out.println(divide(a,b));
                } else {
                    System.out.println("Cannot divide by zero");
                }break;
                case 5: return;
                default: System.out.println("Invalid Choice");
            }
        }
    }
}
