package homework;

public class ArrayScore2D {

	public static void main(String[] args) {
		//5행 3열
		int[][] score = {{70,40,80},{100,70,50},{30,70,80},{57,38,38},{87,98,87}};
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		for(int i=0; i<score.length; i++) {
			int sum = 0;
			char grade = ' ';
			float avg = 0.0f;
			System.out.printf("%d", i+1);
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%d\t", score[i][j]);	
				
			}
			
			avg = sum/(float)score[i].length;
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
			System.out.printf("%d\t %.1f\t %c\n", sum, avg, grade);
		}

	}

}
