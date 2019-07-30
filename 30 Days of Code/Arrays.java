import java.util.Scanner;
import java.lang.reflect.Array;
public class main
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    
    int[] a = new int[n];
    
    for(int i=0; i<n; i++)
    {
      a[i] = s.nextInt();
    }
    
    for(int i=n-1; i>=0; i--)
    {
      System.out.print(Array.get(a, i)+" ");
    }
  }
}
