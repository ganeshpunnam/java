package Array;
import java.util.Scanner;
public class arrdiynamic {
	public static void main(String[] args) {
		
	
	method();
	
	}
	public static void method() {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the  size array");
	int size=sc.nextInt();
	float arr[]=new float[ size];
	System.out.println("enter the numbers");
	for (int i=0;i<arr.length;i++) {
		arr[i]=sc.nextFloat();
		
	}
	for (int i=0;i<arr.length;i++) {
	 System.out.println(arr[i]);
	}
	}
}
