package HomeAssigment;
import java.util.Scanner;

public class sixteen {
	public static void main(String[] args) {
		System.out.println("enter the year");
		Scanner sc = new Scanner(System.in);
		int year=sc.nextInt();
		leapyear(year);
	}
	public static void leapyear(int year) {
		
	
		if(year % 400 == 0) {
			System.out.println("it is a leap year");
		}
		else if (year % 100 == 0) {
			System.out.println("it is a  not leap year");
			
		}
		else if (year%4==0) {
			System.out.println("it is a leap year");
		}
		else {
			System.out.println("it is a not leap year");
		}	
		}
		}
		
		
		
	