package ForLoop;
import java.util.Scanner;
public class numofDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		for (int i= num ;i!=0;i/=10) {
			
			System.out.println(i%10);	
			
	}
		
		System.out.println(num);	
}
}