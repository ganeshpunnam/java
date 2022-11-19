package practing;

import java.util.Random;
import java.util.Scanner;


public class Number_Generation {
	public static void main(String[] args) {
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		int randamnum=rand.nextInt(1000-1)+1;
		System.out.println("enterv the number between 1-1000 ");
		int guess=0;
		do{
			System.out.println("enter the valu");
			guess=sc.nextInt();
			if(guess>randamnum)
				System.out.println("guess is wormg select less value");
			else if(guess<randamnum)
				System.out.println("guess is wormg select high value");
			else
				System.out.println("number matched");
			
		}while(guess!=randamnum);
		}
}


