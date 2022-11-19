import java.lang.reflect.Method;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

public class Logics {
	public static void main(String[] args) {
		method1();
		method2();
		//method3();
		method4();
	}
public static void method1() {
			for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
		}System.out.println();
	}
		
	}
public static void method2() {
	
for(int i=1;i<5;i++) {
	for(int j=i+1;j<=2*i;j++) {
		System.out.print(i+" ");
	}System.out.println();
}
	
}
public static void method3() {
	
for(int i=0;i<5;i++) {
	for(int j=0;j<=5;j++) {
		if((j==0 || i==0 || i==4)) {
			System.out.println(j+"_");
		
		}System.out.print(i+" ");
		
	}System.out.println();
}
}

public static void method4() {
	
for(int i=0;i<5;i++) {
	for(int j=0;j<5;j++) {
		if((i>0 && i<4)&&( j>0  && j<4)) {
			System.out.print(" ");
		}
		else {
			System.out.print("*");
		}
		
	}System.out.println();
}
	
}


}
