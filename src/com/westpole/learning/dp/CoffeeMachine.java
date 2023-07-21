package com.westpole.learning.dp;

public class CoffeeMachine {

	public static void main(String[] args) {
		Coffee coffee = new OnIce(new WithSugar(new WithMilk(new CoffeeSimple())));

		System.out.println(coffee.getDescription() + ": " + coffee.getPrice());

		Coffee coffee2 = new WithSugar(new WithMilk(new CoffeeSimple()));

		System.out.println(coffee2.getDescription() + ": " + coffee2.getPrice());

		Coffee coffee3 = new PumpkinSpice(new WithSugar(new WithMilk(new CoffeeSimple())));

		System.out.println(coffee3.getDescription() + ": " + coffee3.getPrice());

		Coffee coffee4 = new GoldDustCoated(new WithSugar(new WithMilk(new CoffeeSimple())));

		System.out.println(coffee4.getDescription() + ": " + coffee4.getPrice());

		Coffee coffee5 = new Venti(new GoldDustCoated(new WithSugar(new WithMilk(new CoffeeSimple()))));

		System.out.println(coffee5.getDescription() + ": " + coffee5.getPrice());
	}

}
