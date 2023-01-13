package ch19;

import java.net.InetAddress;

public class InetAddressExam2 {
	public static void main(String[] args) {
		try {
			//getAlByName(url) ==> 여래개의 ip주소를 배열로 저장 
			InetAddress[] address = InetAddress.getAllByName("naver.com");
			for(int i=0; i<address.length; i++) {
				System.out.println(address[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
