package com.staticDemo;

class Car1 {
	private String model;
    static int totalCarSoldcount=0;
	
	{
		
		totalCarSoldcount++;
	
	}

	Car1() {

	}

	Car1(String model) {
		this.model = model;
	
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}

public class Car {
	
		
	public static void main(String[] args) {
		
		Car1 c1 = new Car1("Thor");
		Car1 c2 = new Car1("Maruti");
		Car1 c3= new Car1("Suzuki");
		Car1 c4= new Car1("BMW");
		Car1 c5= new Car1("Bolero");
		
		System.out.println("Total car sold :"+Car1.totalCarSoldcount);
		
		
		
	}

}
