package com.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class NumberOk {

    public static void main(String[] args) {
        NumberOk numberOk = new NumberOk();
        int targetNumber = numberOk.generateRandomNumber();
        System.out.println(targetNumber);
        numberOk.playGame(targetNumber);
    }

    // 키보드로부터 정수 입력 받는 메서드
    public int getNumber() {
        int number = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("정수 입력: ");
            String input = reader.readLine();
            number = Integer.parseInt(input);
        } catch (IOException | NumberFormatException e) {
            System.out.println("올바른 정수를 입력하세요.");
            return getNumber(); // 재귀 호출
        }

        return number;
    }

    // 정수를 맞히는 게임을 진행하는 메서드
    public void playGame(int targetNumber) {
        int attempts = 0;

        do {
            int userGuess = getNumber();
            attempts++;

            int result = questionNumber(userGuess, targetNumber);

            if (result == 0) {
                System.out.println("맞았습니다. (" + attempts + "번째)");
                break;
            } else if (result < 0) {
                System.out.println("크다.");
            } else {
                System.out.println("작다.");
            }

            System.out.print("계속 하시겠습니까?(y/n): ");
        } while (shouldContinue());
        
        System.out.println("프로그램을 종료합니다.");
    }

    // 난수를 발생시키는 메서드
    public int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    // 사용자의 입력과 난수를 비교하는 메서드
    public int questionNumber(int userGuess, int targetNumber) {
        if (userGuess == targetNumber) {
            return 0;
        } else if (userGuess < targetNumber) {
            return -1;
        } else {
            return 1;
        }
    }

    // 계속 진행할지 여부를 확인하는 메서드
    public boolean shouldContinue() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String response = reader.readLine().toLowerCase();
            return response.equals("y");
        } catch (IOException e) {
            System.out.println("입력 오류입니다. 계속 진행합니다.");
            return true;
        }
    }
}
