package test.thread1;

public class TestThread {

	public static void main(String[] args) {
		// multi thread test
		// Thread를 상속받은 경우
//		Thread t1 = new MyThread1();
//		Thread t2 = new MyThread2();
		
		// Runnable 을 상속받은 경우
//		Runnable r1 = new MyThread1();
//		Runnable r2 = new MyThread2();
//		
//		Thread t1 = new Thread(r1);
//		Thread t2 = new Thread(r2);
		
		Thread t1 = new Thread(new MyThread1());
		Thread t2 = new Thread(new MyThread2());
		
		// 스레드의 우선순위 확인 : 1부터 10까지 정수로 지정되어 있음
//		System.out.println(t1.getPriority()); // 5
//		System.out.println(t1.getPriority()); // 5
		
		// 우선 순위 변경 가능함
//		t1.setPriority(Thread.MIN_PRIORITY); // 값 지정시 상수 필드 이용해도 됨
//		t2.setPriority(10); // 정수 사용해도 됨
		
		t1.start();
		t2.start();
	}

}
