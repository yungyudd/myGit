package ch07;

public class TvTest {

	public static void main(String[] args) {
		Tv t = new Tv(); //객체생성 메모리에 올림, 인스턴스화
		System.out.println(t);
		t.channel = 7;
		t.volume = 10;
		t.onOff = true; //전원상태 boolean true 또는 false
		System.out.println("텔레비전의 채널은"+t.channel+"이고"+t.volume+"입니다.");

	}

}
