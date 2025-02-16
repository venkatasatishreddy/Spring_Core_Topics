package com.spring.springCore.ref;

public class A {
	private int i;
	private B b;
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "A [i=" + i + ", b=" + b + "]";
	}
	
}
