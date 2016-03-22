package com.song.simplefactory;

public class Client {
	public static void main(String[] args) {
		IProduct productA = Factory.produceProduct("A");
		productA.produce();
		IProduct productB = Factory.produceProduct("B");
		productB.produce();
	}
}
