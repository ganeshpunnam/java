package DoWhile;
import java.util.Scanner;

public class metersif {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choise=0;
		do {
			System.out.println("1.meters"+'\n'+"2.kilometers"
		+'\n'+"3.exits");
			System.out.println("Enter your choice");
		    choise=sc.nextInt();
			if (choise==1) {
				System.out.println("enter the kilometers");
				int kilometers=sc.nextInt();
				System.out.println("meters="+kilometers*1000);}
			else if (choise==2) {
				System.out.println("enter the meters");
				int meters=sc.nextInt();
				System.out.println("kilometers="+meters/1000);}
			else if (choise==3) {
					System.out.println("exit..");
					
				}
			else {
				System.out.println("invalid input please enter valid in put");
			}
				
			
			
			
			
		}while(choise!=3);
		
	}
}


