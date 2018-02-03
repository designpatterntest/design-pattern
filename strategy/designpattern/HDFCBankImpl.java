package com.strategy.designpattern;

public class HDFCBankImpl implements Bank {

	@Override
	public double applyInterest(double salary) {
		double interest = 0;
		if (salary < 30000) {
			interest = 10.00;
		} else {
			interest = 12.55;
		}
		return interest;
	}

}
