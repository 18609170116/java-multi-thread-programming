package extthread;

import extlist.MyList;

public class ThreadB extends Thread {
	private Object lock;

	public ThreadB(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		try {
			synchronized (lock) {
				for (int i = 0; i < 10; i++) {
					MyList.add();
					if (MyList.size() == 5) {
						lock.notify();
						System.out.println("�ѷ���֪ͨ��");
					}
					System.out.println("�����" + (i + 1) + "��Ԫ��!");
					Thread.sleep(1000);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
