package HomeAssigment;

import java.util.Scanner;

public class Eightteen {
public static void main(String[] args) {
		
		System.out.println("enter the ch valu");
		Scanner sc=new Scanner(System.in);
		float ch=sc.nextFloat();
		System.out.println("enter the a  value");
		float a=sc.nextFloat();
		System.out.println("enter the b value");
		float b=sc.nextFloat();
		
		
		method(ch,a,b);
	
		
	}
	public static void method(float ch,float a,float b) {
		if (ch==1) {
			System.out.println(a+b);
		
			
		}
		else if (ch==2){
			System.out.println(a-b);
			
		}
		else if (ch==3) {
			System.out.println(a*b);
			
		}
		else if (ch==4) {
			System.out.println(a/b);
			
		}
		else {
			
			System.out.println("invalid");
		}
	}


}
