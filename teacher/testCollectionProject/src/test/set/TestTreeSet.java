package test.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		// TreeSet : 자동 오름차순정렬 기능이 내장된 Set 클래스임
		// 주의사항 : 같은 종류의 클래스 객체들만 저장해야 함
		TreeSet tset = new TreeSet();
		
		tset.add("grape");
		tset.add("banana");
		//tset.add(new User("u03", "p03", "테스트"));  //종류가 다른 객체는 저장하면 에러 발생함
		tset.add("apple");
		tset.add("melon");
		tset.add("orange");
		
		System.out.println(tset);
		
		//toArray()
		System.out.println("toArray() ----------------------");
		Object[] array = tset.toArray();
		for(Object obj : array) {
			System.out.println(obj);
		}
		
		//iterator()
		System.out.println("iterator() ----------------------");
		Iterator ascIter = tset.iterator();
		while(ascIter.hasNext()) {
			System.out.println(ascIter.next());
		}
		
		//descendingIterator() => 내림차순정렬된 목록 객체를 리턴함
		System.out.println("descendingIterator() ----------------------");
		Iterator descIter = tset.descendingIterator();
		while(descIter.hasNext()) {
			System.out.println(descIter.next());
		}
	}

}
