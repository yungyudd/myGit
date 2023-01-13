package ch04;

import java.util.Scanner;

public class While_HakJum {

	public static void main(String[] args) {
		int count = 0;
		int kor=0,eng=0,mat=0,sum=0;
		double avg = 0;
		String grade = "";
		String result = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("전체 성적입력이 끝나면 마지막에 -1을 입력하세요.");
		System.out.print("계속하려면 아무정수나 입력하세요.");
		int n = sc.nextInt();
		
		while(n != -1) {
			System.out.print("국어 :");
			kor = sc.nextInt();
			System.out.print("영어 :");
			eng = sc.nextInt();
			System.out.print("수학 :");
			mat = sc.nextInt();
			sum = kor + eng + mat;
			avg = sum/3.0;
			
			if(avg>=90.0) {
				grade = "수";
			}else if(avg>=80.0) {
				grade = "우";
			}else if(avg>=70.0) {
				grade = "미";
			}else if(avg>=60.0) {
				grade = "양";
			}else {
				grade = "가";
			}
			
			result += kor+"\t"+eng+"\t"+mat+"\t"+sum+"\t"+String.format("%.1f", avg)+"\t"+grade+"\n";
			System.out.print("계속하려면 아무정수나 입력하세요.");
			n = sc.nextInt();
		}	
		System.out.println("================================================");
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("------------------------------------------------");
		System.out.println(result);
		System.out.println("================================================");
		sc.close();
	}

}
