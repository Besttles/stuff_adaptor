package com.stuff;

public class Adaptee implements IAdaptee {

	@Override
	public String adaptees() {
		System.out.println("适配者");
        return null;
	}

}
