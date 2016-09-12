package test;

public class MyObject {

	private static MyObject myObject;

	private MyObject() {
	}

	public static MyObject getInstance() {
		try {
			// ����д����ͬ�ڣ�
			// synchronized public static MyObject getInstance()
			// ��д����Ч��һ���ܵͣ�ȫ�����뱻����
			synchronized (MyObject.class) {
				if (myObject != null) {
				} else {
					// ģ���ڴ�������֮ǰ��һЩ׼���ԵĹ���
					Thread.sleep(3000);

					myObject = new MyObject();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}

}
