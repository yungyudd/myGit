package ch04;

public class GuguDan2 {

	public static void main(String[] args) {
		System.out.println("출력결과\n");
		for(int dan=2; dan<=9; dan++) {
			System.out.println("## " +dan+ "단 ##");
			for(int n=1; n<=9; n++) {
				System.out.print(dan + " * " + n + " = " + dan*n+"\t");
			}//inner for
			System.out.println("\n");
		}//outer for

	}
	
}
