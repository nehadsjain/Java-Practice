package method;

import java.util.Scanner;
public class SimpleInterest {
    static double simpleInterest(double p, double r, double t){
        double SI=0;
        SI = (p*r*t)/100;
        return SI;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Eneter the princial amount:");
        double p = s.nextDouble();
        System.out.print("Eneter the rate:");
        double r = s.nextDouble();
        System.out.print("Eneter the time(years):");
        double t = s.nextDouble();
        System.out.print("The simple interest is:"+simpleInterest(p,r,t));
    }
}
