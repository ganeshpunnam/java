package DoWhile;

import java.util.Scanner;

public class meters {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice =0;
		do {
			System.out.println("select the option:"
					+'\n'+"1.meters"
					+'\n'+"2.kilometers"+'\n'+"3.exit");
			System.out.println("enter the choice");
			 choice =sc.nextInt();
//			 
				
			 switch (choice) {
				case 1:
					System.out.println("enter the a meters");
					int meters=sc.nextInt();
					
					System.out.println("kilometers="+meters/1000);
					break;
				case 2:
					System.out.println("enter the a kilomwters");
					int kilometers=sc.nextInt();
					
					System.out.println("meters="+ kilometers*1000);
					break;
				case 3:
					System.out.println("exit");
						default:
					System.out.println("invalid");
				
		      }
		}
		while (choice!=3);




		}


		

	}
	

	