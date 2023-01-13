package ch07;

public class TvTest3 {

	public static void main(String[] args) {
		Tv myTv = new Tv(); 
		myTv.channel = 8;
		myTv.volume = 3;
		myTv.onOff = true;
		myTv.print();
		
		Tv yourTv = new Tv();
		yourTv.channel = 1;

	}

}
