package ch16;

public class BankUse {
	public static void main(String[] args) {
		MyBank my = new MyBank(); 
		BankPlayer hong = new BankPlayer(1, my);
		BankPlayer sa = new BankPlayer(2, my);
		BankPlayer lee = new BankPlayer(3, my);
		
		hong.start();
		sa.start();
		lee.start();
	}

}
