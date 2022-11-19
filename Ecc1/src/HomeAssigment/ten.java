package HomeAssigment;

import java.util.Scanner;

public class ten {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the seconds");
		int sec=sc.nextInt();
		int t1=sec%60;
		int t2=sec/60;
		int t3=t2%60;
		t2=t2/60;
		
//		System.out.println("enter the present year");
//		long present=sc.nextLong();
		
		inches(t1,t2,t3);
	}
	public static void inches(int t1,int t2,int t3) {
		System.out.print(t2+":"+t3+":"+t1);
		
		
	}



}
