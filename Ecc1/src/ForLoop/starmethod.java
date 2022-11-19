package ForLoop;

public class starmethod {
	public static void main(String[] args) {
		for (int i=0;i<=6;i++) {
			for (int j=6;j>=i;j--) {
				
	System.out.print(" ");
	
	
				}
				for (int k=0;k<=i;k++) {
					if(i==4||k==0||k==i)
						System.out.print(" "+"*");
					else
						System.out.print(" "+" ");
			
		}
		System.out.println();
		}
		
		System.out.println();
		for(int i=0;i<7;i++) {
			for (int j=0;j<5;j++) {
				if (j==0||(i%3==0 && j!=4)||(i%3>0 && j==4)) {
					System.out.print("*"+' ');
				}
				
				else {
					System.out.print(" "+" ");
				}
				
				
			}
			System.out.println();
	}

System.out.println();

	for (int i=1;i<=7;i++) {
		for (int j=1;j<=7;j++) {
			if (i==1||j==1||i==7) 
				System.out.print("*");
				else 
					System.out.print(" ");

				
			}
			
		System.out.println();
		

}
	System.out.println();
	for(int i=1;i<=7;i++) {
		for (int j=1;j<=7;j++) {
			if (i==1||i==7||j==1||j==7)
			System.out.print("*");
			else
			System.out.print(" ");
			
		}
		System.out.println();
	}
	System.out.println();
	for(int i=1;i<=7;i++) {
		for (int j=1;j<=7;j++) {
			if (i==1||i==7||i==4||j==1)
			System.out.print("*");
			else
			System.out.print(" ");
			
		}
		System.out.println();
}
	System.out.println();
	for(int i=1;i<=7;i++) {
		for (int j=1;j<=7;j++) {
			if (i==1||i==4||j==1)
			System.out.print("*");
			else
			System.out.print(" ");
			
		}
		System.out.println();
}

	System.out.println();
	for(int i=1;i<=7;i++) {
		for (int j=1;j<=5;j++) {
			if (i==4||j==5||j==1)
			System.out.print("*");
			else
			System.out.print(" ");
			
		}
		System.out.println();
	
	}	
	System.out.println();
	for(int i=1;i<=7;i++) {
		for (int j=1;j<=5;j++) {
			if (i==1||i==7||j==3)
			System.out.print("*");
			else
			System.out.print(" ");
			
		}
		System.out.println();
	}
	System.out.println();
	for(int i=0;i<7;i++) {
		for (int j=0;j<4;j++) {
			if (j==0||i==(3-j)||i==(3+j)) {
				System.out.print("*"+" ");
			}
			
			else {
				System.out.print(" "+" ");
			}
			
			
		}
		System.out.println();
	
	}
}
}