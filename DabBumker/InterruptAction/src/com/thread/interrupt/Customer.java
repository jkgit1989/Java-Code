package com.thread.interrupt;

import java.util.concurrent.TimeUnit;

public class Customer implements Runnable {

	Thread bartender;
	String name;
	int timeout;

	public Customer(Thread bartenderthread, String customerName, int i) {

		this.bartender = bartenderthread;
		this.name = customerName;
		this.timeout = i;
	}

	@Override
	public void run() {

		System.out.println(name + ": Doesn't seem to be anyone around. I will wait a moment.");
		try {
			TimeUnit.SECONDS.sleep(timeout);
		} catch (InterruptedException e) {
			// This can be ignored because customer is not getting interrupted.
		}

		System.out.println(name + ": Oh there's a bell! Can I get some service around here.");
		bartender.interrupt();
	}

}
