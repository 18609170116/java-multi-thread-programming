package ext;

public class ThreadLocalExt extends ThreadLocal {
	@Override
	protected Object initialValue() {
		return "����Ĭ��ֵ ��һ��get����Ϊnull";
	}
}
