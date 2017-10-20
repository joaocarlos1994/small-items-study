package br.com.smallitemsstudy.itemthree;

/**
 * Atributos e metodos ja revelam sua verdadeira intencao.
 * 
 * The new method name may not tell the reader everything about the effect of "mixing in" another
 * Paint (for that we'll need ASSERTIONS , coming up in a few pages). But it will clue the reader in
 * enough to get started using the class, especially with the example the test provides. And it will
 * allow the reader of the client code to interpret the client's intent. In the next few examples in this
 * chapter, we'll refactor this class again to make it even clearer.
 * 
 * Entire subdomains can be carved off into separate modules and encapsulated behind INTENTION-
 * REVEALING INTERFACES . Using such whittling to focus a project and manage the complexity of a
 * large system will be discussed more in Chapter 15, "Distillation," with COHESIVE MECHANISMS and
 * GENERIC SUBDOMAINS .
 * 
 * But in the next two patterns, we'll set out to make the consequences of using a method very
 * predictable. Complex logic can be done safely in SIDE-EFFECT-FREE FUNCTIONS . Methods that change
 * system state can be characterized with ASSERTIONS .
 * */
public class PaintTwo {
	
	private double volume;
	private int red;
	private int yellow;
	private int blue;
	
	public void maxIn(final PaintTwo paintTwo) {
		volume = volume + paintTwo.getVolume();
	}

	public double getVolume() {
		return volume;
	}

	public int getRed() {
		return red;
	}

	public int getYellow() {
		return yellow;
	}

	public int getBlue() {
		return blue;
	}
}
