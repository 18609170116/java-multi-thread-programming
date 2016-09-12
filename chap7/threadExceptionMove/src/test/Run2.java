package test;

import test.extUncaughtExceptionHandler.ObjectUncaughtExceptionHandler;
import test.extUncaughtExceptionHandler.StateUncaughtExceptionHandler;
import extthread.MyThread;
import extthreadgroup.MyThreadGroup;

public class Run2 {

	public static void main(String[] args) {
		MyThreadGroup group = new MyThreadGroup("我的线程组");
		MyThread myThread = new MyThread(group, "我的线程");
		// 对象
		// myThread
		// .setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
		// 类
		// MyThread
		// .setDefaultUncaughtExceptionHandler(new
		// StateUncaughtExceptionHandler());
		myThread.start();

	}
}
