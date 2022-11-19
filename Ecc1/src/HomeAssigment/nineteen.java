package HomeAssigment;
import java.util.Scanner;

public class nineteen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input ch value:");
        int ch = sc.nextInt();
        int num1=32;
        
        deg(ch,num1);
	}
	public static void deg(int ch ,  int num1) {
		if (ch==0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the fe value");
			int fh = sc.nextInt();
			System.out.println(((fh-num1)*5)/9);
		}
		else if(ch==1) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the cl value");
			int cl = sc.nextInt();
			System.out.println((cl*1.8)+num1);
			
		}
		else {
			System.out.println("invalid");
		}
			

}
}