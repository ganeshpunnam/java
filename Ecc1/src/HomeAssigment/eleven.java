package HomeAssigment;

import java.util.Scanner;

public class eleven {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the seconds");
		long sec=sc.nextLong();
		long t1=sec%60;
		long t2=sec/60;
		long t3=t2%60;
		t2=t2/60;
		t2=t2%24;
		long t4=sec/(24*60*60);
		t4=t4%365;
		long t5=sec/(365*24*60*60);
		
		
		
//		System.out.println("enter the present year");
//		long present=sc.nextLong();
		
		inches(t1,t2,t3,t4,t5);
	}
	public static void inches(long t1,long  t2,long t3,long t4,long t5) {
		System.out.print(t5+":"+t4+":"+t2+":"+t3+":"+t1);
		
		
	}
	}
	
	


