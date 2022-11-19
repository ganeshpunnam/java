package loops;
import java.util.Scanner;

public class useloop {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the valu");
		int num=sc.nextInt();
		method(num);
	}
	public static void method(int num) {
		int i=num;
		while (i<=100) {
			System.out.println(i
					);
			i+=num;
		}
		
	}

}
