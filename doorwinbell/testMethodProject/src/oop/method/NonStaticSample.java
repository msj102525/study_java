//package oop.method;
//
//import java.util.Arrays;
//
//public class NonStaticSample {
//	int[] numArr;
//
//	public NonStaticSample(int[] numArr) {
//		this.numArr = numArr;
//	}
//
//	public NonStaticSample() {
//	}
//
//	// int 한개의 전달값을 받아서, 배열의 주소를 리턴하는 메소드
//	// 처리할 내용 : 전달받은 정수 갯수만큼의 배열공간을 할당하여,
//	// 임의의 1부터 100사이의 값으로 값 기록하고 주소 리턴함
//	// 메소드 명 : intArrayAllocation
//	// 매개변수도 있고 반환값도 있는 메소드
//	public int[] intArrayAllocation(int num) {
//		numArr = new int[num];
//
//		for (int i = 0; i < numArr.length; i++) {
//			numArr[i] = (int) (Math.random() * 100 + 1);
//		}
//		return this.numArr;
//	}
//
//	// 메소드 명 : display
//	// 매개변수 있고 반환값 없는 메소드
//	// 처리할 내용 : 배열을 전달받아 화면에 출력함
//	public void display(int[] numArr) {
//		System.out.println("배열 : " + Arrays.toString(numArr));
//	}
//	// 메소드명 : swap
//	// 매개변수 있고 반환값 없는 메소드
//	// 처리할 내용 : 배열과, 두 정수의 인덱스를 전달받아
//	// 두 인덱스의 값을 교환함
//
//	public void swap(int i1, int i2) {
//		if (numArr != null && i1 >= 0 && i1 < numArr.length && i2 >= 0 && i2 < numArr.length) {
//			int temp = numArr[i1];
//			numArr[i1] = numArr[i2];
//			numArr[i2] = temp;
//		}
//	}
//
//	// 메소드명 : sortDescending
//	// 매개변수 있고 반환값 없는 메소드
//	// 처리할 내용 : 위에서 작성한 swap 메소드를 이용하여
//	// 배열의 값들을 내림차순 정렬 처리함
//	public void sortDescending(int[] arrNum) {
//		Arrays.sort(this.numArr);
//	}
//
//	// 메소드명 : sortAscending
//	// 매개변수 있고 반환값 없는 메소드
//	// 처리할 내용 : swap 메소드를 이용하여 배열의 값들을 오름차순 정렬함
//
//	// 1. 문자열과 문자 하나를 전달받아, 문자열에 포함된 문자의 갯수를 리턴하는 메소드
//	// 포함된 문자가 없으면 0 리턴함
//	// 메소드명 : countChar
//
//	// 2. 정수 두 개를 전달받아, 두 수중 작은 값에서 큰 값사이의 정수들의 합계를 구해서
//	// 리턴하는 메소드
//	// 메소드명 : totalValue
//
//	// 문자열과 인덱스를 전달받아, 그 위치의 문자를 리턴하는 메소드
//	// 메소명명 : pCharAt
//
//	// 두 개의 문자열을 전달받아, 하나의 문자열로 합쳐서 리턴하는 메소드
//	// 메소드명 : pConcat
//}

package oop.method;

public class NonStaticSample {
	public NonStaticSample(){}
	
	//int 한개의 전달값을 받아서, 배열의 주소를 리턴하는 메소드
	//처리할 내용 : 전달받은 정수 갯수만큼의 배열공간을 할당하여, 
	//         임의의 1부터 100사이의 값으로 값 기록하고 주소 리턴함
	//메소드 명 : intArrayAllocation
	public int[] intArrayAlloc(int su){	//매개변수도 있고 반환값도 있는 메소드
		int[] ar = new int[su];
		
		for(int i = 0; i < ar.length; i++)
			ar[i] = (int)(Math.random() * 100) + 1;
		
		return ar;
	}

	public void display(int[] ar){  //매개변수 있고 반환값 없는 메소드
		for(int i = 0; i < ar.length; i++)
			System.out.print(ar[i] + "   ");
		System.out.println();
		return;
	}
	
	public void swap(int[] ar, int i, int j){
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
	
	public void sortDescending(int[] ar){
		//select sort 방식
		for(int i = 0; i < ar.length - 1; i++){
			for(int j = i + 1; j < ar.length; j++){
				if(ar[i] < ar[j])
					swap(ar, i, j);
			}
		}
	}
	
	public void sortAscending(int[] ar){
		//select sort 방식
		for(int i = 0; i < ar.length - 1; i++){
			for(int j = i + 1; j < ar.length; j++){
				if(ar[i] > ar[j])
					swap(ar, i, j);
			}
		}
	}
	
	//1. 문자열과 문자 하나를 전달받아, 문자열에 포함된 문자의 갯수를 리턴하는 메소드
	//포함된 문자가 없으면 0 리턴함
	//메소드명 : countChar
	public int countChar(String str, char ch){
		int count = 0;
		
		if(str != null && str.length() > 0){  //전달된 문자열 값이 있을때만 처리
			for(int i = 0; i < str.length(); i++){
				if(str.charAt(i) == ch)
					count++;
			}
		}
		
		return count;
	}
	
	//2. 정수 두 개를 전달받아, 두 수중 작은 값에서 큰 값사이의 정수들의 합계를 구해서
	//리턴하는 메소드
	//메소드명 : totalValue
	public int totalValue(int first, int second){
		int sum = 0, min, max;
		
		if(first > second){
			max = first;
			min = second;
		}else{
			min = first;
			max = second;
		}
		
		System.out.println(min + "부터 " + max + "까지의 합계");
		
		for(int k = min; k <= max; k++)
			sum += k;		
		
		return sum;
	}
	
	//문자열과 인덱스를 전달받아, 그 위치의 문자를 리턴하는 메소드
	public char charAt(String s, int index){
		char[] charArr = s.toCharArray();
		return charArr[index];
	}
	
	//두 개의 문자열을 전달받아, 하나의 문자열로 합쳐서 리턴하는 메소드
	public String concat(String s1, String s2){
		return s1 + s2;
	}
}








