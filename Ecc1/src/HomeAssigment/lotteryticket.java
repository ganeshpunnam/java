package HomeAssigment;
import java.util.Scanner;

public class lotteryticket {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the a");
	int a=sc.nextInt();
	System.out.println("enter the b");
	int b=sc.nextInt();
	System.out.println("enter the c");
	int c=sc.nextInt();
	method(a,b,c);
	
	}
	public static void method(int a,int b,int c) {
		if (a!=b||b!=c||a!=c){
			System.out.println("10");
			
		
			
		}
		
	
		
	}
}
