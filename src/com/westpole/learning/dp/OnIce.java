package com.westpole.learning.dp;

public class OnIce extends CustomizableCoffee {

	public OnIce(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + "on ice ";
	}

	@Override
	public int getPrice() {
		return super.getPrice() + 3;
	}

}
