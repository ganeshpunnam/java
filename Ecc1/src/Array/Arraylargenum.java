package Array;
import java.util.Scanner;
public class Arraylargenum {
	public static void main(String[] args) {
	method();	
	}
	public static void method() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		float arr[]=new float[ size];
		System.out.println("enter the number");
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextFloat();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		float max=arr[0];
		for (int i=0;i<=arr.length-1;i++) {
			if (max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("the large number ="+max);
		
	}
	
	

}

