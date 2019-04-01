package com.evry.junit5.math;

public class ArithmeticOps {
	
	public int add(int a,int b) {
		return a+b;
	}

	public int sub(int a,int b) {
		return a-b;
	}
	
	public int mul(int a,int b) {
		return a*b;
	}
	
	public double sqr(double a,double b) {
		
		double pow = Math.pow(a, b);
		
		return pow;
	}
}
