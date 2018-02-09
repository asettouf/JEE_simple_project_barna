package org.test.jdbc_mysql;

import static org.junit.Assert.*;

import org.junit.Test;

public class DummyClassTest {

	@Test
	public void testAddition() {
		int res = DummyClass.addition(2, 3);
		assertEquals(5, res);
	}
	
}
