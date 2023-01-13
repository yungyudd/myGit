package ch04;

public class BreakEx4 {

	public static void main(String[] args) {
		int n=1;
		System.out.println("----------------------");
	
		while(true) {
			System.out.println(n+" Hello World");
			n++;
			if(n==8) {
			System.out.println("n값이"+n+"이며 while문 빠져나옴");
			break;
			
		}

	}
	System.out.println("----------------------");
	}
}
