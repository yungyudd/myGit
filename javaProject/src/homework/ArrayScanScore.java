package homework;

import java.util.Scanner;

public class ArrayScanScore {

	public static void main(String[] args) {
		int total=0;
		int size;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적처리할 학생수를 입력하세요: ");
		size = sc.nextInt();
		int[] scores = new int[size];
		
		for(int i=0; i<scores.length; i++) {
			System.out.print("성적을 입력하세요: ");
			scores[i] = sc.nextInt();
				
		}
		for(int i=0; i<scores.length; i++) {
			total += scores[i];
		}
		System.out.println("=============================");
		System.out.println("총점은 " +total+"점 입니다.");
		System.out.println("평균성적은 "+total/size+"점 입니다.");
		sc.close();
	}

}
