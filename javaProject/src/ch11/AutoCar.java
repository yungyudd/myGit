package ch11;

public class AutoCar implements OperateCar {

	@Override
	public void start() {
		System.out.println("차 출발");
	}

	@Override
	public void stop() {
		System.out.println("차 정지");
	}

	@Override
	public void setSpeed(int speed) {
		System.out.println("차 속도를"+speed+"로 변경");
	}

	@Override
	public void turn(int degree) {
		System.out.println("자동차가 방향을"+degree+"변경");
	}

}
