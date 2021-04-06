package com.amdeus.creational.singleton;

public class MultithreadDemo implements Runnable {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thread object: " + Singleton.getInstance());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println("my thread interrupted");
		}

	}

}
