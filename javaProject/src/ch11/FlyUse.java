package ch11;

public class FlyUse {
	public static void main(String[] args) {
		Airplane a = new Airplane();		
		a.takeOff();
		a.fly();
		a.land();
		
		Bird b = new Bird();
		b.takeOff();
		b.fly();
		b.land(); 
		
		//좌변 부모, 우변 자식 => 다형성
		Flyer f = new Airplane();
		f.takeOff();
		f.fly();
		f.land();
		f= new Bird();
		f.takeOff();
		f.fly();
		f.land();
		
	}

}
