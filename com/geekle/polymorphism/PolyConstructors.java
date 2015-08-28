package com.geekle.polymorphism;

class Glyph {
	void draw() {
		System.out.println("Glyph.draw()");
	}
	
	public Glyph() {
		System.out.println("Glyph() before draw()");
		draw();//该方法被覆盖
		System.out.println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;
	RoundGlyph(int r) {
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph().radius = " + radius);
	}
	
	void draw() {
		System.out.println("RoundGlyph.draw().radius = " + radius);//先于构造器之前被调用，此时radius = 0
	}
}

public class PolyConstructors {
	public static void main(String[] args) {
		new RoundGlyph(5);
	}
}
