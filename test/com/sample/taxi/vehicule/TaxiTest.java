package com.sample.taxi.vehicule;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TaxiTest {
	private static final double DOUBLE_DELTA = 1e-9;
	
	@Test
	public void blueTaxi50PercentMoreEfficientThanRed() {
		assertEquals(Taxi.BLUE.getEfficiencyFactor(), Taxi.RED.getEfficiencyFactor() * 1.5, DOUBLE_DELTA);
	}
}
