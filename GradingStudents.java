import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, i, j;
        int ar[]=new int[100];
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        for(i=0; i<n; i++){
            ar[i]=s.nextInt();
        }
        for(i=0; i<n; i++){
            if(ar[i]>=38){
                for(j=ar[i]; j%5!=0; j++);
                if(j-ar[i]<3){
                    ar[i]=j;
                }
            }
        }
        for(i=0; i<n; i++){
            System.out.println(ar[i]);
        }

    }
}

