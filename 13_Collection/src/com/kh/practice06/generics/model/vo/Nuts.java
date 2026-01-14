package com.kh.practice06.generics.model.vo;

import java.util.Objects;

public class Nuts extends Farm {

	private String name;
	
	public Nuts() {
		// TODO Auto-generated constructor stub
	}

	public Nuts(String kind, String name) {
		super(kind);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Nuts [name=" + name + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nuts other = (Nuts) obj;
		return Objects.equals(name, other.name);
	}
	
}
