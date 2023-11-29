import java.util.*;

public class Main
{
	public static void main(String[] args)  {
    Scanner sc = new Scanner(System.in);
    
    int N= sc.nextInt();
    double[] arr= new double[N];
    double score=0;

    
    for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
    }
    
    Arrays.sort(arr);
    
    for(int j=0;j<arr.length;j++){
      score += ((arr[j]/arr[arr.length-1])*100.0);
    }


     System.out.println(score/arr.length);
	}	
}
