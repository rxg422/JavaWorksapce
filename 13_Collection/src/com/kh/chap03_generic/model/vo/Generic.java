package com.kh.chap03_generic.model.vo;

public class Generic<T, G> {
	T t;
	G g;

	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}

	public G getG() {
		return g;
	}

	public void setG(G g) {
		this.g = g;
	}
	
	public static <V> void printTest(V item) {
		System.out.println(item);
	}
	
}
