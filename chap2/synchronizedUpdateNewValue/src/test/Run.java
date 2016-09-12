package test;

import service.Service;
import extthread.ThreadA;
import extthread.ThreadB;

public class Run {

	public static void main(String[] args) {
		try {
			Service service = new Service();

			ThreadA a = new ThreadA(service);
			a.start();

			Thread.sleep(1000);

			ThreadB b = new ThreadB(service);
			b.start();

			System.out.println("�Ѿ�����ֹͣ�������ˣ�");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
