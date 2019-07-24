import java.util.Scanner;
public class main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    
    int n=s.nextInt();
    long[] a = new long[n];
    for(int i=0; i<n; i++)
    {
      a[i]=s.nextLong();
    }
    long sum=0;

    for(int i=0; i<n; i++)
    {
      sum=sum+a[i];
    }

    System.out.println(sum);

  }
}
