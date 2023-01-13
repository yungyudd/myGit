package ch05;

public class ArrayPoint {

	public static void main(String[] args) {
		String[] name = {"정수", "민성", "주민","지수", "정민"};
		int[] kor = {100, 90, 30, 05, 43};
		int[] eng = {30, 30, 26, 26, 24};
		int[] mat = {100, 15, 16, 60, 90};
		
		int[] tot = {0,0,0,0,0};
		double[] avg = new double[5];
		double class_avg = 0;
		for(int i=0; i<5; i++) { 
			tot[i]=kor[i]+eng[i]+mat[i];
			avg[i]=tot[i]/3.0;
			class_avg=class_avg+avg[i];
		}
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<4; i++) {
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+String.format("%.1f", avg[i]));
		}
		System.out.println("학급평균 :" + String.format("%.1f", class_avg/5));

	}

}
