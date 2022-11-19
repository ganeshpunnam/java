package loops;
import java.util.Scanner;

public class pra2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("enter the number");
	    int b=sc.nextInt();
//	    method(count,b);
	    method1(count,b);
	}
	    public static void method(int count,int b) { 
		while (b!=0) {
			b/=10;
			count++;
	}
		System.out.println("number of digts=" + count);
	    }
	    public static void method1(int count,int b) { 
			while (b!=0) {
				if(b%2==0) {
					
				
				count++;
			System.out.println(b%10);
		}
			b/=10; 
			}
			System.out.println("number even numbers=" + count);
		    
	    }		
	    
	    
} 
			

	    


