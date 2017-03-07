package com.cobus.prototype;

public abstract class Pizza implements Cloneable {
	public Object clone() {
		try {
			Pizza copy = (Pizza) super.clone();

			return copy;

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public abstract void printName();
}
