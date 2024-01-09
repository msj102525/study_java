package array.algorithm;

import java.util.Random;

public class PracticeArray {
	//배열 알고리즘 실습문제
	public void lotto() {
		//1~45사이의 임의의 정수를 중복되지 않게 6개 발생시켜 저장
		int[] numbers = new int[6];
		Random r = new Random();
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if(numbers[i] == numbers[j]) {
					i--;
					break;
				}
			}
		}
		
		//오름차순 정렬 처리해서 출력 확인
		for(int i = 0; i < numbers.length - 1; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				if(numbers[i] > numbers[j]) {
					//swap
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		
		//출력 확인
		System.out.print("당첨번호 : ");
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "   ");
		}
		System.out.println();
	}
}
