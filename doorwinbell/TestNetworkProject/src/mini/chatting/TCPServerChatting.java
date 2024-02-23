package mini.chatting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class TCPServerChatting {

	public static void main(String[] args) {
		// 서버용 프로그램
		int port = 7000;
		ServerSocket server = null;

		try {
			server = new ServerSocket(port);

			while (true) { // 계속 대기상태로 만듦
				clientAccess(server);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	} // main

	private static void clientAccess(ServerSocket server) {
		String serverIP = server.getInetAddress().getHostAddress(); // 서버가 구동되는 pc의 ip 주소 조회함
		try {
			// 클라이언트 접속 요청하면, 요청 수락하면서 클라이언트 정보 저장한 소켓을 만듦
			Socket client = server.accept();
			String clientIP = client.getInetAddress().getHostAddress(); // 접속 요청한 클라이언트 ip 주소 추출함
			System.out.println(clientIP + " : connected!!!");

			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			PrintWriter pw = new PrintWriter(client.getOutputStream());
			Scanner sc = new Scanner(System.in);

			try {
				// 메세지 주고 받기 : 서버가 먼저 받고(읽어들임) 답을 보내는 순서임
				String receiveMessage;
				while (!(receiveMessage = br.readLine()).equals("quit")) {
					System.out.println(clientIP + " : " + receiveMessage);
					System.out.print("응답할 메세지 입력 : ");
					pw.println(serverIP + " : " + sc.nextLine());
					pw.flush();
				}

				// quit 가 전송이 와서 정상적인 종료시
				System.out.println(clientIP + " : disconnected....");

			} catch (SocketException e) {
				// quit 를 전송하지 않고 비정상적을 종료한 경우
				System.out.println(clientIP + " :  클라이언트가 비정상적으로 종료하였습니다..");
				pw.close();
				br.close();
				client.close();
			} finally {
				pw.close();
				br.close();
				client.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
