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
	
	@Test
	public void testSumaAvanzada1() {
		assertEquals(8, SumaAvanzada(4,3,1));
	}
	
	private int Suma(int i, int j) {
		return i+j;
	}
	
	
	private int SumaAvanzada(int i, int j, int k) {
		return Suma(Suma(i,j),k);
	}
}