package com.cognizant.AdapterPatternHandson;

public class MovableAdapterImpl implements MovableAdapter {

	private Movable luxuryCars;
	
	public MovableAdapterImpl(Movable luxuryCars)
	{
		this.luxuryCars = luxuryCars;
	}
	
	public double getSpeed() {
		
		
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}
	
	
	public double convertMPHtoKMPH(double mph)
	{
		return mph*1.60934;
	}
	
	
	public double getPrice()
	{
		return convertUSDtoEuro(luxuryCars.getPrice());
				
	}
	
	
	public double convertUSDtoEuro(double usdPrice)
	{
		return usdPrice*0.83;
	}

}
