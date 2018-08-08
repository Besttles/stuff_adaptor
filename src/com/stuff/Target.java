package com.stuff;

public class Target implements ITarget {

	@Override
	public String targets() {
		System.out.println("目标方法");
		return null;
	}

}
