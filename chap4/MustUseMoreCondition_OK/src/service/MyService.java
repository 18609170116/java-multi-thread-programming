package service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	private Lock lock = new ReentrantLock();
	public Condition conditionA = lock.newCondition();
	public Condition conditionB = lock.newCondition();

	public void awaitA() {
		try {
			lock.lock();
			System.out.println("begin awaitAʱ��Ϊ" + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
			conditionA.await();
			System.out.println("  end awaitAʱ��Ϊ" + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void awaitB() {
		try {
			lock.lock();
			System.out.println("begin awaitBʱ��Ϊ" + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
			conditionB.await();
			System.out.println("  end awaitBʱ��Ϊ" + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void signalAll_A() {
		try {
			lock.lock();
			System.out.println("  signalAll_Aʱ��Ϊ" + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
			conditionA.signalAll();
		} finally {
			lock.unlock();
		}
	}

	public void signalAll_B() {
		try {
			lock.lock();
			System.out.println("  signalAll_Bʱ��Ϊ" + System.currentTimeMillis()
					+ " ThreadName=" + Thread.currentThread().getName());
			conditionB.signalAll();
		} finally {
			lock.unlock();
		}
	}
}
