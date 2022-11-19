package HomeAssigment;
import  java.util.Scanner;

public class twelve {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter frist number a value");
		int a=sc.nextInt();
		System.out.println("enter the secound number b value");
		int b=sc.nextInt();
		System.out.println("enter the thired number c value");
		int c=sc.nextInt();
		
		grater(a,b,c);
	}
	public static void grater(int a,int b,int c) {
		if(a>b & a>c) {
		System.out.println("a is grater than");
		}
		else if(b>c) {
		System.out.println("b is grater than");
		}
		else {
		System.out.println("c is grater than");
		}
		
	}

}
	
