package com.song.simplefactory;

public class Factory {
	public static IProduct produceProduct(String param){
		IProduct product = null;
		if("A".equals(param)){
			product = new ProductA();
		}else if("B".equals(param)){
			product = new ProductB();
		}
		
		return product;
	}
}
