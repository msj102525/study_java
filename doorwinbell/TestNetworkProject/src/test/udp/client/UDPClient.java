package test.udp.client;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPClient {

	public static void main(String[] args) throws Exception {
		// UDP 통신을 사용한 클라이언트측 프로그램 : 일방적으로 메세지를 받음
		byte[] receiveMessage = new byte[1024];
		
		DatagramSocket client = new DatagramSocket(5555);
		DatagramPacket packet = new DatagramPacket(receiveMessage, 1024);
		
		client.receive(packet);

		System.out.println("받은 메세지 확인 : " + new String(receiveMessage));
		
		client.close();
		
	}

}
