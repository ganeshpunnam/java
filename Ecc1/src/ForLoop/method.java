package ForLoop;
import java.util.Scanner;
public class method {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int num=sc.nextInt();
		
		method(num);
		method2(num);
		
	}
	public static void method(int num) {
		for (int i=0;i<=num;i++) {
			for (int j=0;j<=num;j++) {
				System.out.print("*");
			}
		}
//			System.out.println();
		}
		public static void method2(int num) {
			for (int i=0;i<=num;i++) {
				for (int j=0;j<=num;j++) {
					System.out.print("*");
				}
				System.out.println();

		
		
		
		
	}

}
	}
