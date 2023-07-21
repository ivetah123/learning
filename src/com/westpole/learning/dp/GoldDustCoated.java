package com.westpole.learning.dp;

public class GoldDustCoated extends CustomizableCoffee {

	public GoldDustCoated(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + "and gold dust ";
	}

	@Override
	public int getPrice() {
		return super.getPrice() + 100;
	}

}
