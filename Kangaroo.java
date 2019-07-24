import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int x1, x2, v1, v2, flag=0;
        Scanner s = new Scanner(System.in);
        x1=s.nextInt();
        v1=s.nextInt();
        x2=s.nextInt();
        v2=s.nextInt();
        for(int x=0; x<10000; x++)
        {
            x1=x1+v1;
            x2=x2+v2;
            if(x1==x2)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
