package ch07;

public class Tv {
	//멤버 변수(전역 변수) 초기화 안해도 된다.
	int channel; //channel=0이 자동으로 초기화 되어있음
	int volume;
	boolean onOff;	
	
	//멤버 메소드
	void print() {
		System.out.println("채널은 " +channel+"이고 볼륨은"+volume+"입니다.");
	}
	int getChannel() {
		return channel;
	}
	void setChannel(int ch) {
		channel = ch;
	}
}
