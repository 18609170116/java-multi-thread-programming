package test.run;

import myservice.MyService;
import extthread.ThreadA;
import extthread.ThreadB;

public class Run2 {

	public static void main(String[] args) throws InterruptedException {

		MyService service = new MyService();

		ThreadA a = new ThreadA(service);
		a.setName("A");

		ThreadB b = new ThreadB(service);
		b.setName("B");

		a.start();
		b.start();
	}
}
