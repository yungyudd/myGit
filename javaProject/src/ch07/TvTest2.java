package ch07;

public class TvTest2 {
	public static void main(String[] args) {
		Tv myT = new Tv(); //객체생성 =>메모리에 로딩
		System.out.println(myT); //해쉬코드 주소값(해쉬코드)
		myT.channel = 10;
		myT.volume = 9;
		myT.onOff = true;
		System.out.println("나의 텔레비전의 채널은"+myT.channel+"이고 볼륨은"+myT.volume);
		
		Tv yrT = new Tv(); //객체생성
		System.out.println(yrT);
		yrT.channel = 11;
		yrT.volume = 1;
		yrT.onOff = true;
		System.out.println("너의 텔레비전의 채널은"+yrT.channel+"이고 볼륨은"+yrT.volume);
	}

}
