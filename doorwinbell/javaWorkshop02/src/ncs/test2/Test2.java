package ncs.test2;

public class Test2 {

	public static void main(String[] args) {
		if (args.length > 0) {
			char[] charArr = new char[args[0].length()];

			for (int i = args[0].length() - 1; i >= 0; i--) {
				charArr[i] = args[0].charAt(i);
				if (charArr[i] > 'a' && charArr[i] <= 'z') {
					System.out.print((char) (charArr[i] - 'a' + 'A'));
				} else {
					System.out.print(charArr[i]);
				}
			}
		} else {
			System.out.println("입력된 문자열이 없습니다.");
		}
//        System.out.println((int)'a');
	}
}
