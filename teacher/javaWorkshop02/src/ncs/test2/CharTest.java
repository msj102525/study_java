package ncs.test2;

public class CharTest {

	public static void main(String[] args) {
		if(args.length == 1) {
			char[] arr = args[0].toCharArray();

			for(int i = arr.length - 1; i > -1; i--) {
				if(arr[i] >= 'a' && arr[i] < 'z') {
					arr[i] -= 32;					
				}
				System.out.print(arr[i]);				
			}
			System.out.println();
		}

	}

}
