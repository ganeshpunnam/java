package loops;

public class nestedloop {
	public static void main(String[] args) {
		int num=1;
		method(num);
	}
		public static void method(int num) {
		
		while (num<=5) {
			int i =1;
			while (i<=5) {
				System.out.print((char)(i+96));
				i++;
			}
			System.out.println(" ");
			num++;
		}
	}

}
