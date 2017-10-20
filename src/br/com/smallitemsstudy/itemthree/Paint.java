package br.com.smallitemsstudy.itemthree;


/**
 * Atributos e metodos da classes nao revelam sua verdadeira intencao.
 * 
 * The passing test is the starting point. It is unsatisfying at this point because the code in the test
 * doesn't tell us what it is doing. Let's rewrite the test to reflect the way we would like to use the
 * Paint objects if we were writing a client application. Initially, this test will fail. In fact, it won't even
 * compile. We are writing it to explore the interface design of the Paint object from the client
 * developer's point of view.
 * */
public class Paint {
	
	private double v;
	private int r;
	private int y;
	private int b;
	
	/**
	 * The only way to even guess what the paint(Paint) method does is to read the code.
	 * */
	public void paint(final Paint paint) {
		v = v + paint.getV();
	}

	public double getV() {
		return v;
	}

	public int getR() {
		return r;
	}

	public int getY() {
		return y;
	}

	public int getB() {
		return b;
	}
}
