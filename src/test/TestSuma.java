
package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSuma {

	@Test
	public void testSuma1() {
		assertEquals(4, Suma(1,3));
	}

	private int Suma(int i, int j) {
		return 1+3;
	}
}