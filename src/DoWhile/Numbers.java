package DoWhile;

import java.util.Scanner;
public class Numbers {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = s.nextInt();
        int i=1;
        do{
            System.out.print(i+"\t");
            i++;
        }while (i<=n);
    }
}
