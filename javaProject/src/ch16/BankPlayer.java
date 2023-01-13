package ch16;

public class BankPlayer extends Thread{
	int money;
	MyBank ba;
	
	public BankPlayer(int money, MyBank ba) {
		this.money = money;
		this.ba = ba;
	}
	@Override
	public void run() {
		switch (money) {
		case 1: ba.BankA(); break;
		case 2: ba.BankB(); break;
		case 3: ba.BankC(); break;
		}
	}

}
