package com.corejava.interfaces;

//EXAMPLE: Showing Multiple Inheritence and Extenting a class ( All at once) 

class Phone // Parent Class
{
	public void call() {System.out.println("Phone- Making Call");}
	public void sms() {System.out.println("Phone-Sending SMS");}
}

//Define An Interface for MusicPlayer
interface IMusicPlayer
{
	void palymusic();
	void stopMusic();
}

//Define another Interface for Camera
interface ICamera
{
	void clickPhoto();
	void recordVideo();
}


// Implementing SmartPhone will all this features
class SmartPhone extends Phone implements ICamera,IMusicPlayer
{

	// custom method 
	public void videoCall() {System.out.println("SmartPhone Making a Video Call");}
	
	//Implmenet Icamera methods
	@Override
	public void clickPhoto() {
		System.out.println("Smart Phone Clicking a Photo!");
	}
	
	@Override
	public void recordVideo() {
		System.out.println("Smart Phone recording a Video!");
	}
	
	// Implement IMusiPlayer
	@Override
	public void palymusic() {
		System.out.println("Smart Phone Playing Music!");
	}
	@Override
	public void stopMusic() {
		System.out.println("SmartPhone Stop Playing Music!");
	}
	
}


public class SmartPhone_MainCLass {

	public static void main(String[] args) {
		//We  will de Dynamic Method Dispatch & RunTime Polymorphism
		
		SmartPhone sp = new SmartPhone();
		sp.call();  		//Phone- Making Call
		sp.sms();			//Phone-Sending SMS
		sp.palymusic();		//Smart Phone Playing Music!
		sp.stopMusic();		//SmartPhone Stop Playing Music!
		sp.clickPhoto();	//Smart Phone Clicking a Photo!
		sp.recordVideo();	//Smart Phone recording a Video!
		
		
		//Now Runtime Polymorphism i.e Same Object, with DIfferent Inteface References 
		Phone p = new SmartPhone();
		p.call();	//Phone- Making Call
		p.sms();	//Phone-Sending SMS
		
		ICamera iCameraPhone = new SmartPhone();
		iCameraPhone.clickPhoto();	//Smart Phone Clicking a Photo!
		iCameraPhone.recordVideo();	//Smart Phone recording a Video!
		
		IMusicPlayer iMusicPhone = new SmartPhone();
		iMusicPhone.palymusic(); //Smart Phone Playing Music!
		iMusicPhone.stopMusic(); //SmartPhone Stop Playing Music!
		
		
		

	}

}
