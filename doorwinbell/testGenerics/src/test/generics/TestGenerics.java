package test.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestGenerics {

	public static void main(String[] args) {
		Map<String, Book> map;
		map = mapAllocation(); // 맵객체 생성(메모리 할당)해서 레퍼런스 리턴 실행
		putMaps(map); // 맵에 Book 객체 추가 메소드 실행
		printMap(map); // entry로 추출해서 출력 처리 : 제목=Book 객체
	}
	
	private static Map<String, Book> mapAllocation() {
		return new HashMap<String, Book>();
	}
	
	private static void putMaps(Map<String, Book> map) {
		map.put("제목1", new Book("제목1", "문승종1"));
		map.put("제목2", new Book("제목2", "문승종2"));
		map.put("제목3", new Book("제목3", "문승종3"));
	}

	

	private static void printMap(Map<String, Book> map) {
		Iterator<Map.Entry<String, Book>> entryIter = map.entrySet().iterator();
		
		while(entryIter.hasNext()) {
			Map.Entry<String, Book> entry = entryIter.next();
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
		System.out.println("------------------------------------------");
		
		for(Map.Entry<String, Book> entry : map.entrySet()) {
			System.out.println(entry);
		}
		
	}

	

}
