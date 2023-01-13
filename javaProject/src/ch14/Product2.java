package ch14;

import java.util.Scanner;

public class Product2 {
	private String num;
	private String name;
	private String manu;
	private int price;
	private int amount;
	private int money;
	private double tax;

	public void Product2() {
		
	}

	public Product2(String num, String name, String manu, int price, int amount, int money, double tax) {
		super();
		this.num = num;
		this.name = name;
		this.manu = manu;
		this.price = price;
		this.amount = amount;
		this.money = money;
		this.tax = tax;
		money = price*amount;
		tax = price*0.1;
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
