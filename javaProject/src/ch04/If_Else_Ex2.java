package ch04;

public class If_Else_Ex2 {

	public static void main(String[] args) {
		int kor=90;
		int mat=85;
		int eng=70;
		int tot = kor + mat + eng;
		double avg = tot/3.0;
		String grade = ""; //등급(수우미양가)
		
		if(avg>=90) {
			grade = "수";
		}else if(avg>=80) {
			grade = "우";
		}else if(avg>=70) {
			grade = "미";
		}else if(avg>=60) {
			grade = "양";
		}else {
			grade = "가";
		}
		
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println(kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg+"\t"+grade);
		System.out.printf("%d\t%d\t%d\t%d\t%.1f\t%s",kor,eng,mat,tot,avg,grade);
	}

}

