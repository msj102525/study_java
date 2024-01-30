package test.list;

import java.util.ArrayList;
import java.util.HashSet;

public class TestArrayList {

	public static void main(String[] args) {
		// List 계열 ArrayList 사용 테스트
		ArrayList alist = new ArrayList();
		//List alist2 = new ArrayList();
		//Collection alist3 = new ArrayList();
		
		//객체만 저장함, 저장 순서가 유지됨, 저장 순번(index)이 부여됨
		alist.add(new String("java"));
		alist.add("oracle");   //auto boxing
		alist.add(123);		//auto boxing
		alist.add(45.6);	//auto boxing
		
		System.out.println(alist/* .toString() */);
		
		//저장 순번(index)가 있어서, 저장 객체 하나씩 취급할 수 있음 : get(index)
		for(int index = 0; index < alist.size(); index++) {
			System.out.println(index + " : " + alist.get(index));
		}
		
		//저장 위치에 대한 순번(index)가 있으므로 원하는 위치에 저장되게 할 수도 있음 : add(index, Element)
		alist.add(2, "javascript");  //기존의 객체들은 순번이 뒤로 하나씩 밀려남
		System.out.println(alist);
		
		//원하는 위치(index)의 저장된 객체정보도 변경할 수 있음 : set(index, Element)
		alist.set(2, new HashSet());
		System.out.println(alist);
		
		//중복 저장됨
		alist.add("java");
		System.out.println(alist);
		
		//저장된 객체정보를 연속으로 처리할 경우
		//for 문, for each 문, toArray(), iterator() 사용 가능함
		System.out.println("for each 사용 ----------------------------------");
		for(Object obj : alist) {
			System.out.println(obj);
		}
	}

}









