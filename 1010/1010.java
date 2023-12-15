import java.util.Scanner;
import java.math.*;

public class Main {
    public static double comb(int n, int m) {
        double a=1;
        double b=1;
        for(double i =n;i>(n-m);i--){
            a *= i;
        }
        for(double i =2;i<=m;i++){
            b *= i;
        }
        return a/b;
    }

    ;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        double[] arr = new double[T];

        for (int i=0;i<T;i++){
            int N= sc.nextInt();
            int M= sc.nextInt();
            arr[i]=comb(M,N);
        }
        for(int i=0;i<T;i++){
           System.out.printf("%.0f\n",arr[i]);

        }


    }

}