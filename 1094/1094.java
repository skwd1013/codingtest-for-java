import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=64;
        int count=1;
        int X= sc.nextInt();
        
        int[] arr= {64,32,16,8,4,2,1};
        
        for(int i=0; i<7;i++){
        if(X==arr[i]){break;}
        if(X>arr[i]) {
                X=X-arr[i];
                count++;
             }
         }
         System.out.println(count);
        }
        }
    

