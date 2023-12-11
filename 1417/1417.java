import java.util.*;


public class codingtest1417 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr= new int[N];

        for(int i=0;i < arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int count=0;

        if (N==1){
            System.out.println("0");
        }
        else{
            Arrays.sort(arr, 1, arr.length);
            while (true){


                if (arr[0] <= arr[arr.length - 1]) {

                    arr[arr.length - 1]--;

                    arr[0]++;
                    Arrays.sort(arr, 1, arr.length);
                    count++;

                } else {
                    System.out.println(count);
                    break;
                }
            }

        }
    }
}

