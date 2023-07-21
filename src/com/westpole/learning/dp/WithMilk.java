package com.westpole.learning.dp;

public class WithMilk extends CustomizableCoffee {

	public WithMilk(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + "with milk ";
	}

	@Override
	public int getPrice() {
		return super.getPrice() + 2;
	}

}
