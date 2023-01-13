package ch14;

import java.text.NumberFormat;

public class Ec {

	private int no;
	private String orderDate;
	private String product;
	private String cardName;
	private String cardNo;
	private int pay;
	
	public Ec() {
		
	}
	
	public Ec(int no, String orderDate, String product, String cardName, String cardNo, int pay) {
		super();
		this.no = no;
		this.orderDate = orderDate;
		this.product = product;
		this.cardName = cardName;
		this.cardNo = cardNo;
		this.pay = pay;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getCardName() {
		
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardNo() {
		return cardNo.replace(cardNo.substring(5,8), "****");
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getPay() {
		return String.format("%,d", pay);
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	
}
