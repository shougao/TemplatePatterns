package com.shougao.study;

public class MakeCoffee extends CaffeineDrink {

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("make coffee 子类泡咖啡");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("make coffee 子类加作料");
	}

}
