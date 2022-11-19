package HomeAssigment;
import java.util.Scanner;
public class fourth {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the fahrenheittocelsius");
		int fh =sc.nextInt();
		celsius(fh);
		
	}
	
	public static void celsius(int n){
		System.out.println(((n-32)*5)/9);
		
		
	}
}
		
	
		
		
		
		
		
		

