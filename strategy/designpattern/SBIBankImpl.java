package com.strategy.designpattern;

public class SBIBankImpl implements Bank {

	@Override
	public double applyInterest(double salary) {
		double interest = 0.0;
		if (salary < 30000) {
			interest = 09.00;
		} else {
			interest = 12.99;
		}
		return interest;
	}

}
