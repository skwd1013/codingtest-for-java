import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		//오늘은 2007년 1월 1일 월요일
		// 2007년 x월 y일은 무슨 요일일까?
		
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
	    int day =0;
		
		
		if (x==1)
		{
		    day = y;
		}
		else if (x==2)
		{
		    day =y+3;
		}
		else if (x==3)
		{
		    day = y+3;
		}
		else if (x==4)
		{
		    day = y+6;
		}
		else if (x==5)
		{
		    day =y+1;
		}
		else if (x==6)
		{
		    day =y+4;
		}
		else if (x==7)
		{
		    day =y+6;
		}
		else if (x==8)
		{
		    day =y+2;
		}
		else if (x==9)
		{
		    day =y+5;
		}
		else if (x==10)
		{
		    day=y;
		}
		else if (x==11)
		{
		    day=y+3;
		}
		else if (x==12)
		{
		    day=y+5;
		}
	    
    
	    if(day%7==0){
	        System.out.println("SUN");
		}
		else if(day%7==1){
		        System.out.println("MON");
		}
		else if(day%7==2){
		        System.out.println("TUE");
		}
		else if(day%7==3){
		        System.out.println("WED");
		}
		else if(day%7==4){
		        System.out.println("THU");
		}
		else if(day%7==5){
		        System.out.println("FRI");
		}
		else if(day%7==6){
		        System.out.println("SAT");
		
	}
	}
}
