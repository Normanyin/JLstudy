package com.geekle.threadException;

public class SubThread extends PThread {

	@Override
	void work() {
		throw new RuntimeException("throw runtimeException");
	}

}
