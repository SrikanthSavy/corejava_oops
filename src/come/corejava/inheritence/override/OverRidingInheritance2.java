package come.corejava.inheritence.override;

class ManualCar
{
	public void start() {System.out.println("Car Started!");	}
	public void accelerate() {System.out.println("Car Accelerated!");}
	public void changeGear() {System.out.println("Car Manual Gear Changed!");}
}

class AutomaticCar extends ManualCar
{	
	@Override
	public void changeGear() {System.out.println("Automatic gear !");	}
	public void openRoof() {System.out.println("Open Roof!");}
}


public class OverRidingInheritance2 {

	public static void main(String[] args) {
		
		ManualCar mCar = new ManualCar();
		mCar.start();
		mCar.accelerate();
		mCar.changeGear();
		
		
		System.out.println("=============SUB Class==================");
		AutomaticCar aCar= new AutomaticCar();
		aCar.start();
		aCar.accelerate();
		aCar.changeGear(); // OverRide super classs method()
		aCar.openRoof();
		
		System.out.println("=============Testing Dynamic Method Dispatch==================");
		ManualCar car = new AutomaticCar();
		car.start();
		car.accelerate();
		car.changeGear(); // OverRide -- Sub-class method will be invoked
		//aCar.openRoof(); // NOT allowed 
		
	}

}
