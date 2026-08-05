package method;
import java.util.Scanner;
public class PrimeNumbers {
    static boolean isPrime(int n){
        if(n<=1) return false;
        for (int i=2;i<=Math.sqrt(n);i++){
            if( n%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = s.nextInt();
        boolean res = isPrime(num);
        if(res){
            System.out.println("Prime");
        }else {
            System.out.println("Not prime");
        }
    }

}
