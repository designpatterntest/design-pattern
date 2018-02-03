package com.strategy.designpattern;

public class BankStrategy {

	private Bank bankImpl;

	public void setBankImpl(Bank bankImpl) {
		this.bankImpl = bankImpl;
	}

	public double calculateEmployeeInterest(double salary) {
		double result = bankImpl.applyInterest(salary);
		return result;
	}

}
