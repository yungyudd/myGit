package ch04;

import java.util.Scanner;

//휴가일수 계산
//근속연수 1~3년 => 3일, 4~9년 => 5일 
//10년~19년 => 10일, 20년 이상 => 20ㅇㄹ
public class Holiday {

	public static void main(String[] args) {
		int year;// 변수 선언  근속 년수 
		int days;// 휴가일수
		//입력
		Scanner scan = new Scanner(System.in);
		System.out.print("근속 년수를 입력하세요 :");
		year = scan.nextInt();//키보드로부터 정수값 입력받음
		scan.close();
		
		if(year <= 3) {
			days = 3;
		}else if(year < 10) {
			days = 5;
		}else if (year < 20) {
			days = 10;
		}else {
			days = 20;
		}
		//출력
		System.out.println("귀하의 근속년수는 " +year+ "년입니다.");
		System.out.println("귀하의 휴가일수는 "+days+ "일입니다.");
	}

}
