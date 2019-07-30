import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        int[] bin = new int[32];
        int i =0;
        while (n>0)
        {
            bin[i] = n % 2;
            n = n / 2;
            i++;
        }
        int[] counter = new int[i];
        int k =0;
        for (int j = 0 ; j <i ; j++)
        {
            if(bin[j]==1)
            {
                counter[k]++;
            }
            else {
                k++;
            }
        }
        Arrays.sort(counter);
        System.out.println(counter[i-1]);
    }
}
