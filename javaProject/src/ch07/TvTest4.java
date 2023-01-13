package ch07;

public class TvTest4 {
	public static void main(String[] args) {
		Tv myTv = new Tv();
		myTv.channel = 7;
		myTv.volume = 3;
		myTv.onOff = true;
		int ch = myTv.getChannel();
		System.out.println("현재 채널은" +ch+"입니다.");
	}

}
