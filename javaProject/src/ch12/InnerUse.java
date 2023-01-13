package ch12;

import ch11.Flyer;

public class InnerUse {
	public static void main(String[] args) {
		Flyer f = new Flyer() {//new 생성자() {}; => 무명클래스 
			
			@Override
			public void takeOff() {
				System.out.println("take off_12");
			}
			
			@Override
			public void land() {
				System.out.println("land_12");
			}
			
			@Override
			public void fly() {
				System.out.println("fly_12");
			}
		};//무명클래스
		f.takeOff();
		f.land();
		f.fly();
	}

}
