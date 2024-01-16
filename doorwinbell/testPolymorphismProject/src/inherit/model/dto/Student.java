package inherit.model.dto;

import java.util.Objects;

public class Student extends Person {
	// Field
	private int sno;
	private String major;
	private double score;

	// Constructor
	public Student() {
		super();
	}

	public Student(int sno, String major, double score) {
		super();
		this.sno = sno;
		this.major = major;
		this.score = score;
	}

	public Student(String name, int age, char gender, String email, String phone, int sno, String major, double score) {
		super(name, age, gender, email, phone);
		this.sno = sno;
		this.major = major;
		this.score = score;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student " + super.toString() + "[sno=" + sno + ", major=" + major + ", score=" + score + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// 두 객체의 필드값이 일치하는지 확인하는 내용으로 변경
		Student other = (Student) obj;
		return super.equals(obj) && this.sno == other.sno && this.major.equals(other.major)
				&& this.score == other.score;
	}

	public Object clone()  {
		// this가 참조하는 객체의 필드값들을 복사한 새 객체 할당하고 주소 리턴함
		return new Student(this.getName(), this.getAge(), this.getGender(), this.getEmail(), this.getPhone(), this.sno,
				this.major, this.score);
	}

}
