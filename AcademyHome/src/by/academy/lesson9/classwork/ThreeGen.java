package by.academy.lesson9.classwork;

import java.io.Serializable;

import by.academy.lesson1.homework.Animal;

public class ThreeGen<T extends Comparable<String>, V extends Animal & Serializable, K extends Number> {
	private T varT;
	private V varV;
	private K varK;

	public ThreeGen() {
		super();
	}

	public ThreeGen(T varT, V varV, K varK) {
		super();
		this.varT = varT;
		this.varV = varV;
		this.varK = varK;
	}

	public T getVarT() {
		return varT;
	}

	public void setVarT(T varT) {
		this.varT = varT;
	}

	public V getVarV() {
		return varV;
	}

	public void setVarV(V varV) {
		this.varV = varV;
	}

	public K getVarK() {
		return varK;
	}

	public void setVarK(K varK) {
		this.varK = varK;
	}

	public String getTName() {
		if (varT == null) {
			return null;
		}
		return varT.getClass().getName();

	}

	public String getVName() {
		if (varV == null) {
			return null;
		}
		return varV.getClass().getName();
	}

	public String getKName() {
		if (varK == null) {
			return null;
		}
		return varK.getClass().getName();
	}

	public static void main(String... args) {
		
		
	}
}