package edu.bit.ex;

public class Rec {
	private int width, height;
	
	public Rec() {
		
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getArea() {
		return width*height;
	}
	
	
}
