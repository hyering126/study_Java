package package_10;

public class PrintThread extends Thread {
	public void run() {
		try {
			while (true) {
				System.out.println("실행 중");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
		}
		System.out.println("리소스 정리");
		System.out.println("싫행 종료");
	}
}
