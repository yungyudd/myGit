package ch07;

public class CarTest {
	public static void main(String[] args) {
		Car c = new Car(); //객체생성
		c.color = "red";
		c.changeGear(1);
		c.speedUp();
		System.out.println(c);
	}

}
