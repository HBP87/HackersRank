import java.lang.Math;
import java.util.Scanner;

public class main{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    
    int n=s.nextInt();
    int sumA=0, sumB=0;
    int[][] a=new int[n][n];

    for(int i=0; i<n; i++)
    {
      for(int j=0; j<n; j++)
      {
        a[i][j]=s.nextInt();
      }
    }

    for(int i=0; i<n; i++)
    {
      sumA=sumA+a[i][i];
    }

    for(int i=0; i<n; i++)
    {
      sumB=sumB+a[i][n-i-1];
    }

    System.out.println(Math.abs(sumA-sumB));
  }
}
