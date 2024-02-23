package test.udp.server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

	public static void main(String[] args) throws Exception {
		// UDP 통신을 사용하는 서버측 프로그램
		int port = 5555;
		
		DatagramSocket server = new DatagramSocket();
		// 메세지를 받을 클라이언트 측 ip 주소 필요함
		InetAddress client = InetAddress.getByName("127.0.0.1");

		// 보낼 메세지 준비
		String message = "스팸 문자입니다.";
		byte[] sendMessage = message.getBytes();
		
		// 메세지 전송할 객체 DatagramPacket 생성함		
		DatagramPacket packet = new DatagramPacket(sendMessage, 0, sendMessage.length, client, port);
		
		// send() 메소드로 패킷을 전송함
		server.send(packet);
		
		server.close();
		
	}

}
