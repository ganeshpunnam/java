package practing;
import java.util.Scanner;
public class age {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the yearofbrith");
		int yearofbrith =sc.nextInt();
		System.out.println("enter the currentYear");
		int currentyear =sc.nextInt();
		
		method(yearofbrith,currentyear);
		
	}
	public static void method(int yearofbrith, int currentyear) {
		System.out.println("your age ="+(currentyear-yearofbrith));
		
	}
	

}
