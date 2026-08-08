package DoWhile;

import java.util.Scanner;
public class BreakNum {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter number:");
            n = s.nextInt();
            if (n == 0) {
                System.out.println("Program Ended");
                break;
            }
        }while (true);
    }
}
