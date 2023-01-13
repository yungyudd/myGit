package ch14;

import java.util.Scanner;

public class Dww {
	public static void main(String[] args) {
		int value = 0, sum = 0;
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("정수 숫자를 입력(종료는 99)");
			value = s.nextInt();
			sum += value;
		}while(value != 99);
		System.out.println("입력된 정수 값들의 합계"+sum);
	System.out.println("프로그램 종료");
	}

}
