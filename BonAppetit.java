import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = sc.nextInt();

        int[] bill = new int[n];

        for(int i=0; i<n; i++)
        {
            bill[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int bon_apetit=0;

        for(int i=0; i<n; i++)
        {
            if(i==k)
            {
                continue;
            }
            else
            {
                bon_apetit=bon_apetit+bill[i];
            }
        }
        if(b-(bon_apetit/2)==0)
            System.out.println("Bon Appetit");
        else
        {
            System.out.println(bill[k]/2);
        }

    }
}
