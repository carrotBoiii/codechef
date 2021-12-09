package beginner;
import java.util.*;
public class ATM {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Bal, Sorry but out system is not yet mature to get your balance by itself RIP XD");
        float bal=in.nextFloat();
        System.out.println("Enter the amount you wish to withdraw");
        int withdraw=in.nextInt();
        if (withdraw % 5 == 0 && (withdraw + 0.5) <= bal) {
            System.out.println("You have successfully withdrawn " + withdraw + " \nAnd now you have " + (bal - (withdraw + 0.5)) + " \nAfter the bank took 0.50 RIP mah guy");
        }
        else
            System.out.println("Sorry BRUH but you broke T^T");
    }
}

/**
 * Code for the actual codechef website
 import java.util.Scanner;
 class Codechef{
    public static void main(String[]args)throws java.lang.Exception {
        Scanner in=new Scanner(System.in);
        int X=in.nextInt();
        float Y=in.nextFloat();
        if(X%5==0&&(X+0.50)<=Y){
            Y-=(X+0.50);
            System.out.println(Y);
        }
        else
            System.out.println(Y);
    }
 }
 */
