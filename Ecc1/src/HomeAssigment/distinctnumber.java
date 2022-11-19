package HomeAssigment;
import java.util.Scanner;

public class distinctnumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1 number");
		int a=sc.nextInt();
		System.out.println("enter the 2 number");
		int b=sc.nextInt();
		System.out.println("enter the 3 number");
		int c=sc.nextInt();
		method(a,b,c);
				
		
	}
	public static void method(int a,int b,int c) {
		if (a<b && b<c ||a>b && b>c) {
			System.out.println(b);
		}
		
		else if  (b<a && a<c || b>a && a>c) {
			System.out.println(a);
		
		}
		else if(a<c && c<b || a>c && c>b) {
			System.out.println(c);
			
		}
		
			
	
	}
	

}
