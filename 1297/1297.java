import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int D=sc.nextInt();
		int H=sc.nextInt();
		int W=sc.nextInt();
		double a=(D*D/(double)(H*H+W*W));
	    double b= Math.sqrt(a);
		double realW=b*W;
		double realH=b*H;

		System.out.println((int)realH); 
		System.out.println((int)realW);
		
	}
}
