package beginner;
import java.util.*;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Ayye mah guy enter the number of numbers you gonna enter");
        int limit = in.nextInt();
        System.out.println("Ok Mah guy now carry on go ahead and enter your numbers");
        for (int i = 1; i <= limit; i++){
            int sum = 0, num = in.nextInt();
            while(num > 0){
                sum += (num % 10);
                num = (int)(num / 10);
            }
            System.out.println(sum);
        }
        System.out.println("So mah guy just made me do this BRUH");
    }
}

/**
 * Code for codechef

 import java.util.*;

 class SumOfDigits {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum = 0, limit = in.nextInt();
        for (int i = 1; i <= limit; i++){
            int sum = 0, num = in.nextInt();
            while(num > 0){
                sum += (num % 10);
                num = num / 10;
            }
            System.out.println(sum);
        }
    }
 }
 */
