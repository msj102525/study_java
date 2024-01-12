package oop.array;

import java.util.GregorianCalendar;

public class TestPersonArray {

	public static void main(String[] args) {
		// Person 객체 배열 테스트
		/*
		 * Person p1 = new Person("홍동1", "010-123-11", "동료", new GregorianCalendar(1995,
		 * 6,11)); Person p2 = new Person("홍동2", "010-123-12", "동료", new
		 * GregorianCalendar(1995, 6,12)); Person p3 = new Person("홍동3", "010-123-13",
		 * "동료", new GregorianCalendar(1995, 6,13));
		 * 
		 * System.out.println(p1.information()); System.out.println(p2.information());
		 * System.out.println(p3.information());
		 */

		Person[] par = new Person[3]; // Person 객체의 주소보관용 레퍼런스변수방 3개를 배열로 만들었음
		// 각 레퍼런스에는 null로 초기화 되었음
		for (int i = 0; i < par.length; i++) {
			System.out.println("par [" + i + "] : " + par[i]);
		}

		par[0] = new Person("홍동1", "010-123-11", "동료", new GregorianCalendar(1995, 6, 11));
		par[1] = new Person("홍동2", "010-123-12", "동료", new GregorianCalendar(1995, 6, 12));
		par[2] = new Person("홍동3", "010-123-13", "동료", new GregorianCalendar(1995, 6, 13));
		
		
		for(int i=0;i<par.length;i++) {
			System.out.println(par[i].information());
		}
		
		
	}
}
