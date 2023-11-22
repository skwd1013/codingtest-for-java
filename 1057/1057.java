//수정중
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int N=sc.nextInt();

	    double aa;
	    double bb;
	    double result=0;
	    
	        for (int j=0;j<N/2+1;j++){
	            if (result!=1)   {
	            aa=Math.ceil(2/a);
	            bb=Math.ceil(2/b);
	            result=bb-aa;
	            	            }
	           else{
	            System.out.println(j);
	                }
	    }
	   // double j= Math.ceil(a/2.0);

	}
}
