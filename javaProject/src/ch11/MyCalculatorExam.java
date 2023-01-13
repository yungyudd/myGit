package ch11;

public class MyCalculatorExam {
	public static void main(String[] args) {
		//다형성
		Calculator c = new MyCalculator();
		int value1 = c.multiple(5, 5);
		int value2 = c.plus(3, 3);
		int value3 = c.exec(5, 10);
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

}
