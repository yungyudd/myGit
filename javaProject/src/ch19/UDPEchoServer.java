package ch19;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPEchoServer {
	public UDPEchoServer(int port) {
		try {
			DatagramSocket ds = new DatagramSocket(port);
			while (true) {
				//udp 방식은 데이터를 바이트배열로 전송함, String을 바로 보낼수 없음
				//참고: 바이트배열의 최대크기는 65508)
				byte buffer[] = new byte[512];
				//udp방식의 통신은 데이터를 패킷으로 만들어서 전송
				DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
				System.out.println("ready");
				//클라이언트가 보낸 메세지를 수신하기 위한 코드
				//소캣을 통해 수신된 클라이언트의 메세지를 DatagramPacket에 저장
				ds.receive(dp);
				//클라이언트의 메세지를 스트링으로 변환
				String str = new String(dp.getData());
				System.out.println("클라이언트에서 보낸 메세지: "+str);
				InetAddress ia = dp.getAddress(); //클라이언트측 ip주소 get
				port = dp.getPort(); //클라이언트측 port번호 get
				System.out.println("client ip: "+ia+", client prot: "+port);
				//클라이언트에게 전송할 패킷객체 생성
				dp = new DatagramPacket(dp.getData(), dp.getData().length, ia, port);
				ds.send(dp);//클라이언트에게 자료 전송
				ds.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new UDPEchoServer(3000);
	}

}
