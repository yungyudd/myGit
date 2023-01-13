package ch11;

import java.text.Format;

public class Slnfo implements Student {
	private String name;
	private String address;
	private String email;
	private int kor, eng, mat, tot;
	private double avg;
	

	@Override
	public void address(String name, String address, String email) {
		this.name = name;
		this.address = address;
		this.email = email;
	}

	@Override
	public void point(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		tot = kor+eng+mat;
		avg = tot/3.0;
	}
	public void print() {
		
		System.out.println("=============================================");
		System.out.println("이름\t주소\t\t이메일");
		System.out.println(name+"\t"+address+"\t\t"+email);
		System.out.println("----------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+String.format("%.1f", (double)avg));
		System.out.println("=============================================");
	}

}
