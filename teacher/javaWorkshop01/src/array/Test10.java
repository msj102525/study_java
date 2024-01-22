package array;

public class Test10 {

	public static void main(String[] args) {
		int[][] array = {
				{12, 41, 36, 56}, 
				{82, 10, 12, 61}, 
				{14, 16, 18, 78}, 
				{45, 26, 72, 23}};
		int[] copyAr = new int[array.length * array[0].length];
		int copyIndex = 0;
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				if(array[i][j] % 3 == 0){
					copyAr[copyIndex] = array[i][j];
					for(int k = 0; k < copyIndex; k++){
						if(copyAr[k] == copyAr[copyIndex]){
							copyIndex--;
							break;
						}
					}
					copyIndex++;
				}		
				
			}
		
		}

		System.out.print("copyAr : ");
		for(int i = 0; i < copyIndex; i++)
			System.out.print(copyAr[i] + "  ");
	}

}
