package com.LabAssignments;
class Pen
{
	
	private int capLength;
	private String brand;
	private Refill rifill;
	public Pen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pen(int capLength, String brand, Refill rifill) {
		super();
		this.capLength = capLength;
		this.brand = brand;
		this.rifill = rifill;
	}
	public int getCapLength() {
		return capLength;
	}
	public void setCapLength(int capLength) {
		this.capLength = capLength;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Refill getRifill() {
		return rifill;
	}
	public void setRifill(Refill rifill) {
		this.rifill = rifill;
	}
	@Override
	public String toString() {
		return "Pen [capLength=" + capLength + ", brand=" + brand + ", rifill=" + rifill + "]";
	}
	
}	
	

