package ch05;

public class ArrayTest2 {

	public static void main(String[] args) {
		int sum=0;
		float average = 0f;
		int[] score = {100, 90, 35, 80, 78};
		for (int i=0; i<score.length; i++) {
			sum += score[i];  //sum = sum+score[i]
		}
		average = sum/(float)score.length;
		
		System.out.println("총점 : " +sum);
		System.out.println("평균 : " +average);
	}

}
