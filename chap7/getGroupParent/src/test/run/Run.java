package test.run;

public class Run {

	public static void main(String[] args) {
		System.out.println("�̣߳�" + Thread.currentThread().getName()
				+ " ���ڵ��߳�����Ϊ��"
				+ Thread.currentThread().getThreadGroup().getName());
		System.out
				.println("main�߳����ڵ��߳���ĸ��߳���������ǣ�"
						+ Thread.currentThread().getThreadGroup().getParent()
								.getName());
		System.out.println("main�߳����ڵ��߳���ĸ��߳���ĸ��߳���������ǣ�"
				+ Thread.currentThread().getThreadGroup().getParent()
						.getParent().getName());
	}

}
