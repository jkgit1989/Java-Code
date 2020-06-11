package com.thread.interrupt;

import java.util.concurrent.TimeUnit;

public class Main {

	public Main() {
		System.out.println("=============Bartender Application============");
	}

	public static void main(String[] args) throws InterruptedException {
		new Main();
		Thread bartenderthread = new Thread(new Bartender(), "Bartender: ");
		bartenderthread.start();
		TimeUnit.SECONDS.sleep(2);

		int numOfCustomer = 5;

		for (int i = 0; i < numOfCustomer; i++) {
			String customerName = "customer" + i;
			Customer customer = new Customer(bartenderthread, customerName, (int) (Math.random() * 10));
			new Thread(customer, customerName).start();
		}

	}
}
