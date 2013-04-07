package com.shougao.study;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakeTea myMakeTea = new MakeTea();
		myMakeTea.boilWater();
		myMakeTea.brew();
		myMakeTea.pourInCup();
		myMakeTea.addCondiments();
		
		
		MakeCoffee myMakeCoffee = new MakeCoffee();
		myMakeCoffee.boilWater();
		myMakeCoffee.brew();
		myMakeCoffee.pourInCup();
		myMakeCoffee.addCondiments();
	}

}
