package com.strategy.designpattern;

public class ICICIBankImpl implements Bank {

	public double applyInterest(double salary) {
		double interest = 0;
		if (salary < 30000) {
			interest = 08.00;
		} else {
			interest = 13.99;
		}
		return interest;
	}

}
