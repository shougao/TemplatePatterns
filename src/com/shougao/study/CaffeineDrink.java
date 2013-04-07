package com.shougao.study;

/**
 * 规则的定义类
 * @author zhangqc
 *
 */
public abstract class CaffeineDrink {

	/**
	 * 这里定义了步骤，并且步骤不允许改变所以是final的。
	 * 这个就是模板步骤。
	 */
	final void prepare(){
		boilWater();
		brew();//沏水
		pourInCup();
		if(hook()){
			addCondiments();//添加调料
		}else{
			System.out.println("不加调料");
		}
	}
	void boilWater(){
		System.out.println("==父类烧水==");
	}
	abstract void brew();
	void pourInCup(){
		System.out.println("父类把水倒进杯子里");
	}
	abstract void addCondiments();
	/**
	 * 添加了后门，子类可以用也可以不用，子类自己决定所以是子类后门。
	 * 如果子类没有覆盖，默认父类不加调料
	 */
	boolean hook(){
		return false;
	}
	/**
	 * 经典的模板模式的模板过程定义before, execte, after.
	 public abstract void executeMain();  
     
	    public void execute() {  
	        beforeAction();  
	        executeMain();  
	        afterAction();  
	    } 
	 */
}
