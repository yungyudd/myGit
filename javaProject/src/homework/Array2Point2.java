package homework;

public class Array2Point2 {

	public static void main(String[] args) {
		//5행 3열
		//int[][] score = {{70,40,80},{100,70,50},{30,70,80},{57,38,38},{87,98,87}};
		
		int[][] score;
		score = new int[5][3];
		score[0][0] = 70;
		score[0][1] = 40;
		score[0][2] = 80;
		score[1][0] = 100;
		score[1][1] = 70;
		score[1][2] = 50;
		score[2][0] = 30;
		score[2][1] = 70;
		score[2][2] = 80;
		score[3][0] = 57;
		score[3][1] = 38;
		score[3][2] = 38;
		score[4][0] = 87;
		score[4][1] = 98;
		score[4][2] = 87;
		
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<score.length; i++) {
			int sum =0;
			float avg = 0.0f;
			System.out.printf("%d\t", i+1); //번호출력
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%d\t", score[i][j]);
			}
			avg = sum/(float)score[i].length; //평균계산
			
			System.out.printf("%d\t %.1f%n", sum, avg);
		}//end outer for

	}

}
