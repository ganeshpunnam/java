
package stringexp;
import java.util.Scanner;
public class stringex1 {
	public static void main(String[] args) {
//		substring();
//		split();
//		            compareto();
//		            indexof();
		            tochararray();
		            valueof();
		         booleanpalindrome();
		            //printingstring();
//		            printingstringinreverse();
		}
		            public static void substring() {
		            String str="TalentSprint";
		            System.out.println(str.substring(2,10));
		            }
		            public static void split() {
		            String str="Talent Sprint";
		            String [] arrOfStr=str.split("t",3);
		            for(String a: arrOfStr)
		            System.out.print(a);
		            }
		            public static void compareto() {
		            String str1="TalentSprint";
		            String str2="TalentSprint";
		            String str3="talentsprint";
		            System.out.println(str1.compareTo(str2));
		            System.out.println(str1.compareToIgnoreCase(str3));
		            }
		            public static void indexof() {
		            String str1="TalentSprint";
		            System.out.print(str1.indexOf('t'));
		            System.out.print("  ");
		            System.out.println(str1.lastIndexOf('t'));
		            }
		            public static void tochararray() {
		            String str1="TalentSprint";
		            char[ ]result;
		            result=str1.toCharArray( );
		            System.out.println(result);
		            }
		            public static void valueof() {
		            double d=123.456;
		            System.out.println(String.valueOf(d));
		            }
		            public static void booleanpalindrome() {
		           
		            }
		            public static void printingstring() {
		            Scanner scanner=new Scanner(System.in);
		            System.out.println("ENTER THE STRING");
		            String str=scanner.nextLine();
		            for(int i=0;i<str.length();i++) {
		              System.out.println(str.charAt(i));
		            }
		            }
		            public static void printingstringinreverse() {
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



