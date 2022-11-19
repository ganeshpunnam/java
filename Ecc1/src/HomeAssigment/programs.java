package HomeAssigment;

import java.util.Scanner;

public class programs {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the your date of birth");
		int dateofbirth =sc.nextInt();
		
		System.out.println("enter the year");
		int presentyear =sc.nextInt();
		age (presentyear,dateofbirth);
		
		
		
	}
	public static void age(int presentyear,int dateofbirth) {
		System.out.println(presentyear - dateofbirth);
		
	}

}
