package HomeAssigment;

import java.util.Scanner;

public class seventeen {
	public static void main(String[] args) {
		
		System.out.println("enter the class held");
		Scanner sc=new Scanner(System.in);
		float classheld=sc.nextInt();
		System.out.println("enter the class attend");
		float classattend=sc.nextFloat();
		float num = ((classattend/classheld)*100);
		
		method(classheld,classattend,num);
	
		
	}
	public static void method(float classheld,float classattend,float num) {
		if (num>=75) {
			System.out.println("you are sleteted for exam");
			
		}
		else {
			System.out.println("you are not slleteted for exam ");
		}
		
		
	}

}
