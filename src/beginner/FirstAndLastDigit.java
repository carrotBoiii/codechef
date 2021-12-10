package beginner;
import java.util.*;
public class FirstAndLastDigit {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int cyka = in.nextInt();
        while(cyka-- > 0){
            System.out.println("So go on enter the number...");
            String n = in.next();
            System.out.println("So mah guy the sun of first and last digits is " + (Integer.parseInt("" + n.charAt(0)) + Integer.parseInt("" + n.charAt(n.length()-1))));
        }
    }
}

/**
 * Code for codechef
 *
 import java.util.*;
 import java.lang.*;
 import java.io.*;

 class Codechef
 {
     public static void main (String[] args) throws java.lang.Exception
     {
         Scanner in = new Scanner(System.in);
         int cyka = in.nextInt();
         while(cyka-- > 0){
             String n = in.next();
             System.out.println(Integer.parseInt("" + n.charAt(0)) + Integer.parseInt("" + n.charAt(n.length()-1)));
         }
     }
 }
 */