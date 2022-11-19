package ganesh;
import java.util.Scanner;

public class sixth {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the inches");
		float inches=sc.nextFloat();
		meters(inches);
		
		
	}
	public static void meters(float inches) {
		System.out.println("inches in meters"+inches/39.37);
		
	}

}
