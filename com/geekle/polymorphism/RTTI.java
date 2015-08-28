package com.geekle.polymorphism;

class Useful {
	public void f() {}
	public void g() {}
}

class MoreUserful extends Useful {
	public void f() {}
	public void g() {}
	public void u() {}
	public void v() {}
	public void w() {}
}

public class RTTI {
	public static void main(String[] args) {
		Useful[] x = {new Useful(), new MoreUserful()};
		
		x[0].f();
		x[1].g();
		//x[1].u(); The method u() is undefined for the type Useful
		
		((MoreUserful)x[1]).u(); // Downcast/RTTI
		//((MoreUserful)x[0]).u(); // Useful cannot be cast to com.geekle.polymorphism.MoreUserful
		
	}
}
