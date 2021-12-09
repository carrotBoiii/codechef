package beginner;
import java.util.*;

public class EnormousInputTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of data you wanna enter");
        int num = in.nextInt();
        System.out.println("Enter the number you want the data to be divisible with");
        int divWith = in.nextInt();
        int data = 0, count = 0;
        System.out.println("Go on enter your data now...");
        for(int i=1; i <= num; i++){
            data = in.nextInt();
            if (data % divWith == 0) count++;
        }
        System.out.println("So looks like you got " + count + " number that are divisible with " + divWith);
    }
}

/**
 * Code for the actual codechef website

 * CODE No. 1
 * much smaller

 import java.util.Scanner;

 class codechef{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int divWith = in.nextInt();
        int data = 0, count = 0;
        for(int i=1; i <= num; i++){
            data = in.nextInt();
            if (data % divWith == 0) count++;
        }
        System.out.println(count);
    }
 }

 ----------------------------------------------------

 * CODE No. 2
 * Runs Faster

 import java.io.OutputStream;
 import java.io.IOException;
 import java.io.InputStream;
 import java.io.PrintWriter;
 import java.util.StringTokenizer;
 import java.io.IOException;
 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 import java.io.InputStream;

 public class Main {
    public static void main(String[] args) {

        InputStream inputStream = System.in;

        InputReader in = new InputReader(inputStream);

        int n = in.nextInt();
        int k = in.nextInt();

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int x = in.nextInt();

            if (x % k == 0) {
                ans++;
            }
        }

        System.out.println(ans);
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
        return Integer.parseInt(next());
        }
    }
 }
 */