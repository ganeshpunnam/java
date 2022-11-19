package HomeAssigment;

import java.util.Scanner;

public class nine {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the birth");
		int birth=sc.nextInt();
		
		System.out.println("enter the present year");
		long present=sc.nextLong();
		
		inches(birth,present);
	}
	public static void inches(int birth,long present) {
		System.out.println(present-birth);
		
	}

}



