package ch04;

import java.util.Scanner;

public class BreakAVG {

	public static void main(String[] args) {
		int total = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("점수를 입력하시오: ");
			int grade = sc.nextInt();
			if(grade <0)   //-값을 입력해야 종료
				break;
			total += grade; //total = total+grade
			count++;
		}
		System.out.println("평균은" +total/count);
		sc.close();
		

	}

}
