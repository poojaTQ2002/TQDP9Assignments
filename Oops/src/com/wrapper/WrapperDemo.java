package com.wrapper;

public class WrapperDemo {

	public static void main(String[] args) {

		// Boxing:
		// primitive to wrapper

		int num = 23;

		Integer i1 = new Integer(45);
		Integer i2 = 78;

		Integer j = Integer.valueOf(num);

		// auto
		Integer k = num;

		System.out.println(i1 + " " + i2 + " " + j + " " + k);

		// Unboxing
		// wrapper to primtive

		Float f1 = new Float(78.3f);

		float f2 = f1.floatValue();

		// auto
		float f3 = f1;

		System.out.println(f1 + " " + f2 + " " + f3);

	}

}

