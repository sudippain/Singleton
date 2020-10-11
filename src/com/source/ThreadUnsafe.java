package com.source;

public class ThreadUnsafe {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Singleton x = Singleton.getInstance();
				
			}
		});
		
Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Singleton z = Singleton.getInstance();
				
			}
		});

	t1.start();
	t2.start();
	}
}
