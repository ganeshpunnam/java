package ganesh;

import java.util.Scanner;

public class switchuseadd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  value");
		int a=sc.nextInt();
		System.out.println("enter the a value");
		int b=sc.nextInt();
		System.out.println("enter the b value");
		int c=sc.nextInt();
		
		
		switchmodal(a,b,c);
		
		
		
	}
	public static void  switchmodal(int a,int b, int c ) {
		switch (a)
		{
		case 1:
			
			System.out.println(b+c);
			break;
		case 2:
			System.out.println(b-c);
			break;
		case 3:
			System.out.println(b*c);
			break;
		case 4:
			System.out.println(b/c);
			break;
		case 5:
			System.out.println(b%c);
			break;
//		
		default:
			System.out.println("invalid");
		}
		
	}


}
