package test;

import extthread.MyThread;

public class Test {

	public static void main(String[] args) {

		MyThread threadTest = new MyThread();
		threadTest.start();

		// Thread.sleep(?)
		System.out.println("���뵱threadTest����ִ����Ϻ�����ִ��");
		System.out.println("����������е�sleep()�е�ֵӦ��д�����أ�");
		System.out.println("���ǣ����ݲ���ȷ��:)");
	}

}
