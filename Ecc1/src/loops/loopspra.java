package loops;
import java.util.Scanner;
public class loopspra {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		
		int num =sc.nextInt();
		
		method(num);
//     	method2(num);
		method3(num);
	}
    public static void method(int num) {
    	int  i = 1;
    	int a = 5;
    	
    	
    	

        while (i<=5) {
        	int j =1 ;
            while (j<=a) {
                System.out.print(j+"  ");
                j++;

            }
            System.out.println( );
            i++;
            a--;
            
        }
    }
    
    
//    public static void method2(int num) {
//     	while (num<=10) {
//    	System.out.print(num+" ");
//    	num++;
//    
//    
//		
//	}
    	 public static void method3(int num) {
         	int  i = 1;
         	int a = 5;
         	
         	
         	

             while (i<=5) {
             	int j =1 ;
                 while (j<=a) {
                     System.out.print("*  ");
                     j++;

                 }
                 System.out.println( );
                 i++;
                 a--;
                 
             }

    }
       
    
   
}
