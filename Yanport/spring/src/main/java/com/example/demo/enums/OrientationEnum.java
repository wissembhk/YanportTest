package com.example.demo.enums;

public enum OrientationEnum {
	N,E,S,O;
	static 
    public final OrientationEnum[] values = values();

    public OrientationEnum prev() {
        return values[(ordinal() - 1  + values.length) % values.length];
    }

    public OrientationEnum next() {
        return values[(ordinal() + 1) % values.length];
    }
}
