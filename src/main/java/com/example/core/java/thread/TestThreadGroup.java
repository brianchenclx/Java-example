package com.example.core.java.thread;

/**
 * @author clx
 */
public class TestThreadGroup {

	public static void main(String[] args) {
		System.out.println("main() thread group:" + Thread.currentThread().getThreadGroup().getName());
		System.out.println("main() thread name:" + Thread.currentThread().getName());

		Thread testThread = new Thread(() -> {
			System.out.println("test thread group:" + Thread.currentThread().getThreadGroup().getName());
			System.out.println("test thread name:" + Thread.currentThread().getName());
		});
		testThread.start();


		ThreadGroup threadGroup = new ThreadGroup("tg");
		threadGroup.setMaxPriority(7);
		Thread t = new Thread(threadGroup, "t");
		t.setPriority(9);
		System.out.println("thread priority:" + t.getPriority());
	}
}
