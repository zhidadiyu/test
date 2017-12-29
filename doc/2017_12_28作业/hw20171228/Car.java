import java.util.*;
/*
1)在hw20171228类包中，编写一个车的抽象类，先定义车的简介方法summary()，
输出车的概要信息，再自由定义两个属性、两个方法；
定义一个小汽车的类和大卡车的类，
要求：a）继承车的抽象类,b）分别定义一个以上的属性和方法
2)接第1题，在小汽车类中，添加输出小洗车整体介绍信息方法，方法中，
除输出小洗车本类中的属性外，还要输出父类中的属性信息。
**/
//创建抽象类车;
public abstract  class Car{
	private String name;
	private int numver;
public abstract void function();
public Car(){
		System.out.println("小车");
	}
public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}

public void setNumver(int numver){
		this.numver = numver;
	}
	public int getNumver(){
		return this.numver;
	}

}

