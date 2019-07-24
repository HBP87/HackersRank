import java.util.Scanner;
public class main
{
  public static void main(String args[])
  {
    int[][] arr=new int[2][3];
    int a=0, b=0;
    Scanner s = new Scanner(System.in);
    for(int i=0; i<3; i++)
    {
      arr[0][i]=s.nextInt();
    }
    for(int i=0; i<3; i++)
    {
      arr[1][i]=s.nextInt();
    }
    
    if(arr[0][0]>arr[1][0])
    {
      a++;
    }
    else if(arr[0][0]==arr[1][0])
    {
      
    }
    else
    {
      b++;
    }

    if(arr[0][1]>arr[1][1])
    {
      a++;
    }
    else if(arr[0][1]==arr[1][1])
    {
      
    }
    else
    {
      b++;
    }

    if(arr[0][2]>arr[1][2])
    {
      a++;
    }
    else if(arr[0][2]==arr[1][2])
    {
      
    }
    else
    {
      b++;
    }

    System.out.printf("%d %d", a, b);

  }
}
