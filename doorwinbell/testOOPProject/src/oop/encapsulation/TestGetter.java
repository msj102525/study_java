package oop.encapsulation;

public class TestGetter {
	
	
	public static void main(String[] args) {
		// getter 메소드 사용 테스트
		Student s1 = new Student(11, "문승종", 27, "010-1234-5678", '남', "건축", "jnh@test1.org", "자양동1", 100.0);
		
		Student s2 = new Student(12, "문종승", 26, "010-1234-5679", '여', "컴공", "jnh@test2.org", "자양동2", 100.0);
		
		Student s3 = new Student(13, "종승문", 25, "010-1234-5670", '남', "수의", "jnh@test3.org", "자양동3", 100.0);
		
		s1.printInformation();
		s2.printInformation();
		s3.printInformation();
		
		// 수강생 3명의 시험성적의 합계를 구하고 평균을 계산 출력
		double total = s1.getScore() + s2.getScore()  + s3.getScore();
		System.out.println("점수 총점 : " + total);
		System.out.println("평균 점수" + total / 3);
		
		// 수강생들의 나이의 평균을 계산 출력
		int ageAvg = (s1.getAge() + s2.getAge() + s3.getAge()) / 3;
		System.out.println("평균 나이 : " + ageAvg);
	}
	
	
}
