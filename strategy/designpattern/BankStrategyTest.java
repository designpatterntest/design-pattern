package com.strategy.designpattern;

public class BankStrategyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankStrategy obj = new BankStrategy();
		obj.setBankImpl(new ICICIBankImpl());
		double interest = obj.calculateEmployeeInterest(30000);
		System.out.println("Interest For This Employee:" + interest);
	}

}
