package collections;
import java.util.*;
public class Collections_priectice {
	

	public static void main(String[] args) {
//		ArrayList<Integer> arry=new ArrayList<>();
		HashMap<String,Integer> hmap= new HashMap<String, Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num of list values");
		int list=sc.nextInt();
		
		System.out.println("enter the num of list ");
		for(int i=0; i<list;i++) {
			
	hmap.put(sc.next(),sc.nextInt());
				
			
			}
		
	System.out.println(hmap);

		}
		
		
		
	}


