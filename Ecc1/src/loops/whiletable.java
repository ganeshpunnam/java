package loops;
import java.util.Scanner;


public class whiletable {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i = 1;
		while (i<=10) {
			
				System.out.println(num+"*"+i+"="+num*i);
				i++;
			}
		}
	
}