package testpackage;

public class MyThread extends Thread {
	@Override
	public void run() {
		try {
			this.stop();
		} catch (ThreadDeath e) {
			System.out.println("������catch()������");
			e.printStackTrace();
		}
	}
}
