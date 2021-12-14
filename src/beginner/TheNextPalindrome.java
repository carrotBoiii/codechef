package beginner;
import java.util.*;

public class TheNextPalindrome {
    public static int mid = 0, val[];
    public static String fh = "", sh = "";

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int cyka = in.nextInt();
        while (cyka-- > 0){
            System.out.println("Enter your number");
            int num = in.nextInt();
            if (checkPal(num)){
                String tmp = "" + num;
                if (tmp.length() % 2 == 0){

                }
            }
        }
    }

    public static void halves(int num){
        String tmp = "" + num;
        if (tmp.length() % 2 == 0){
            fh = tmp.substring(0, (tmp.length() / 2));
            sh = tmp.substring((tmp.length() / 2));
        } else {
            fh = tmp.substring(0, ((int)(tmp.length() / 2)));
            sh = tmp.substring(((int)(tmp.length() / 2) + 1));
            mid = Integer.parseInt("" + tmp.charAt((int)(tmp.length() / 2)));
        }
    }

    public static String flip(String num){
        String cyka = "";
        for(int i = 0; i < num.length(); i++)
            cyka = num.charAt(i) + cyka;
        return cyka;
    }

    public static boolean checkPal(int num){
        halves(num);
        fh = flip(fh);
        return fh.equals(sh);
    }
}
