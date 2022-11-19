
package Array;
import java.util.Scanner;
	
public class Exparrey {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int[] num=new int[5];
//		int temp=sc.nextInt();
		for (int index=0;index<=4;index++) {
			
//			num[index]=temp;
//			temp=temp+2;
			num[index]=sc.nextInt();
			
		}
		for (int index=0;index<=4;index++) {
			System.out.println(num[index]);
			
		}
		
		
	}
	

}
