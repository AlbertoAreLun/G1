package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestResta {

	@Test
	public void testResta1() {
		assertEquals(3, Resta(5,2));
	}
	
	private int Resta(int i, int j) {
		return 5-2;
	}
}