package Introduction;

public class variablesanddatatypes {
	public static void main(String ar[]) {
	
		
		
		int number1 =14;
		int number2 =3;
		findarithmetricoperatornumbrs(number1,number2);
		findarithmetricoperatornumbrs2(number1,number2);
		method(number1,number2);
		method2(number1,number2);
		method3(number1,number2);
		
	}
    public static void findarithmetricoperatornumbrs(int num1,int num2) {
    	System.out.println(num1+num2);
    }
    public static void findarithmetricoperatornumbrs2(int num1,int num2) {
    	System.out.println(num1-num2);
    }
    public static void method (int a,int b) {
    	System.out.println(a*b);
    }
    public static void method2 (int c,int d) {
    	System.out.println(c/d);
    }
    public static void method3 (int e,int f) {
    	System.out.print(e%f);
    }
    
}
