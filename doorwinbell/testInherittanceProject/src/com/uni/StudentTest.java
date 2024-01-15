package com.uni;

public class StudentTest {

	public static void main(String[] args) {
		Student[] stuArr = new Student[3];
		stuArr[0] = new Student("홍길동", 15, 171, 81, "201101", "영문");
		stuArr[1] = new Student("한사람", 13, 183, 72, "201102", "건축");
		stuArr[2] = new Student("임걱정", 16, 175, 65, "201103", "무영");
		
		for(int i=0; i<stuArr.length;i++) {
			System.out.println(stuArr[i].printInformation());
		}
		
		for(Student s : stuArr) {
			System.out.println(s.printInformation());			
		}
		
	}

}
