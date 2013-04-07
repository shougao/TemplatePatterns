package com.shougao.study;

public abstract class CaffeineDrink {

	/**
	 * 这里定义了步骤，并且步骤不允许改变所以是final的。
	 * 这个就是模板步骤。
	 */
	final void prepare(){
		boilWater();
		brew();//沏水
		pourInCup();
		addCondiments();//添加调料
	}
	void boilWater(){
		System.out.println("父类烧水");
	}
	abstract void brew();
	void pourInCup(){
		System.out.println("父类把水倒进杯子里");
	}
	abstract void addCondiments();
	
}
