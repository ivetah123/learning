package com.westpole.learning.dp;

public class Venti extends CustomizableCoffee {

	public Venti(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + "venti ";
	}

	@Override
	public int getPrice() {
		return super.getPrice() + 2;
	}

}
