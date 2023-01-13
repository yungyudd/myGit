package ch07;

public class Car {
	//멤버변수
	String color;
	int speed;
	int gear;
	
	//개발자용 메소드
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	void changeGear(int g) {
		gear = g; //지역변수
	}
	void speedUp() {
		speed = speed + 10;
	}
	void speedDown() {
		speed = speed - 10;
	}

}
