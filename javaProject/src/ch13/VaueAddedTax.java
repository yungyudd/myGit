package ch13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VaueAddedTax {
	public static double valueOfSupply; //공급가액
	public static int vatRate = 10;
	public static double getVat() { //부가세 계산
		return valueOfSupply / vatRate;
	}
	public static double getTotal() {// 부가세 포함 합계
		return valueOfSupply + getVat();
	}
	public static void main(String[] args) {
		DecimalFormat de = new DecimalFormat("###,###");
		Scanner sc = new Scanner(System.in);
		System.out.println("공급가액을 입력하세요: ");
		VaueAddedTax.valueOfSupply = Double.parseDouble(sc.nextLine());
		System.out.println("*********************************");
		System.out.println("공급가액: " +de.format((int)valueOfSupply)+"원");
		System.out.println("부가가치세율: "+vatRate+ "%");
		System.out.println("부가가치세: "+de.format((int)getVat())+"원");
		System.out.println("합계: "+de.format((int)getTotal())+"원");
		System.out.println("*********************************");
		sc.close();

	}

}
