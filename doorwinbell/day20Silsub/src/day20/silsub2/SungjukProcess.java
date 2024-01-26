package day20.silsub2;

import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class SungjukProcess {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SungjukProcess sp = new SungjukProcess();
		sp.sungjukSave();
		sp.scoreRead();
	}

	public void sungjukSave() {
		char yOrN = ' ';

		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("score.dat"))) {
			do {
				System.out.print("국어 점수 : ");
				int kor = sc.nextInt();

				System.out.print("영어 점수 : ");
				int eng = sc.nextInt();

				System.out.print("수학 점수 : ");
				int mat = sc.nextInt();

				int tot = kor + eng + mat;
				double avg = tot / 3.0;

				dos.writeInt(kor);
				dos.writeInt(eng);
				dos.writeInt(mat);
				dos.writeInt(tot);
				dos.writeDouble(avg);

				System.out.println("계속 저장하시겠습니까? (y/n) :");
				yOrN = Character.toLowerCase(sc.next().charAt(0));

			} while (yOrN == 'y');
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void scoreRead() {
		try (DataInputStream din = new DataInputStream(new FileInputStream("score.dat"))) {
			int kor, eng, mat, tot;
			double avg;

			while (true) {
				try {
					kor = din.readInt();
					eng = din.readInt();
					mat = din.readInt();
					tot = din.readInt();
					avg = din.readDouble();

					System.out.println("국어 : " + kor);
					System.out.println("영어 : " + eng);
					System.out.println("수학 : " + mat);
					System.out.println("총점 : " + tot);
					System.out.printf("평균 : %.2f", avg);
					System.out.println();

				} catch (Exception e) {
					break;
				}
			}
			System.out.println("score.dat 파일 읽기 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
