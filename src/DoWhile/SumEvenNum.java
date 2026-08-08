package DoWhile;

import java.util.Scanner;
public class SumEvenNum {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int sum =0;
        do {
            System.out.print("Enter number:");
            int n = s.nextInt();
            if(n == 0) break;
            else if(n < 0 || n%2 != 0){
                continue;
            }
            else{
                sum += n;
            }
        }while (true);
        System.out.println("Sum of even numbers:"+sum);
    }
}
