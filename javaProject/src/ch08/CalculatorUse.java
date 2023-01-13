package ch08;

public class CalculatorUse {

	public static void main(String[] args) {
		Calculator c1 = new Calculator(); //객체생성 및 기본생성자 호출
		c1.setLeft(17);
		c1.setRight(16);
		System.out.println(c1.getLeft());
		System.out.println(c1.getRight());
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator(10,20);
		c2.sum();
		c2.avg();

	}

}
