package ncs.test4;

import java.util.Scanner;

public class TestScore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] scores = new double[3][5];

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번 학생의 과목 점수를 입력하세요:");
            for (int j = 0; j < scores[i].length - 2; j++) {
                System.out.print("과목" + (j + 1) + ": ");
                scores[i][j] = scanner.nextDouble();
            }
        }


        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length - 2; j++) {
                scores[i][3] += scores[i][j]; // 각 행의 총점 계산
            }
            scores[i][4] = scores[i][3] / (scores[i].length - 2); 
        }

        System.out.println("순서 \t과목1\t과목2\t과목3\t총점\t평균");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(i + "\t");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.printf("%.1f\t", scores[i][j]);
            }
            System.out.println();
        }
    }
}
