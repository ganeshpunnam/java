package HomeAssigment;
import java.util.Scanner;

public class fiveth {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the celsius");
		int celsius=sc.nextInt(); 
		celsiuscalculastion(celsius);
		
	}

    public static void celsiuscalculastion(int celsius) {
    	System.out.println(((celsius*9)/5)+32);
		
	}
}
