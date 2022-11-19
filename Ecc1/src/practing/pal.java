package practing;
import java.util.Scanner;
public class pal {
	public static void main(String[] args) {
		method();
		
		
	}
	public static void method() {
		Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER THE STRING.");
        String str=scanner.nextLine();
        String revstring="";
        for(int i=str.length()-1;i>=0;i--) {
        revstring=revstring+str.charAt(i);
        }
        System.out.println(revstring);
        if(str.equals(revstring)) {
        System.out.println("IT IS A PALINDROME.");
        }
        else {
        System.out.println("IT IS NOT A PALINDROME.");
        }
		
		
	}

}
