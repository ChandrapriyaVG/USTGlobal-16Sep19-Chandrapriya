package com.ust_global.objectclass;

public class Car {
	String brand;
	String color;
	int cost;
	public Car(String brand, String color, int cost) {
		super();
		this.brand = brand;
		this.color = color;
		this.cost = cost;
	}
	
	@Override
	public int hashCode() {
		return cost;
		
	}
	
	@Override
	public String toString() {
		return brand+" car of color "+color+" costs "+cost;
	}
}
