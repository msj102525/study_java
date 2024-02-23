package test.url;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;

public class TestURL2 {

	public static void main(String[] args) {
		// 키보드로 URL을 입력받아, 프로토콜, 포트번호, 호스트명, 파일경로, 쿼리스트링 출력 처리함
		// 단, URL은 한줄씩 입력받고, URL 앞뒤에 안보이는 공백은 제거함
		// url 의 호스트명으로 ip 주소 조회 출력 => 반복 실행 : none 입력시 종료 처리함
		// 키보드 입력은 BufferedReader 사용함

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			do {
				System.out.print("url 입력 (none 입력시 종료) : ");
				String url = br.readLine().trim(); // 한줄입력, 공백제고

				if (url.equals("none"))
					;

				URL urlInfo = new URL(url);

				System.out.println("프로토콜 : " + urlInfo.getProtocol());
				System.out.println("포트번호 : " + urlInfo.getPort());
				System.out.println("호스트명 : " + urlInfo.getHost());
				System.out.println("URL 내용 : " + urlInfo.getContent());
				System.out.println("파일경로 : " + urlInfo.getFile());
				System.out.println("전체경로 : " + urlInfo.toExternalForm());
				System.out.println("쿼리스트링 : " + urlInfo.getQuery());

				InetAddress[] ips = InetAddress.getAllByName(urlInfo.getHost());

				for (InetAddress ip : ips) {
					System.out.println(ip);
				}

			} while (true);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
