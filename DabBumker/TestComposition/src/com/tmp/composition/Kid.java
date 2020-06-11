package com.tmp.composition;

import java.awt.List;

public class Kid extends Father<String> {

	int kidAge;
	String kidName;

	public Kid(int kidAge, String kidName) {
		super();
		this.kidAge = kidAge;
		this.kidName = kidName;
	}

	public int getKidAge() {
		return kidAge;
	}

	public void setKidAge(int kidAge) {
		this.kidAge = kidAge;
	}

	public String getKidName() {
		return kidName;
	}

	public void setKidName(String kidName) {
		this.kidName = kidName;
	}

}