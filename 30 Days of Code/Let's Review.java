import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();

        String[] a = new String[10];

        for(int i=0; i<n; i++)
        {
          a[i]=s.nextLine();
        }

        for(int i=0; i<n; i++)
        {
          System.out.print(a[i].charAt(0));
          for(int j=1; j<a[i].length(); j++)
          {
            
            if(j%2==0)
            {
              System.out.print(a[i].charAt(j));
            }
          }
          System.out.print(" ");
          for(int j=1; j<a[i].length(); j++)
          {
            
            if(j%2!=0)
            {
              System.out.print(a[i].charAt(j));
            }
          }
          System.out.println();
        }
    }
}

