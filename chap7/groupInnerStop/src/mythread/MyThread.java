package mythread;

public class MyThread extends Thread {

	public MyThread(ThreadGroup group, String name) {
		super(group, name);
	}

	@Override
	public void run() {
		System.out.println("ThreadName=" + Thread.currentThread().getName()
				+ "׼����ʼ��ѭ���ˣ�)");
		while (!this.isInterrupted()) {
		}
		System.out.println("ThreadName=" + Thread.currentThread().getName()
				+ "�����ˣ�)");
	}

}
