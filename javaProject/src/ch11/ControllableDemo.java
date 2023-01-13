package ch11;

public class ControllableDemo {

	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.turnOn();
		tv.turnOff();
		tv.remoteOff();
		tv.remoteOn();
		tv.repair();
		
		Controllable.reset();//static 메소드는 클래스이름.메소드로 접근 가능하다.
		
		Computer c = new Computer();
		c.turnOff();
		c.turnOn();
		c.repair();
		Controllable.reset();

	}

}
