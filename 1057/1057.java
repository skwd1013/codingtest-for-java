import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int N=sc.nextInt();
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    
	    int count=0;
	    
	    while(a!=b){
	        a=a/2+a%2;
	        b=b/2+b%2;
	        count++;
	    }
	    System.out.println(count);
	}
}
	        
  
  