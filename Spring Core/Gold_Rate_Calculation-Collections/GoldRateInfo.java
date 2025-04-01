package com.spring.app;

import java.util.Map;

public class GoldRateInfo {

	private Map<Integer,Double>rateInfo;

	public Map<Integer, Double> getRateInfo() {
		return rateInfo;
	}

	public void setRateInfo(Map<Integer, Double> rateInfo) {
		this.rateInfo = rateInfo;
	}
	
	public double calculateGoldRate(int goldCarat, double grams) 
	{
		
		//fill the code
		if (rateInfo.containsKey(goldCarat)) {
			return grams * rateInfo.get(goldCarat);
		}else {
			throw new IllegalArgumentException("Invalid carat value entered. ");
		}
	}
}
