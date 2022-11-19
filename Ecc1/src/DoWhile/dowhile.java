package DoWhile;

import java.util.Scanner;

public class dowhile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice =0;
		do {
			System.out.println("select the option:"
					+'\n'+"1.addition"
					+'\n'+"2.subtration"
					+'\n'+"3. multiplication"
					+'\n'+ "4.division"+
					'\n'+"5.modulus"
					+'\n'+"6.exit");
			System.out.println("enter the choice");
			 choice =sc.nextInt();
//			 
				
			 switch (choice) {
				case 1:
					System.out.println("enter the a value");
					int a=sc.nextInt();
					System.out.println("enter the b value");
					int b=sc.nextInt();
					System.out.println(a+b);
					break;
				case 2:
					System.out.println("enter the a value");
					int c=sc.nextInt();
					System.out.println("enter the b value");
					int d=sc.nextInt();
					System.out.println(c-d);
					break;
				case 3:
					System.out.println("enter the a value");
					int e=sc.nextInt();
					System.out.println("enter the b value");
					int f=sc.nextInt();
					System.out.println(e*f);
					break;
				case 4:
					System.out.println("enter the a value");
					int g=sc.nextInt();
					System.out.println("enter the b value");
					int h=sc.nextInt();
					System.out.println(g/h);
					break;
				case 5:
					System.out.println("enter the a value");
					int i=sc.nextInt();
					System.out.println("enter the b value");
					int j=sc.nextInt();
					System.out.println(i%j);
					break;
				case 6:
					
					System.out.println("exit");
					break;
				default:
					System.out.println("invalid");
				
		      }
		}
		while (choice!=6);
		
		
		
	
}
}
