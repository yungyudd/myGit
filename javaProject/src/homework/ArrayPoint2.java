package homework;

import java.util.Scanner;

public class ArrayPoint2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor[] = new int[2];
		int eng[] = new int[2];
		int mat[] = new int[2];
		int tot[] = new int[2];
		double[] avg = new double[2];
		double class_avg = 0;
		String name[] = new String[2];
		
		
		System.out.println("2명의 학생의 국,영,수 점수를 각각 입력하세요.");
		for(int i=0; i<2; i++) {
		System.out.println("이름을 입력하세요: ");
		name[i]=sc.next();
		System.out.println("국어점수: ");
		kor[i]=sc.nextInt();
		System.out.println("영어점수: ");
		eng[i]=sc.nextInt();
		System.out.println("수학점수: ");
		mat[i]=sc.nextInt();
		
		tot[i] = kor[i]+eng[i]+mat[i];
		avg[i] = tot[i]/3.0;
		class_avg= class_avg+avg[i];

		}
		
		for(int i=0; i<2; i++) {
		System.out.println("이름:"+name[i]+"\n국어:"+kor[i]+"\n영어:"+eng[i]+"\n수학:"+mat[i]+"\n총점:"+tot[i]+
				"\n평균:"+String.format("%.1f", avg[i])+"\n");
		}
		System.out.println("==========================");
		System.out.println("학급평균: " +String.format("%.1f", class_avg/2));
	}		
}
