package test.run;

import test.MyObject;
import extthread.MyThread;

public class Run {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();

		t1.start();
		t2.start();
		t3.start();

		// �˰汾������Ȼ����ȷ��
		// ��public static MyObject getInstance()����
		// �е�ȫ�����붼��ͬ�����ˣ�����������Ч��
	}

}
