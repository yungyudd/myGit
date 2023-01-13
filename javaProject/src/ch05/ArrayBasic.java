package ch05;

public class ArrayBasic {

	public static void main(String[] args) {
		int[] score; //배열참조변수 선언
		score = new int[5]; //new를 통해 메모리에 5개의 int형 자리를 준비
		
	//	int[] score = new int[5]; 
		
		//배열생성( 4byte X 5 = 20)
//		System.out.println(score);//score는 메모리의 주소값을 가르키는 참조변수가 된다.
//		score[0] = 100;
//		score[1] = 90;
//		score[2] = 80;
//		score[3] = 70;
//		score[4] = 60;
		
		int[] score1 = {100,90,80,70,60};

		System.out.println(score1[0]);
		System.out.println(score1[1]);
		System.out.println(score1[2]);
		
		for(int i = 0; i<5; i++) { //배열에서 for문 필수적으로 사용된다.
			System.out.println(score1[i]);
		}
	}

}
