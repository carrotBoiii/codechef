package beginner;
import java.util.*;
public class FindRemainder {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Mah guy enter the number of test cases");
        int T = in.nextInt();
        while(T-- > 0){
            System.out.println("Go On\nSo BRUH enter the dividend and divisor");
            int dividend, div;
            dividend = in.nextInt();
            div = in.nextInt();
            System.out.println("BRUH so the remainder after dividing which you couldn't calc yourself is " + (dividend % div));
        }
    }
}

/**
 * Code for codechef
 *
 import java.util.*;
 class FindRemainder {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-- > 0){
            int dividend, div;
            dividend = in.nextInt();
            div = in.nextInt();
            System.out.println(dividend % div);
        }
    }
 }
 */
