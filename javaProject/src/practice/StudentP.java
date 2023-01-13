package practice;

import java.util.Scanner;

public class StudentP {
	


	public static void main(String[] args) {
		int size;
		int stunum=0;
		String name= "";
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수를 입력하세요: ");
		size = sc.nextInt();
		int[][] score = new int[size][4];
		
		for(int i=0; i<score.length; i++) {
			System.out.println(i+1 +"번 학생의 정보: ");
			name = sc.next();
			for(int j=0; j<score[i].length; j++) {
				score[i][j] = sc.nextInt();
			}
		}
		System.out.println("학번\t이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
		for(int i=0; i<score.length; i++) {
			int total=0;
			double avg=0;
			System.out.print(i+1001+"\t");
			System.out.print(name+"\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
				total += score[i][j];
				avg = total/4.0;
			}
			System.out.println(total+"\t"+String.format("%.1f", avg));
		}
		sc.close();
	}
	

}
