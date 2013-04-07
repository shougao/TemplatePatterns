package com.shougao.study;

/**
 * 父类一共定义四个步骤，子类只能修改各个子类不同的部分。加调料和泡茶or煮咖啡
 * @author zhangqc
 *
 */
public class MakeTea extends CaffeineDrink{

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("make tea 子类泡茶");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("make tea 子类加作料");
	}

}
