package com.sample.taxi.vehicule;

public enum Taxi {
	RED(Efficiency.NORMAL), BLUE(Efficiency.HIGH);

	private enum Efficiency {
		NORMAL, HIGH
	};

	private final static double HIGH_EFFICIENCY_PERCENTAGE = 50;

	private final double efficiencyFactor;
	
	private Taxi(Efficiency efficiency) {
		efficiencyFactor = efficiency == Efficiency.NORMAL ? 1 : 1 + HIGH_EFFICIENCY_PERCENTAGE / 100;
	}

	public double getEfficiencyFactor() {
		return efficiencyFactor;
	}

	public String getColor() {
		return this.toString().toLowerCase();
	}
}