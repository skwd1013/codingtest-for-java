import java.util.*;

public class Codingtest2303 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[5];
        int[] arr2 = new int[N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {

                arr[j] = sc.nextInt();
            }
            // 나머지 최대인 값 구하기
            int max = 0;
            for (int j = 0; j < 3; j++) {
                for (int k = j + 1; k < 4; k++) {
                    for (int l = k + 1; l < 5; l++) {
                        max = Math.max(max, (arr[j] + arr[k] + arr[l]) % 10);
                    }
                }
                arr2[i] = max;
            }

        }

        int count = 0;
        int result = 0;

        for (int i = 0; i < N; i++) {
            if (result <= arr2[i]) {
                result = arr2[i];
                count = i + 1;
            }

        }
        System.out.println(count);
    }
}
