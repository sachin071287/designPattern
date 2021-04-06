package com.amdeus.creational.singleton;

public class Singleton implements Cloneable {

	private static Singleton obj;

	private Singleton() {
	}

	public static Singleton getInstance() {
		//if (obj == null) {
			//synchronized (Singleton.class) {
				if (obj == null) {
					obj = new Singleton();
				}
			//}
		//}
		return obj;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();
		return obj;
	}

}
