import java.util.Scanner;
public class main{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n=s.nextInt();

    int[] arr= new int[n];
    int pos=0, neg=0, zero=0;

    for(int i=0; i<n; i++)
    {
      arr[i]=s.nextInt();
    }

    for(int i=0; i<n; i++)
    {
      if(arr[i]>0)
      {
        pos++;
      
      }
      else if(arr[i]<0)
      {
        neg++;
      }
      else
      {
        zero++;
      }
    }
    System.out.println((float)pos/n);
    System.out.println((float)neg/n);
    System.out.println((float)zero/n);
  }
}
