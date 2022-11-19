package HomeAssigment;
import java.util.Scanner;

public class thirteen {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		float a=sc.nextFloat();
//		
		
		grater(a);
	}
	public static void grater(double a) {
		if(a>0) {
		System.out.println("the enter number is posstive number");
		}
		else if(a<0) {
		System.out.println("the enter numberis nigative number");
		}
		else {
		System.out.println("the enter number is zero");
		}
		
	}


}
