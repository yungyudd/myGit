package practice;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int sum;
		System.out.println("첫 번째 숫자를 입력하세요 :");
		a = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요 :");
		b = sc.nextInt();
		
		sum = a+b;
		System.out.println("두 수의 합은 "+sum+"입니다.");
		sc.close();

	}

}
