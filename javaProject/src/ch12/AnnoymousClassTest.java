package ch12;

interface RemoteControl {
	void turnOn(int n);
	void turnOff(String m);
}


public class AnnoymousClassTest {
	public static void main(String[] args) {
		//interface는 new 해서 객체생성을 못하지만 아래처럼
		//무명클래스 처리하면 자동적으로 인터페이스를 무명클래스가 상속받아 오버라이딩 처리할 수 있다.
		RemoteControl re = new RemoteControl() {//익명클래스
			
			@Override
			public void turnOn(int n) {
				System.out.println("Tv turnOn()"+n);
			}
			
			@Override
			public void turnOff(String m) {
				System.out.println("Tv turnOff()"+m);
			}
		};//무명내부클래스
		re.turnOn(3);
		re.turnOff("dd");
	}
}
