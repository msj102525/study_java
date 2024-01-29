package test.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		// HashSet의 후손(sub)클래스
		// 중복검사 기능 있음, 저장 순서가 유지됨
		LinkedHashSet linkSet = new LinkedHashSet();

		linkSet.add("apple");
		linkSet.add(123);
		linkSet.add(3.14);
		linkSet.add(123); // 중복 저장 안됨
		linkSet.add(new User("user2", "passwd2", "ad2"));
		
		System.out.println(linkSet);
		System.out.println(linkSet.size());
		
		// Set => Object[] : toArray()
		System.out.println("toArray()-----------------------------");
		Object[] objLinkSet = linkSet.toArray();
		for(Object obj : objLinkSet) {
			System.out.println(obj);
		}
		
		// Set => Iterator : iterator
		System.out.println("iterator()-----------------------------");
		Iterator iter = linkSet.iterator();
		while(iter.hasNext()) {
			Object ref = iter.next();
			System.out.println(ref);
		}
	}

}
