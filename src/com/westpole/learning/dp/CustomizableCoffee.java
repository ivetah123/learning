package com.westpole.learning.dp;

public abstract class CustomizableCoffee implements Coffee {

	private Coffee coffee;

	public CustomizableCoffee(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public String getDescription() {
		return this.coffee.getDescription();
	}

	@Override
	public int getPrice() {
		return this.coffee.getPrice();
	}

}
