package beginner;
import java.util.*;

public class LuckyFour {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int cyka = in.nextInt();
        while(cyka-- > 0){
            System.out.println("Okhay mah guy enter your number");
            int num = in.nextInt(), ch = 0;
            while (num > 0){
                if (num % 10 == 4) ch++;
                num /= 10;
            }
            System.out.println("So mah guy the number of fking 4s in your number is " + ch);
        }
    }
}

/**
 * Code for codechef
 *
 import java.util.*;

 public class LuckyFour {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int cyka = in.nextInt();
        while(cyka-- > 0){
            int num = in.nextInt(), ch = 0;
            while (num > 0){
                if (num % 10 == 4) ch++;
                num /= 10;
            }
            System.out.println(ch);
        }
    }
 }

 */