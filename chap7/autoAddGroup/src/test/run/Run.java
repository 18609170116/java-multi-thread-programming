package test.run;

public class Run {
	public static void main(String[] args) {
		System.out.println("A���̣߳�"+Thread.currentThread().getName()+" �����߳���������"+Thread.currentThread().getThreadGroup().activeGroupCount());
		ThreadGroup group=new ThreadGroup("�µ���");
		System.out.println("A���̣߳�"+Thread.currentThread().getName()+" �����߳���������"+Thread.currentThread().getThreadGroup().activeGroupCount());
		ThreadGroup[] threadGroup=new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadGroup);
		for (int i = 0; i < threadGroup.length; i++) {
			System.out.println("��һ���߳�������Ϊ��"+threadGroup[i].getName());
		}
	}
}
