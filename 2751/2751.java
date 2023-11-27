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
	