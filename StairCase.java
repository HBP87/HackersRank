import java.util.Scanner;
public class main{
  public static void main(String args[])
  {
    Scanner s= new Scanner(System.in);
    int n=s.nextInt();
    for(int row=1; row<=n; row++)
    {
      for(int sp=n-row;sp>0; sp--)
      {
        System.out.print(" ");
      }
      for(int col=1; col<=row; col++)
      {
        System.out.print("#");
      }
      System.out.println();
    }
  }
}
