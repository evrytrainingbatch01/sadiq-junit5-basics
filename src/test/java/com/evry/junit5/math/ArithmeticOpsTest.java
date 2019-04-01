package com.evry.junit5.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author sadiq.ahamad
 *
 */
class ArithmeticOpsTest {

	ArithmeticOps ops = new ArithmeticOps();
	@Test
	void testAdd() {
		int exp = 5;
		int actual=ops.add(3, 2);
		
		assertEquals(exp, actual);
		
	}
	
	@Test
	void testSub() {
		int exp = 10;
		int actual=ops.sub(20, 10);
		
		assertEquals(exp, actual);
	}
	
	
	@Test
	void testMul() {
		int exp = 10;
		int actual=ops.mul(2, 5);
		
		assertEquals(exp, actual);
	}
	
	@Test
	void testPow() {
		double expected = 8;
		double actual = ops.sqr(2, 3);
		
		assertEquals(expected, actual);
	}
	
	

}
