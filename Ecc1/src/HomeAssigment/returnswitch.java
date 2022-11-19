package HomeAssigment;

import java.util.Scanner;

//import ganesh.String;

public class returnswitch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextShort();
		
		System.out.println(switchmodal(num));
		
		
		
	}
	public static String switchmodal(int num) {
		switch (num) {
		case 1:
			return "sun";
		case 2:
			return "mon";
			
		case 3:
			return "tue";
		case 4:
			return "wed";


		case 5:
			return "thu";
		case 6:
			return "fri";
		case 7:
			return "sat";
		default:
			return "invalid";
		
		}
		
	}


}
