package test.commandline;

public class TestMainArgument {

	public static void main(String[] args) {
		// 명령프롬프트에서 프로그램 실행시 main() 메소드로 값을 전달할 수 있음
		// ...> 명령어 전달값 전달값
		System.out.println("main에게 전달된 값의 갯수 : " + args.length);

		for (int i = 0; i < args.length; i++) {
			System.out.println(i + "번째 전달값 : " + args[i]);
		}

	}

}
