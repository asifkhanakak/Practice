package com.syntax_003;

public abstract class Instrument {

	public abstract void play();

	public abstract void dispArray();

}

 abstract class Piano extends Instrument {

	public void play1() {
		System.out.println("Piano is playing  tan tan tan tan ");
	}
}

class Flute extends Piano {

	public void dispArray() {
		String[] instrumentArray = new String[10];
		instrumentArray[0] = "Piano";
		instrumentArray[1] = "Flute";
		instrumentArray[2] = "Guitar";
		instrumentArray[3] = "rabab";
		instrumentArray[4] = "Trumpet";
		instrumentArray[5] = "Trombone";
		instrumentArray[6] = "Tuba";
		instrumentArray[7] = "French horn";
		instrumentArray[8] = "Cornet";
		instrumentArray[9] = "Drums";

		for (String arrVal : instrumentArray) {
			System.out.print(arrVal + ", ");
		}
	}

	public void play() {
		System.out.println("Flute is playing  toot toot toot toot ");
	}
}

class Guitar extends Flute {

	public void play() {
		System.out.println("Guitar is playing  tin  tin  tin");
	}

}
