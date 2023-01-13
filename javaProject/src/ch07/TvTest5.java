package ch07;

public class TvTest5 {
	public static void main(String[] args) {
		Tv myTv = new Tv();
		myTv.setChannel(11);
		int ch = myTv.getChannel(); //ch=11
		System.out.println("현재 채널은 " +ch+ "입니다.");
	}

}
