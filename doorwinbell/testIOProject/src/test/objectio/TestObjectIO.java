package test.objectio;

public class TestObjectIO {

	public static void main(String[] args) {
		// 객체를 파일에 저장하는 객체입출력 스트림 사용 테스트
		Member[] array = new Member[] {
				new Member("문승종1", 25, '남', "msj1@test.org","010-1111", 100.1),
				new Member("문승종2", 26, '여', "msj2@test.org","010-2222", 100.2),
				new Member("문승종3", 27, '남', "msj3@test.org","010-3333", 100.3)
		};
		
		MemberManager manager = new MemberManager(array);
		
//		manager.fileSave();
		manager.fileRead();

	}

}
