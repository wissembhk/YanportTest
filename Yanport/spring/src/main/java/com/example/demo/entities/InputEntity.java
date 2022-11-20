package com.example.demo.entities;

import com.example.demo.enums.OrientationEnum;

public class InputEntity {
	private int x;
	private int y ;
	private int initialX ;
	private int initialY ;
	private OrientationEnum orientation ;
	private String instructions ;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getInitialX() {
		return initialX;
	}
	public void setInitialX(int initialX) {
		this.initialX = initialX;
	}
	public int getInitialY() {
		return initialY;
	}
	public void setInitialY(int initialY) {
		this.initialY = initialY;
	}
	public OrientationEnum getOrientation() {
		return orientation;
	}
	public void setOrientation(OrientationEnum orientation) {
		this.orientation = orientation;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	public InputEntity(int x, int y, int initialX, int initialY, OrientationEnum orientation, String instructions) {
		super();
		this.x = x;
		this.y = y;
		this.initialX = initialX;
		this.initialY = initialY;
		this.orientation = orientation;
		this.instructions = instructions;
	}

}


