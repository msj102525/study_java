package test.exception;

import java.io.FileWriter;
import java.io.IOException;

public class TestException1 {

	public static void main(String[] args) /* throws IOException */{
		// 자바가 제공하는 클래스의 생성자 또는 메소드 사용시,
		// 반드시 예외처리를 해야 되는 경우가 있음
		TestException1 test = new TestException1();
		
		try {
			test.methodA(); // 반드시 예외처리해야 되는 구문
		} catch (IOException e) {
			// 예외발생시 처리구문을 작성함
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public void methodA() throws IOException{
		/* this. */methodB();
	}

	public void methodB() throws IOException{
		/* this. */methodC();
	}

	public void methodC() throws IOException {
		FileWriter fw = new FileWriter("sample.txt");
	}

}
