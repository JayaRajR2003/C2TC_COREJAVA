package com.tns.ifet.daysix.interfaces.functionalinterfaces;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		GreetClass g = new GreetClass();
		System.out.println(g.greet());

		//using Lambda Expression
		GreetInterface g1 = () -> {
			return "Good to See you Again!!!";
		};

		System.out.println(g1.greet());
	}

}
