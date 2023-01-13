package ch02;

public class PrintfEx {

	public static void main(String[] args) {
		int i = 97;
		int d = 3000;
		String s = "Java";
		double f = 3.14;
		
		System.out.printf("%d\n" , i);
		System.out.printf("%o\n" , i);
		System.out.printf("%x\n" , i);
		System.out.printf("%c\n" , i);
		System.out.printf("%5d\n" , d);
		System.out.printf("%-5d\n" , d);
		System.out.printf("%05d\n" , d);
		System.out.printf("%,d\n" , d);
		System.out.printf("%s\n" , s);
		System.out.printf("%f\n" , f);
		System.out.printf("%e\n" , f);
		System.out.printf("%4.1\n" , f);
		System.out.println(String.format("%4.1f", f)); //println문에서 format형식을 취할때
		
		
		int a=3, b=5;
		// %를 표현하고자 할때는 a%%b처럼 %를 2개 씀
		System.out.printf("a%%b=%d\n", a%b);

	}

}
