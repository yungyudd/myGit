package ch13;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		System.out.println(Math.ceil(10.1));
		System.out.println(Math.round(10.5));
		System.out.println(Math.floor(10.6));
		System.out.println(Math.pow(10, 3));
		Random ra = new Random();
		System.out.println("정수값: " +ra.nextInt(100));
		System.out.println("실수값: " +ra.nextDouble());
		
		int a = 10;
		Integer b=20;// 1.5이하 버전에서는 에러, intValue()가 작동
		Integer c= new Integer(3);
		System.out.println(b);
		System.out.println(c);
		
	}

}
