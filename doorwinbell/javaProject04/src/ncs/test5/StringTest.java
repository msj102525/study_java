package ncs.test5;

public class StringTest {

	public static void main(String[] args) {
		String str = " A, b, c, D, a, B, C, d, f, F";
		String[] strArr = str.split(",");
		char[] chArr = new char[strArr.length];
		int count = 0;

		for (String s : strArr) {
//			System.out.print(s + " ");
			chArr[count++] = s.trim().charAt(0);
		}
		
		count = 0;
		System.out.println(count + " "+ strArr.length);
		System.out.println("==============");
		
		while (count < strArr.length) {
			
			char ch = chArr[count];
			
			if (!Character.isUpperCase(ch)) {
				count++;
				continue;
			}else {
				System.out.println("data[" + count + "] : " + ch);
				count++;
			}
		}
	}

}
