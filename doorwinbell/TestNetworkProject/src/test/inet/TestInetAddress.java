package test.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {

	public static void main(String[] args) throws UnknownHostException {
		// java.net.InetAddress test
		
		// getLocalHost() : 프로그램이 실행되는 컴퓨터의 ip 주소를 알아내서 리턴
		InetAddress ip1 = InetAddress.getLocalHost();
		System.out.println(ip1.getHostAddress()); // ip 주소만 출력
		System.out.println(ip1.getHostName()); // 컴퓨터 이름 출력
		
		InetAddress ip2 = InetAddress.getByName("www.naver.com");
		InetAddress[] ipes = InetAddress.getAllByName("www.gogle.com");

		System.out.println("naver : " + ip2.getHostAddress());
		System.out.println("google 의 서버는 " + ipes.length + "개 있습니다");
		for(InetAddress ip : ipes) { 
			System.out.println(ip.getHostAddress());
		}
		
		InetAddress[] ipes2 = InetAddress.getAllByName("www.naver.com");
		System.out.println("naver 서버는 " + ipes.length + "개");
		for(InetAddress ip : ipes2) {
			System.out.println(ip.getHostAddress());			
		}
	}

}
