package practice;

public class five {

	public static void main(String[] args) {
	
		for(int i=1; i<=20; i++) {
			switch(i % 5) {
			case 0: System.out.println(i + ": 5의 배수입니다.");
			default: System.out.println(i + ": 5의 배수가 아닙니다.");
			}
		}

	}

}
