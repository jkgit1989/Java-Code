package com.thread.interrupt;

import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;

public class Bartender implements Runnable {

	@Override
	public void run() {
		System.out.println("Bartender : My boss isn't in today; time for a quick snooz!");

		while (true) {
			if (Thread.interrupted()) {
				System.out.println("Bartender : Is someone on the reception !?");
			}

			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (Exception e) {
				Thread.currentThread().interrupt();
			}
		}

	}
}
