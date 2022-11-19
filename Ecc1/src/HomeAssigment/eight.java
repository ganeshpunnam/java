package HomeAssigment;
import java.util.Scanner;

public class eight {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		
		System.out.println("enter the present year");
		long present=sc.nextLong();
		
		inches(age,present);
	}
	public static void inches(int age,long present) {
		System.out.println(present-age);
		
	}

}
