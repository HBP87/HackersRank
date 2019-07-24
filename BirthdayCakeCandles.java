import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int n, count=0;
        int ar[]= new int[100000];
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        for(int i=0; i<n; i++){
            ar[i]=s.nextInt();
        }
        int max = ar[0];
        for(int i=0; i<n; i++){
             if(ar[i]>max)
             {
                 max=ar[i];
             }
        }
        for(int i=0 ; i<n; i++){
            if(ar[i]==max)
                count++;
        }
        System.out.println(count);
    }
}
