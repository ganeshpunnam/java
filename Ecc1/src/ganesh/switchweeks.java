package ganesh;
import java.util.Scanner;

public class switchweeks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		short num=sc.nextShort();
		switchmodal(num);
		
		
		
	}
	public static void switchmodal(short num) {
		switch (num) {
		case 1:
			System.out.println("sum");
			break;
		case 2:
			System.out.println("mon");
			break;
		case 3:
			System.out.println("tue");
			break;
		case 4:
			System.out.println("wed");
			break;
		case 5:
			System.out.println("thu");
			break;
		case 6:
			System.out.println("fri");
			break;
		case 7:
			System.out.println("sat");
     		break;
		default:
			System.out.println("invalid");
		}
		
	}
}
