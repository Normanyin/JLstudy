//协变返回类型
package com.geekle.polymorphism;

class Grain {
	public String toString() {
		return "Grain";
	}
}

class Wheat extends Grain {
	public String toString() {
		return "Wheat";
	}
}

class Mill {
	Grain process() {
		return new Grain();
	}
}

class WheatMill extends Mill{
	Wheat process() {
		return new Wheat();
	}
}

public class CovariantReturn {
	public static void main(String[] args) {
		Mill mill = new Mill();
		Grain g = mill.process();
		System.out.println(g);
		
		mill = new WheatMill();
		g = mill.process();
		System.out.println(g);//返回更加具体的Wheat类型
	}
}
