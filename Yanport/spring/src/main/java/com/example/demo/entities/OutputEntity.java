package com.example.demo.entities;

import com.example.demo.enums.OrientationEnum;

public class OutputEntity {

	public int x;
	public int y;
	public String error;
	public OrientationEnum orientation ;
	public OutputEntity(int x, int y, OrientationEnum orientation) {
		super();
		this.x = x;
		this.y = y;
		this.orientation = orientation;
	}
	public OutputEntity(String error) {
		super();
		this.error = error;
	}
	
	
}
