package ch04;

public class Mulit {

	public static void main(String[] args) {
		long num = 10;
		long sum = 1;
		for (int i =1; i<=num; i++) {
			sum = sum * i;
		}
		System.out.println("1~"+num+"까지의 곱 :" + sum);
	}

}
