package ch09;

public class SaleUse {
	public static void main(String[] args) {
		Sale s = new Sale(); //부모Product 까지 객체생성
		s.input(1234, "냉장고", "LG", "20220105", 2000, 5);
		s.calc();
		s.print();
	}

}
