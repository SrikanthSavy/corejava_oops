package com.corejava.abstractclasses;
//Example : Hospital

abstract class Hospital{ // Abstract class defination 
	
	abstract void emergency();
	abstract void appointment();
	abstract boolean admit();
	abstract void billing();
}

// concreate class
class PrivateHospital extends Hospital{
	
	String name;
	PrivateHospital()
	{
		
		this.name= "Shoda Hospital";
		System.out.println("Concreate Private Hosiptal instance created: name="+this.name);
	}

	@Override
	void emergency() {
		System.out.println("Emergency Implemented!");
		
	}

	@Override
	void appointment() {
		System.out.println("Appointment Implemented!");
		
	}

	@Override
	boolean admit() {
		System.out.println("Admit Implemented!");
		return true;
	}

	@Override
	void billing() {
		System.out.println("Billing Implemented!");
		
	}
	
}

// Main class 
public class AbsstractExampleHospital{

	public static void main(String[] args) {
		
		//XXXXXXXX  Hospital hospital = new Hospital();// Not Allowed , Abstract class cannot be instantiated
		Hospital hospital = new PrivateHospital();
		
		hospital.admit();
		hospital.appointment();
		hospital.emergency();
		hospital.billing();

	}

}
