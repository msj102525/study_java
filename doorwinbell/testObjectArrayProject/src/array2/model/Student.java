package array2.model;

public class Student {
	// Field
	private char sclass; // 반 클래스 종류 : A, B, C 클래스로 분류
	private String name; // 학생이름
	private int score; // 점수
	
	// Constructor
	public Student() {}

	public Student(char sclass, String name, int score) {
		super();
		this.sclass = sclass;
		this.name = name;
		this.score = score;
	}

	// getters setters
	
	public char getSclass() {
		return sclass;
	}

	public void setSclass(char sclass) {
		this.sclass = sclass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String studentInformation() {
		return "Student [" + this.sclass + ", " + this.name + ", " + this.score + "]";
	}
	
}
