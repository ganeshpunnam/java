package HomeAssigment;
import java.util.Scanner;
public class fifteen {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		if (num>9999 && num<=99999) {
			System.out.println("it is a  five digit num");
		}
		
		else {
			System.out.println("it is not a five digit num ");
		}
		
	}

}
