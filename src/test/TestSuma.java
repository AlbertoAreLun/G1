package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSuma {

	@Test
	public void testSuma1() {
		assertEquals(4, Suma(1,3));
	}

	@Test
	public void testSuma2() {
		assertEquals(5, Suma(3,2));
	}
	
	private int Suma(int i, int j) {
		return i+j;
	}
	
	private int Suma3Num(int i, int j, int k) {
		return i+j-k;
	}
}