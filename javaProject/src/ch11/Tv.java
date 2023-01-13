package ch11;

public class Tv implements Controllable, RemoteControllable {

	@Override
	public void remoteOn() {
		System.out.println("리모컨으로 TV를 켠다.");
	}

	@Override
	public void remoteOff() {
		System.out.println("리모컨으로 TV를 끈다.");
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끈다.");
	}

}
