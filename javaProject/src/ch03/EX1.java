package ch03;

import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		String name;
		int Java, DB, HTML, JSP, tot;
		double avg;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름: ");
		name = scan.next();
		System.out.print("자바 성적?");
		Java = scan.nextInt();
		System.out.print("DB 성적?");
		DB = scan.nextInt();
		System.out.print("HTNL 성적?");
		HTML = scan.nextInt();
		System.out.print("JSP 성적?");
		JSP = scan.nextInt();
		scan.close();
		
		tot = Java + DB + HTML + JSP;
		avg = tot / 4;
		
		System.out.println("======================================");
		System.out.println("이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
		System.out.println("--------------------------------------");
		System.out.println(name+"\t"+Java+"\t"+DB+"\t"+HTML+"\t"+JSP+"\t"+tot+"\t"+avg);
		System.out.println("======================================");
	}

}
