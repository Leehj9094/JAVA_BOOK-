package Ch23;

public class C02Worker1 implements Runnable{

	@Override					// 스레드로 동작하기 위한 run
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("TASK01...");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}	
}
