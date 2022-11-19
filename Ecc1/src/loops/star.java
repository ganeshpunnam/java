package loops;


import java.util.Scanner;

public class star {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number ");
	int num = sc.nextInt();
//	System.out.println("entr the nymber");
//	int l=sc.nextInt();		

	int i = 1;
	int l = num;

	while (i <= num) {
		int j = 1;
		while (j <= l) {
			System.out.print("*");
			j++;

		}
		System.out.println(" ");
		i++;
		l--;
	}
	}
}



