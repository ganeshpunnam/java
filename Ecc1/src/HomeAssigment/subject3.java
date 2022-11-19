package HomeAssigment;
import java.util.Scanner;

public class subject3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner ( System.in);
		System.out.println("Enter Maths marks");
		float Maths= sc.nextFloat();
		System.out.println("Enter the Total marks");
		float MATHSTOTAL = sc.nextFloat();
		System.out.println("Enter Physics marks");
		float Physics = sc.nextFloat();
		System.out.println("Enter the Total Marks");
		float PHYSICSTOTAL=sc.nextFloat();
		System.out.println("Enter Chemistry Marks");
		float Chemistry = sc.nextFloat();
		System.out.println("Enter the Total Marks");
		float CHEMISTRYTOTAL = sc.nextFloat();
		float All = Maths+Physics+Chemistry;
		float TOTAL=MATHSTOTAL+PHYSICSTOTAL+CHEMISTRYTOTAL;
		float Percentage= All/TOTAL*100;
		method1 (Percentage);
	}
	public static void method1(float Percentage ) {
		if (Percentage >=90) {
			System.out.println("Your Grade is A ");
			
		}
		else if  (Percentage >=70) {
			System.out.println("Your Grade is B");
		}
		else if (Percentage >=50 ) {
			System.out.println("Your Graded is C");
		}
		else 
			
			System.out.println("Your Grade is F");
		}
		
		
		
	}
	


