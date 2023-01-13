package ch19;

import java.util.Scanner;

public class Overloading {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1숫자:");
		int num = sc.nextInt();
		
		int sum =0;
		if(num >0) {
			int i=1;
			while(i <= num) {
				sum += i; 
				i++;
			}
			System.out.println("1부터" +num+"합"+sum+"이다.");
		}else {
				System.out.println("숫자가 1이상이 아니다.");
		}
		sc.close();
	}

}
