package HomeAssigment;
import java.util.Scanner;

public class seventh {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the meters");
		double a=sc.nextFloat();
		double b=0.0254;
		inches(a,b);
	}
	public static void inches(double a,double b) {
		System.out.println(a/b);
		
	}

}
