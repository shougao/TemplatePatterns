package com.shougao.study;

/**
 * 不同规则的实现类。
 * @author zhangqc
 *
 */
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
	/**
	 * 子类使用了后门，覆盖了父类的方法。
	 */
	@Override
	boolean hook(){
		return true;
	}

}
