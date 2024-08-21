package com.corejava.statics.staticmembers;

class HondaCity
{
	static long price =10;
	int a=5,b=10;
	
	static double onRoadPrice(String city)
	{
		switch (city) {
		case "delhi": {
			// a+b ;  Not allowed 
 			return price*(price*0.1);
			}
		case "hyderabad": {
			return price*(price*0.15);
			}
		default : {
			return price;
		}
		
		}
	}
}

public class StaticPractice {

	public static void main(String[] args) {
		
		HondaCity h1 = new HondaCity();
		HondaCity h2 = new HondaCity();
		
		System.out.println("H1.price="+h1.price);
		System.out.println("H2.price="+h2.price);
		System.out.println("Hyd OnRoad="+h2.onRoadPrice("hyderabad"));
		
		h2.price =11;
		
		System.out.println("H1.price now="+h1.price);
		System.out.println("H2.price now ="+h2.price);

		System.out.println("Directly accessing HondaCity.price ="+HondaCity.price);

	}

}
