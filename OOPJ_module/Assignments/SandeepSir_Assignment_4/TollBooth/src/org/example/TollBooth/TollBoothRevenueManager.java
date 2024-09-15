package org.example.TollBooth;

public class TollBoothRevenueManager {
private int noOfCars;
private int noOfTrucks;
private int noOfMotorCycles;
private int rateOfCars;
private int rateOfTrucks;
private int rateOfMotoCycles;
private int totalRevenue;
public int getNoOfCars() {
	return noOfCars;
}
public void setNoOfCars(int noOfCars) {
	this.noOfCars = noOfCars;
}
public int getNoOfTrucks() {
	return noOfTrucks;
}
public void setNoOfTrucks(int noOfTrucks) {
	this.noOfTrucks = noOfTrucks;
}
public int getNoOfMotorCycles() {
	return noOfMotorCycles;
}
public void setNoOfMotorCycles(int noOfMotorCycles) {
	this.noOfMotorCycles = noOfMotorCycles;
}
public int getRateOfCars() {
	return rateOfCars;
}
public void setRateOfCars(int rateOfCars) {
	this.rateOfCars = rateOfCars;
}
public int getRateOfTrucks() {
	return rateOfTrucks;
}
public void setRateOfTrucks(int rateOfTrucks) {
	this.rateOfTrucks = rateOfTrucks;
}
public int getRateOfMotoCycles() {
	return rateOfMotoCycles;
}
public void setRateOfMotoCycles(int rateOfMotoCycles) {
	this.rateOfMotoCycles = rateOfMotoCycles;
}

public void calculateTotalRevenue() {
	this.totalRevenue = (this.noOfCars * this.rateOfCars) + (this.noOfMotorCycles * this.rateOfMotoCycles) + (this.noOfTrucks * this.rateOfTrucks); 
}

public String toString() {
	String str = Integer.toString(totalRevenue);
	return str;
}
}
