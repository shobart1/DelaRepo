package com.tdd.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DelaStackApplicationTestsTest {
	
	DelaStackModel s = new DelaStackModel(10);

	@Test
	void testDelaStackModel() {
		assertEquals (10, s.stack.length);
		
	}
	@Test
	void testPush() {
		s.push(45);
		s.push(5);
		s.push((6);
		s.display();
}
	
}