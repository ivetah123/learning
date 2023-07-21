package com.westpole.learning.dp;

public class WithSugar extends CustomizableCoffee {

	public WithSugar(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + "and sugar ";
	}

	@Override
	public int getPrice() {
		return super.getPrice() + 1;
	}

}
