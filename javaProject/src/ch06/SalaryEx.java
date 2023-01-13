package ch06;

public class SalaryEx {
	//전역변수(멤버변수)는 어디에서나 사용되어지며 값들이 기억되어진다.
	static String[] name = {"박과장","김과장","최주임","홍실장"};
	static int[] salary = {4800, 4000, 3000, 8000};
	static int[] bonus = {0,0,0,0}; 
	static int[] total = new int[5];//총액 (연봉+보너스)
	static int[] tax = new int[5];
	static int[] pay = new int[5]; //실수령액
	static int pay_tot;// 총지급액
	
	static void calc() {//계산용도
		for(int i=0; i<name.length; i++) {
			bonus[i] = (int)(salary[i] * 0.3); //연봉의 30% 보너스
			total[i] = salary[i] + bonus[i]; //총액
			tax[i] = (int)(total[i] * 0.03);
			pay[i] = total[i] = tax[i]; //실수령액
			pay_tot = pay_tot + pay[i]; //지급총액
		}
	}
	static void print() { //출력용도
		System.out.println("이름\t연봉\t보너스\t총액\t세금\t실수령액");
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]+"\t"+salary[i]+"\t"+bonus[i]+"\t"+total[i]+"\t"+tax[i]+"\t"+pay[i]);
		}
		System.out.println("총지급액 합계 :"+pay_tot);
		System.out.println("연봉 평균 : "+ pay_tot/name.length);
	}
	public static void main(String[] args) {
		//main쪽 코딩량을 줄이도력 노력
		calc();  //계산할 기능의 메소드 호출
		print();

	}

}
