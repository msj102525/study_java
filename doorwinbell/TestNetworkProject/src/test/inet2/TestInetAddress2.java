package test.inet2;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TestInetAddress2 {
	public static void main(String[] args) throws UnknownHostException {
		// 키보드로 호스트명을 입력받아서, 해당 호스트가 가진 ip 주소 모드를 출력 처리
		// => 반복 실행 : "none" 입력시 종료
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("호스트명 (none 입력시 종료됨) : ");
			String host = sc.next();
			
			if(host.equals("none")) {
				break; // 반복 종료
			}
			
			InetAddress[] ips = InetAddress.getAllByName(host);
			System.out.println(host + "가 가진 ip는 " + ips.length + "개");
			for(InetAddress ip : ips) {
				System.out.println(ip.getHostAddress());
			}
			
		} while (true);

	}
}
