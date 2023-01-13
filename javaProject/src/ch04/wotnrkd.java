package ch04;

import java.util.Scanner;

public class wotnrkd {

	public static void main(String[] args) {
		int score;
		char grade = ' ';
		char lev= ' ';
		
		Scanner sc = new Scanner(System.in);
		System.out.print("java 점수를 입력하세요 : ");
		score = sc.nextInt();
		
		
		if(score >= 90) {
			grade = 'A';
			if(score >= 95) {
				lev = '+';
			}	
			else if(score <= 91) {
				lev = '-';
			}
		}
		else if(score >= 80) {
			grade = 'B';
			if(score>= 85) {
				lev = '+';
			}
			else if(score <= 81) {
				lev = '-';
			}
		}
		else {
				grade = 'F';
				System.out.println("재수강 대상자입니다.");
		}
		System.out.println("당신의 점수는"+score+"점 이고 등급은 "+grade+lev+"입니다.");
	}

}
