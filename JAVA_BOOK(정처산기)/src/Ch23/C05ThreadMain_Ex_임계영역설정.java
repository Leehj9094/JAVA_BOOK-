package Ch23;

class IncrementThread implements Runnable {
	private static int counter = 0; // 공유공간

	private static final Object lock = new Object();

	public int getCounter() { // counter getter
		return counter;
	}

	@Override
	public void run() {

		for (int i = 0; i < 100000; i++) {

			synchronized (lock) {
				// 작업내용
				counter++; // 공유변수값증가
				System.out.println(Thread.currentThread().getName() + "s counter : " + counter);

				try {
					if (i < 99999) {
						lock.notifyAll(); // 값 증가 후 스레드가 벗어나면서 다른 스레드에게 알려주는
						lock.wait(5); // 잠깐 대기하는
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
					break;
				}
			}
		}
	}

}

public class C05ThreadMain_Ex_임계영역설정 {

	public static void main(String[] args) throws InterruptedException {

		IncrementThread incrementThread1 = new IncrementThread();
		IncrementThread incrementThread2 = new IncrementThread();
		IncrementThread incrementThread3 = new IncrementThread();
		IncrementThread incrementThread4 = new IncrementThread();

		Thread thread1 = new Thread(incrementThread1);
		Thread thread2 = new Thread(incrementThread2);
		Thread thread3 = new Thread(incrementThread3);
		Thread thread4 = new Thread(incrementThread3);

		thread1.setName("TH1");
		thread2.setName("TH2");
		thread3.setName("TH3");
		thread4.setName("TH4");

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		// 메인 스레드가 thread1,thread2의 작업이 모두 완료될 때까지 대기하도록 설정
		thread1.join(); // join은 메인이 먼저 끝나지 않도록 도와주는
		thread2.join();
		thread3.join();
		thread4.join();

		System.out.println("Final value: " + incrementThread1.getCounter());

	}
}
