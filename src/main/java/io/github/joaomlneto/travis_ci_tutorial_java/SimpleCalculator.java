package io.github.joaomlneto.travis_ci_tutorial_java;

public class SimpleCalculator {
<<<<<<< MINE
	public int mul2(int a, int b) {
		return a * b;
	}
======= 
	public int mulIntegers(int a, int b) {
		return a * b;
	}
>>>>>>> YOURS

	public void hello() {

	}
	public int addIntegers(int a, int b) {
		return a + b;
	}
	public int subIntegers(int a, int b) {
		return a - b;
	}
	public int divIntegers(int a, int b) {
		return a / b;
	}
	public static final void main(String[] args) {
		System.out.println("Hello world?");
	}
}