package collections;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter thwe list");
		int a=sc.nextInt();
	
			
		
	
		
		//1.construct a Array listobject
		ArrayList mylist=new ArrayList();
		
		ArrayList mylist1=new ArrayList();
		
		
//		ArrayListToString(mylist);
//		genericArrayList();
//		genericArrayList1();
		genericArrayList2();
		//add the elements of 
//		mylist.add(24);
//		mylist.add(28.6);
//		mylist.add(24);
//		mylist.add(24.2);
//		mylist.add("ganesh");
//		mylist.add(2,4.5);
		
//		System.out.println(mylist.get(4));
//		System.out.println(mylist.set(0,"sai"));
//		System.out.println(mylist.subList(1, 4));
//		System.out.println(mylist.lastIndexOf(24));
//		System.out.println(mylist.indexOf(28.6));
		//System.out.print("[");
		
//		for (int  i=0;i<=mylist.size()-1;i++) {
//			
//			if(i!=mylist.size()-1) {
//			System.out.print(mylist.get(i)+", ");
//			}
//			
//			else {
//				
//				System.out.print(mylist.get(i));
//			}
			//System.out.print("]");
				
				
			
		}
	public static void genericArrayList2() {
		ArrayList<String> names=new ArrayList<String>();
		names.add("punnam ganesh");
		names.add("sai ganesh");
		names.add("chandu ganesh");
		
		for(int i=0;i<names.size();i++) {
		String str=	names.get(i);
		System.out.println(str.charAt(0)+". "+str.substring(str.indexOf(" ")+1));
		
	}
	}
		//System.out.print("]");
	
	public static void genericArrayList() {
		ArrayList<String> names=new ArrayList<String>();
		names.add("ganesh");
		names.add("sai");
		names.add("prem");
		names.add("chandu");
		names.add("anji");
		 for (int  i=0;i<=names.size()-1;i++) {
			 System.out.println(names.get(i));
			 
			 
		 }
				
			System.out.println();	
		
	}

	public static void genericArrayList1() {
		ArrayList<Integer> names=new ArrayList<Integer>();
		names.add(23);
		names.add(45);
		names.add(5);
		names.add(77);
		names.add(67);
		 for (int  i=0;i<=names.size()-1;i++) {
			 System.out.println(names.get(i));
			 
		 }
				
				
	}
		
		
		
		
		
		
		
	//}
	public static String ArrayListToString(ArrayList mylist) {
		
	String result="[";
         for (int  i=0;i<=mylist.size()-1;i++) {
			
			if(i!=mylist.size()-1) {
			return ("result"+mylist.get(i)+", ");
			}
			
			else {
				
				return (String) mylist.get(i);
			}
		
		
	}
         result+="[]";
		return result;
	

	
	}
	

}
