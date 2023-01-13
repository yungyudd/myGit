package ch06;

public class PointEx {
	//멤버변수
	static String[] name = {"정","김","이","최","주"};
	static int[] kor = {80, 90, 100,20,50};
	static int[] eng = {60,20,20,67,70};
	static int[] mat = {60, 20, 07, 07, 90};
	static int[] tot = {0, 0, 0, 0, 0};
	static double[] avg = {0,0,0,0,0};
	
	static void getTot() {//총점 계산
		for(int i=0; i<5; i++) {
			tot[i] = kor[i]+ eng[i]+mat[i];
		}
	}
	static void getAvg() {
		for(int i=0; i<5; i++) {
			avg[i] = tot[i] /3.0;
		}
	}
	static void print() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<5; i++) {
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+String.format("%.1f", avg[i]));
		}
	}

	public static void main(String[] args) {
		getTot();
		getAvg();
		print();

	}

}
