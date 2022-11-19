package practing;
import java.util.Scanner;
public class Brackets {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("emter the curly braces");
		String s=sc.next();
    vaild(s);
		
	}
	 static void vaild(String s) {
		int count1=0,count2=0;
		for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='{') 
			count1++;
		else if(s.charAt(i)=='}')
			count2++;
		else continue;
			
		}
		if(count1==count2) 
			System.out.println("suces");
		
		else 
			System.out.println("invalid");
		
		
	}

}
