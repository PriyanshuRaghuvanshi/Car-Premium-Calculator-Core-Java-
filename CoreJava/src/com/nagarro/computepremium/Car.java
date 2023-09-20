package com.nagarro.computepremium;

public abstract class Car {
	protected double rate;
	public abstract void getRate();
	
	
	public double calculateBasicPremium(double cost)

	{
		return cost * rate;
	}
	public double calculatePremium(double cost)

	{    
           double temp =calculateBasicPremium(cost);
		   return temp+(0.20*temp);
	}
}
