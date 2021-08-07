package by.academy.lesson11.classwork;

import java.util.ArrayList;

public class HeavyBox {
	int weight;
	int widht;
	int height;
	int depth;
	
	HeavyBox(int w,int h,int d,int m) {
		weight=m;
		widht=w;
		height=h;
		depth=d;
		
		}

	ArrayList<String> arrayList = new ArrayList<>();
	ArrayList<String> arrayListLarge = new ArrayList<>(4);

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWidht() {
		return widht;
	}

	public void setWidht(int widht) {
		this.widht = widht;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	
}
