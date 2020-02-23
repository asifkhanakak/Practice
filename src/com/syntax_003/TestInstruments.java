package com.syntax_003;

public class TestInstruments {

	public static void main(String[] args) {

		Piano obj1 = new Flute();
		Instrument obj2 = new Flute();
		Guitar obj3 = new Guitar();

		obj1.play1();
		obj2.play();
		obj3.play();

		obj3.dispArray();

	}
}