package homework;

import java.util.Scanner;

public class ArrayScore2d_Scan {

	public static void main(String[] args) {
		
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수를 입력하세요: ");
		size = sc.nextInt();
		int[][] scores = new int[size][3];
		
		System.out.print("국,영,수 성적을 입력하세요\n ");
		for(int i=0; i<scores.length; i++) {
			System.out.print(i+1 +"번 학생의 점수: ");
			for(int j=0; j<scores[i].length; j++) {
				scores[i][j] = sc.nextInt();
				
			}	
		}
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		for(int i=0; i<scores.length; i++) {
			System.out.print(i+1 +"\t");
			int total=0;
			double avg =0;
			char grade = ' ';
			for(int j=0; j<scores[i].length; j++) {
			System.out.print(scores[i][j]+ "\t");
			total += scores[i][j];
			avg = (double)total/3.0;
		
			if(avg>=90) {
				grade = 'A';
			}else if(avg>=80) {
				grade = 'B';
			}else if(avg>=70) {
				grade = 'C';
				
			}else if(avg>=60){
				grade = 'D';
			}else {
				grade = 'F';
			}
		
			
			}
			System.out.println(total+"\t"+String.format("%.1f", avg)+"\t"+grade);
		}
		sc.close();
	}

}