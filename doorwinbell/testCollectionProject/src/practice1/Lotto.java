package practice1;

import java.util.Random;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		// 실습문제 1
		lottoDisplay();

	}

	public static void lottoDisplay() {
//		>> 구현내용
//		1. 1 ~ 45 사이의 정수를 중복되지 않게, 6개 발생시켜
//		2. 자동 오름차순정렬되게 처리하는 Set 계열에 보관하고 
		TreeSet numbers = new TreeSet();
		Random r = new Random();

		while (true) {
			numbers.add(r.nextInt(45) + 1);
			if (numbers.size() == 6) {
				break;
			}
		}

//		3. int[]로 바꾸어 출력함.
		int[] lottoNumbers = new int[numbers.size()];
		Object[] array = numbers.toArray();
		for(int i =0;i < array.length;i++)	{
			lottoNumbers[i] = (int)array[i]; // Object => Integer => int : auto unboxing
			System.out.print(lottoNumbers[i] + "   ");
			
		}
		
	}

}
