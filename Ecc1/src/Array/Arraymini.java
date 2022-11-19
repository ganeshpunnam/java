package Array;
import java.util.Scanner;
import java.util.Scanner;

public class Arraymini {
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
			float mini=arr[0];
			for (int i=0;i<=arr.length-1;i++) {
				if (mini>arr[i]) {
					mini=arr[i];
				}
			}
			System.out.println("the mini number ="+mini);
			
		}
		
	}


