package com.corejava.interfaces;

interface Member
{
	void callingBack(); // Allow to call Customer on Sales discounts
}
// Customer Class
class Customer implements Member
{
	String name;
	
	public Customer(String name) {
		this.name=name;
	}
	
	@Override
	public void callingBack() {
		System.out.println(name +" agree, You can call me for sales discount");
	}
}

class Store 
{
	Member mem[]= new Member[100];
	int count =0;
	
	void register(Member member)
	{
		mem[count++] = member;
	}
	
	
	void inviteSale()
	{
		for(int i=0;i<count;i++)
		{
			mem[i].callingBack();
		}
	}
	
}

//Main Class
public class CustomerStoreExample {

	public static void main(String[] args) {
		
		Store store = new Store();
		Customer c1 = new Customer("Shoda");
		Customer c2 = new Customer("Reddy");
		
		store.register(c1);
		store.register(c2);
		
		store.inviteSale();
		
	}

}
