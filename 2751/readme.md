import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	int[] arr = new int[N];
	for(int i=0; i<N; i++){
	  arr[i] = sc.nextInt();
	}

	// 오름차순 정렬
	Arrays.sort(arr);

	// 출력
	for(int n : arr){
	  System.out.println(n);
	}
}
}

시간초과 


2차 시도
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N= sc.nextInt();
	    Integer[] arr=new Integer[N];
		
		for(int i=0; i<arr.length;i++){
		    arr[i]=sc.nextInt();

		}
		
		List<Integer> IntList = Arrays.asList(arr);
		
		
		Collections.sort(IntList); // 5 6 7 8 9
		for(int j : IntList) 
			System.out.print(j+"\n");
		        }
		}
	

시간초과 