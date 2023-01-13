package ch09;

public class SportsCar extends Car{//Car클래스와 상속관계를 만듬
	boolean turbo;
	public void setTurbo(boolean flag) {
		turbo = flag;
		System.out.println(turbo);
	}

}
