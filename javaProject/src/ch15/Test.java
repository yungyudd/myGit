package ch15;

public class Test {
	public static void main(String[] args) {
		int num = Integer.parseInt("ABC");
		try {
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("넘버 예외");
		}
		

	}

}
