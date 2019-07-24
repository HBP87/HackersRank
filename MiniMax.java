import java.util.Arrays;
import java.util.Scanner;
public class main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    long a[]= new long[5];
    long min=0, max=0;
    for(int i=0; i<5; i++)
    {
      a[i]=s.nextLong();
    }
    Arrays.sort(a);

    for(int i=0; i<4; i++)
    {
      min=min+a[i];
    }

    for(int i=1; i<5; i++)
    {
      max=max+a[i];
    }
    System.out.printf("%d %d", min, max);
    
    
  }
}
