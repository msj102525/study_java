package inherit.run;

import inherit.model.dto.Customer;
import inherit.model.dto.Student;

public class TestStudent2 {
	public static void main(String[] args) {
		// 객체배열 테스트
		Student[] sar = new Student[3];

		sar[0] = new Student("문", 11, '남', "msj1@test.org", "0101-123-123", 11, "자양동1", 12.3);
		sar[1] = new Student("문", 12, '남', "msj2@test.org", "0102-123-123", 12, "자양동2", 12.3);
		sar[2] = new Student("문", 13, '남', "msj3@test.org", "0103-123-123", 13, "자양동3", 12.3);
		
		// 학점 평균을 구한다면
		double totalScore = 0;
		for(Student s : sar) {
			System.out.println(s);
			totalScore += s.getScore();
		}
		System.out.println("학점 평균 : " + Math.floor((totalScore / sar.length)* 10) / 10);
		System.out.printf("학점 평균 : %.1f\n", (totalScore / sar.length));

	}
}
