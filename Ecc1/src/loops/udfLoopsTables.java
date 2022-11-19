package loops;
import java.util.Scanner;

public class udfLoopsTables {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i = 1;
		method(num,i);
		
			}
	public static void method(int num,int i) {
		while (i<=10) {
			System.out.println(num+"*"+i+"="+num*i);
			i++;
			
			
		}
		
	}
	
		}
	
	


