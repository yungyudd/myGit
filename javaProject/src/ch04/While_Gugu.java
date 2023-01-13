package ch04;

import java.util.Scanner;

public class While_Gugu {

	public static void main(String[] args) {
		int dan = 2;
		int h = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 중에서 출력하고 싶은 단을 입력하세요. : ");
		dan = sc.nextInt();
		System.out.println("## " +dan+ "단 ##");
		
		while(dan<=9) {
			while(h<=9) {
				System.out.println(dan+"x"+h+"="+(dan*h));
				h++;
			}
			dan++;
		}
	}
}
