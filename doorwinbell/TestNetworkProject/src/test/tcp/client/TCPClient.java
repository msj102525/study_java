package test.tcp.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

// TCP 통신을 사용하는 클라이언트측 프로그램
public class TCPClient {

	public static void main(String[] args) throws IOException {
		// 1. 서버의 포트번호와 ip 주소 필요
		int port = 5000;
		String serverIP = InetAddress.getLocalHost().getHostAddress();
		// String serverIP = "연결할 상대 pc 의 ip 주소";
		
		// 2. 클라이언트용 소켓 객체 생성 => 바로 서버와 연결됨
		Socket socket = new Socket(serverIP, port);
		// 연결 실패는 null 리턴됨
		
		if(socket != null) { // 서버와 연결되었다면....
			// 3. 서버와 해당 클라이언트 간의 입출력 스트림 생성
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			
			// 클라이언트가 먼저 보내고, 서버로부터 답을 받는 순서로 정했으므로...
			// 4. 메세지 주고 받기
			pw.println("메세지 보냅니다.");
			pw.flush();
			String responseMessage = br.readLine();
			
			System.out.println(responseMessage);
			
			// 5. 스트림 반납
			pw.close();
			br.close();
			
			// 6. 서버와 연결을 끊음
			socket.close();
			
		} else {
			System.out.println(serverIP + " 서버와 연결이 실패하였습니다.");
		}
				
		
	}

}







