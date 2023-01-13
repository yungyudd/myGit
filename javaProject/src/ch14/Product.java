package ch14;

import java.util.Scanner;

public class Product {
	private String num;
	private String name;
	private String manu;
	private int price;
	private int amount;
	private int money;
	private double tax;

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("제품번호: ");
		num = sc.next();
		System.out.println("제품명: ");
		name = sc.next();
		System.out.println("제조사: ");
		manu = sc.next();
		System.out.println("단가: ");
		price = sc.nextInt();
		System.out.println("수량: ");
		amount = sc.nextInt();
		
		tax = price*0.1;
		money = price * amount;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManu() {
		return manu;
	}

	public void setManu(String manu) {
		this.manu = manu;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

}
