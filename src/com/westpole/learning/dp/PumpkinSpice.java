package com.westpole.learning.dp;

public class PumpkinSpice extends CustomizableCoffee {

	public PumpkinSpice(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + "Pumpkin late ";
	}

	@Override
	public int getPrice() {
		return super.getPrice() + 5;
	}

}
