package com.stuff;

public class Adapter extends Adaptee implements ITarget{

	@Override
	public String targets() {
		//将适配者转换成目标的类型
		//将适配者中的数据进行获取
		adaptees();
		//把石培哲中的数据进行处理，将石培哲中的数据的类型转变成相应目标方法中的数据
		System.out.println("转换为目标的类型");
		return null;
	}

}
