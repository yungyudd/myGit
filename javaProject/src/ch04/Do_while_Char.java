package ch04;

public class Do_while_Char {

	public static void main(String[] args) {
		char c = 'a';
		do {
			System.out.print(c);
			c=(char)(c+1); //영문의 경우 1을 더하면 다음 알파벳의 코드 값
		}while(c <= 'z');

	}

}
