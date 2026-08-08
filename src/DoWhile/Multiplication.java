package DoWhile;
import java.util.Scanner;
public class Multiplication {
    static void printTable(int n){
        int i=1;
        do {
            System.out.println(n+"*"+i+"="+n*i);
            i++;
        }while (i<=10);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter one number:");
        int n =s.nextInt();
        printTable(n);
    }
}
