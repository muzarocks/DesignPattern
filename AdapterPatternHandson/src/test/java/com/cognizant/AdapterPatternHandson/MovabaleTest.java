package com.cognizant.AdapterPatternHandson;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MovabaleTest {

//	@Test
//	public void test() {
//		// fail("Not yet implemented");
//	}

	@Test
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
	}

	
	@Test
	public void whenConvertingUSDToEuro()
	{
		
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		assertEquals(bugattiVeyronAdapter.getPrice(), 2.407, 0.00001);
	}
	
	
}
