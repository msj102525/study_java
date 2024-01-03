package logic.run;

import logic.testif.IfElseSample;
import logic.testif.IfSample;
import logic.testif.MultiIfSample;

public class TestLogic {

	public static void main(String[] args) {
		// 제어문 실행 테스트용
//		IfSample samp = new IfSample();
//		samp.test1();
//		samp.test2();
//		samp.test3();
		
//		IfElseSample samp = new IfElseSample();
//		samp.testIfElse1();
//		samp.testIfElse2();
//		samp.testIfElse3();
//		samp.printMax();
		
		MultiIfSample samp = new MultiIfSample();
//		samp.testThreeMax();
//		samp.testScoreGrade();
//		samp.testCharacter();
		samp.testTwoMaxEqual();
	}

}
