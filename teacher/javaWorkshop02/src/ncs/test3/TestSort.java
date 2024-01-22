package ncs.test3;

public class TestSort {

	public static void main(String[] args) {
		int[] num = new int[10];
		
		//값 기록
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 50) + 51;			
		}
		
		System.out.print("before : ");
		for(int i = 0; i < num.length; i++) {			
			if(i < num.length -1) 
				System.out.print(num[i] + ", ");
			else 
				System.out.println(num[i]);
		}
		
		//select sort descending
		for(int i = 0; i < num.length - 1; i++) {
			for(int j = i + 1; j < num.length; j++) {
				if(num[i] < num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}			
		}
		
		System.out.print("after : ");
		for(int i = 0; i < num.length; i++) {			
			if(i < num.length -1) 
				System.out.print(num[i] + ", ");
			else 
				System.out.println(num[i]);
		}

	}

}
