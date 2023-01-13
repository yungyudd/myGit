package practice;

import java.util.Scanner;

public class Exit {
	
	public static void main(String[] args) {
		String value;
		String name = null;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자열을 입력해주세요: ");
			name = sc.next();
			if(name.equals("exit")){
				break;
			}
			System.out.println(name.length()+"글자입니다.");
		}
		sc.close();
		System.out.println("프로그램을 종료합니다.");
	}

}
