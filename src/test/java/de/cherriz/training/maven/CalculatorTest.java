package de.cherriz.training.maven;

//import org.junit.Assert;
//import org.junit.Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

	@Test
	public void testSum() {
		Calculator calculator = new Calculator();
		assertEquals(4, calculator.sum(2, 2));

	}

	@Test
	public void testMinus() {
		Calculator calculator = new Calculator();
		assertEquals(0, calculator.minus(2, 2));
	}

	@Test
	public void testDivide() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.divide(6, 3));
	}
}