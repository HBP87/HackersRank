import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a= new int[1000];
        int count_low=0, count_high=0, high, low;
        for(int i=0; i<n; i++)
        {
            a[i] = s.nextInt();
        }
        high=a[0];
        low=a[0];
        for (int i=1; i<n; i++)
        {
            if(high<a[i])
            {
                high=a[i];
                count_high+=1;

            }
            if(low>a[i])
            {
                low=a[i];
                count_low+=1;
            }
        }
        System.out.println(count_high+" "+count_low);
    }
}
