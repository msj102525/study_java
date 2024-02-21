package test.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestGenerics5 {

	public static void main(String[] args) {
		// Map 에서의 Genderics 사용 테스트
		// Map<K, V> : K (key의 클래스타입), V( value의 클래스타입)
		Map<Integer, String> map = mapAllocation();
		mapInit(map);
		printMap(map);
	}

	// Map 객체 메모리 할당 (생성)하고 리턴하는 메소드
	public static Map<Integer, String> mapAllocation(){
		return new HashMap<Integer, String>();
	}
	
	// Map 객체 저장 객체 추가하는 메소드
	public static void mapInit(Map<Integer, String> map) {
		map.put(1, "olive");
		map.put(new Integer(2), new String("green"));
//		map.put(2.5, "ivory"); // 키의 자료형이 틀림, 에러발생
//		map.put(3, new java.util.Date()); // 값의 자료형이 틀림, 에러발생
		map.put(3, "skyblue");
	}
	
	// Map 객체에 저장된 객체 정보 출력하는 메소드
	public static void printMap(Map<Integer, String> map) {
		// key에 대한 목록을 이용하여 연속 처리 => 출력 : 키 = 값
		Iterator<Integer> keyIter = map.keySet().iterator();
		while(keyIter.hasNext()) {
			int key = keyIter.next(); // auto unboxing : 객체 => 값
			System.out.println(key + " = " + map.get(key));
		}
		for(Integer key : map.keySet()) {
			String s = map.get(key);
			System.out.println(key + " = " + s);
		}
		System.out.println("------------------------------------------");
		
		// key 와 value 한 쌍을 엔트리(Map.Entry)라고 함
		// 엔트리 목록을 만들어서 연속 처리 => 출력 : 키 = 값
		Set<Map.Entry<Integer, String>> entries = map.entrySet();
		Iterator<Map.Entry<Integer, String>> entryIter = entries.iterator();
		while(entryIter.hasNext()) {
			Map.Entry<Integer, String> entry = entryIter.next();
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}
