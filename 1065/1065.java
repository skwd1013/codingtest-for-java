import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strN = sc.next().split("");
        int[] N = new int[strN.length];
        for (int i = 0; i < strN.length; i++) {
            N[i] = Integer.parseInt(strN[i]);
        }
        int num = 0;
        for (int i : N) {
            num *= 10;
            num += i;
        }
        int[] arr = new int[4];
        int count = 0;

        for (int i = 0; i <= num; i++) {

            if (i < 100) {
                count = i;
            } else if (i < 1000) {
                arr[0] = i - (i % 100);
                arr[1] = (i % 100) - (i % 10);
                arr[2] = (i % 10);

                if (arr[0] / 100 - arr[1] / 10 == arr[1] / 10 - arr[2]) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
