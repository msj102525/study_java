package array.silsub.model;
// 2차원 배열 실습문제 풀이용 클래스

import java.util.Scanner;

public class Sample {
	/**
	 * 문제 실행시 사용할 키보드 입력용 필드
	 */
	private Scanner sc = new Scanner(System.in);

	/**
	 * Sample 클래스의 기본 생성자
	 */

	public Sample() {
	}

	/**
	 * 1. 4행4열 2차원배열 선언 및 생성 2. 0행0열부터 2행2열까지 1부터 100사이의 임의의 정수값 기록해 넣음 3. 아래의 내용처럼
	 * 처리함 0열 1열 2열 3열 0행 값 값 값 0행 값들의 합계 1행 값 값 값 1행 값들의 합계 2행 값 값 값 2행 값들의 합계 3행
	 * 0열합계 1열합계 2열합계 가로+세로합계
	 */

	public void munjae1() {
		int[][] matrix = new int[4][4];

		// 0행0열부터 2행2열까지 1부터 100사이의 임의의 정수값 기록해 넣음
		for (int i = 0; i < matrix.length - 1; i++) {
			for (int j = 0; j < matrix[i].length - 1; j++) {
				matrix[i][j] = (int) (Math.random() * 100) + 1;
			}
		}

		// 가로 행 합계, 세로 열 합계, 총합계 : 가로합 + 세로합
		for (int i = 0; i < matrix.length - 1; i++) {
			for (int j = 0; j < matrix[i].length - 1; j++) {
				matrix[i][3] += matrix[i][j]; // 가로합계
				matrix[3][i] += matrix[j][i]; // 세로합
			}
		}

		// 총합계 계산
		for (int i = 0; i < matrix.length - 1; i++) {
			matrix[3][3] += matrix[i][matrix[i].length - 1] + matrix[matrix.length - 1][i];
		}

		// 출력 확인
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%7d", matrix[i][j]);
			}
			System.out.println();
		}
	}

	public void munjae1_1() {
		int[][] matrix = new int[4][4];

		// 0행0열부터 2행2열까지 1부터 100사이의 임의의 정수값 기록해 넣음
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = (int) (Math.random() * 100) + 1;
				matrix[i][3] += matrix[i][j]; // 가로합계
				matrix[3][j] += matrix[i][j]; // 세로합
				matrix[3][3] += matrix[i][j] * 2; // 총합계 : 가로합 + 세로합
			}
		}

		// 출력 확인
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%7d", matrix[i][j]);
			}
			System.out.println();
		}

	}

	/**
	 * 1. 3행짜리 2차원배열 선언 및 생성 2. 각 행별 열갯수는 키보드로 입력받아 생성함 3. 1~100사이의 임의의 정수를 모든 방에
	 * 기록함 4. 각 행별 열의 합계가 5의 배수인 행열값만 출력함
	 */
	public void munjae2() {
		int[][] tar = new int[3][];
		int[] sum = new int[3];

		for (int i = 0; i < tar.length; i++) {
			System.out.print(i + "행의 열갯수 : ");
			tar[i] = new int[sc.nextInt()];
			// 1~100사이의 정수 기록
			for (int j = 0; j < tar[i].length; j++) {
				tar[i][j] = (int) (Math.random() * 100) + 1;
				sum[i] += tar[i][j];
			}
		}

		// 각 행별 열의 합계가 5의 배수인 행열값만 출력함
		for (int i = 0; i < tar.length; i++) {
			if (sum[i] % 5 == 0) {
				System.out.print(i + "행 : ");
				for (int j = 0; j < tar[i].length; j++) {
					System.out.printf("%-7d", tar[i][j]);
				}
				System.out.println(i + "행 합계 : " + sum[i]);
			}
		}
	} // munjae2 ()

	//실습문제 4 : 강사님   code
//		public void munjae4() {
//			int[][] score = new int[7][7];
//					
//			for(int i = 0; i < score.length - 1; i++){					
//				System.out.print("학생번호 : ");
//				score[i][0] = sc.nextInt();
//				System.out.print("국어 : ");
//				score[i][1] = sc.nextInt();
//				System.out.print("영어 : ");
//				score[i][2] = sc.nextInt();
//				System.out.print("수학 : ");
//				score[i][3] = sc.nextInt();
//				
//				for(int j = 1; j < score[i].length - 3; j++) {				
//					score[i][4] += score[i][j];	//학생 총점 계산				
//				}			
//				score[i][5] = score[i][4] / 3;	//학생 평균 계산			
//			}
//			
//			int korTot = 0, engTot = 0, matTot = 0;
//			for(int k = 0; k < score.length - 1; k++){		//과목별 평균계산
//				korTot += score[k][1];  //국어총점
//				engTot += score[k][2];  //영어총점
//				matTot += score[k][3];	 //수학총점		
//			}
//			
//			score[6][1] = korTot / 6;
//			score[6][2] = engTot / 6;
//			score[6][3] = matTot / 6;
//			
//			//등수 처리
//			for(int i = 0; i < score.length - 1; i++){
//				score[i][6] = 1;  //자신을 1등으로 지정
//				for(int j = 0; j < score[i].length; j++){
//					if(score[i][5] < score[j][5])	//자신의 평균이 다른 평균보다 작으면
//						score[i][6]++;	//등수를 1 증가 처리
//				}			
//			}
//			
//			//출력 확인
//			System.out.printf("%4s%4s%4s%4s%4s%4s%4s \n", 
//					      "번호", "국어", "영어", "수학", "총점", "평균", "등수");  //제목행 출력
//			for(int i = 0; i < score.length; i++){
//				for(int j = 0; j < score[i].length; j++)
//					System.out.printf("%5d", score[i][j]);
//				System.out.println();
//			}
//			
//		}

	public void munjae4() {
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[3][7]; 

		for (int i = 0; i < arr.length; i++) {
			int stNum, kor, mat, eng;

			System.out.print("학생번호 : ");
			stNum = sc.nextInt();

			System.out.print("국어 점수 : ");
			kor = sc.nextInt();

			System.out.print("수학 점수 : ");
			mat = sc.nextInt();

			System.out.print("영어 점수 : ");
			eng = sc.nextInt();

			int tot = kor + mat + eng;
			int avg = tot / 3;

			arr[i][0] = stNum;
			arr[i][1] = kor;
			arr[i][2] = mat;
			arr[i][3] = eng;
			arr[i][4] = tot;
			arr[i][5] = avg;
		}

		System.out.println("=========================================");
		System.out.println("학생번호      국어     수학     영어         총점          평균      등수");
		System.out.println("=========================================");

		// 등수처리
				for(int i = 0; i < arr.length; i ++) {
					arr[i][6] = 1; // 자신을 1등으로 지정
					for(int j = 0;j < arr.length; j++) {
						if(arr[i][5] < arr[j][5]) { // 자신의 평균이 다른 평균보다 작으면
							arr[i][6] ++ ; // 등수를 1 증가 처리
						}
					}
				}
				
		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t" + "\t");
			}
			System.out.println();
		}


		int korAvg = 0, matAvg = 0, engAvg = 0;

		for (int i = 0; i < arr.length; i++) {
			korAvg += arr[i][1];
			matAvg += arr[i][2];
			engAvg += arr[i][3];
		}
		
		System.out.print("국어 평균 : " + korAvg / arr.length);
		System.out.print("수학 평균 : " + matAvg / arr.length);
		System.out.print("영어 평균 : " + engAvg / arr.length);

	}
	
}// class
