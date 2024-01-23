package ncs.test7;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class NoticeTest {
	public static void main(String args[]) {
		Object[] obArray = new Object[3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < obArray.length; i++) {
			System.out.println("등록할 공지사항을 입력하시오. " + (i + 1) + "번");
			System.out.print("제목: ");
			String title = sc.nextLine();
			System.out.print("작성자: ");
			String writer = sc.nextLine();
			System.out.print("내용: ");
			String content = sc.nextLine();

			Calendar calendar = Calendar.getInstance();
			Date currentDate = calendar.getTime();

			Notice notice = new Notice(i + 1, title, currentDate, writer, content);
			obArray[i] = notice;
		}

		Notice[] noticeArray = new Notice[obArray.length];
		for (int i = 0; i < obArray.length; i++) {
			if (obArray[i] instanceof Notice) {
				noticeArray[i] = (Notice) obArray[i];
			}
		}

		System.out.println("배열에 저장된 객체 정보는 다음과 같습니다.");
		for (Notice notice : noticeArray) {
			System.out.println(notice.toString());
		}
	}
}
