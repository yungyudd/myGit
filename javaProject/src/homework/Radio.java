package homework;

public class Radio {
	int volume;
	double channel;
	boolean onOff;
	String name;

	void print() {
		System.out.println("\n["+name+" 라디오]");
		if(onOff = true) {
			System.out.println("라디오가 켜저있습니다.");
		}else {
			System.out.println("라디오가 꺼져있습니다.");
		}
		System.out.println("현재 채널은 "+channel+"입니다.");
		System.out.println("볼륨은 "+volume+" 입니다.");
	}
}
