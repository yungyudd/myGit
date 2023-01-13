package ch05;

public class ScoreAvg {

	public static void main(String[] args) {
		//4행2열
		double score[][] = {{3.3, 3.5},{3.5, 3.6},{3.7,3.7},{3.7,3.6}};
		
		double sum = 0.0;
		for(int year=0; year<score.length; year++) { //각 학년별로 반복
			for(int i=0; i<score[year].length; i++) { //학기별로 반복
				sum += score[year][i];
				
			}
		}
		int n=score.length;//배열의 행 갯수 4
		int m=score[0].length;//배열의 열 갯수 2
		System.out.println("4년 전체 평점 평균은 " +sum/(n*m));
	}

}
