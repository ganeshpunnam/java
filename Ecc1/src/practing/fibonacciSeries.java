package practing;
import java.util.Scanner;
public class fibonacciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the fibonacciSeries range"
				+ "");
		int count=sc.nextInt();
		int n1=0,n2=1,n3,i;    
    
		 
		 for(i=0;i<count;++i)
		 {    
		  n3=n1+n2;    
		  System.out.println(" "+n3);    
          n1=n2;    
		  n2=n3;    
		 }
	}

}
