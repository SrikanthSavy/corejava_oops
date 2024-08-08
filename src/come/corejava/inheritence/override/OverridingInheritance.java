package come.corejava.inheritence.override;

import javax.security.auth.Subject;

class Tv
{
	public void swtchOn() {System.out.println("TV- is Switched On!");}
	public void changeChannel() {System.out.println("TV- Channel Changed!");}
}

class SmartTv extends Tv
{
	@Override
	public void swtchOn() {System.out.println("Smart-TV- is Switched On!");}
	@Override
	public void changeChannel() {System.out.println("Smart-TV- Channel Changed!");}
	
	public void browse() {System.out.println("Browse SmartTV!");}
}

public class OverridingInheritance {

	public static void main(String[] args) {
		
		//direct call
		Tv tv = new Tv();
		tv.swtchOn();
		tv.changeChannel();
		
		
		//subclass class
		SmartTv smartTv = new SmartTv();
		smartTv.swtchOn();
		smartTv.changeChannel();
		smartTv.browse();
		
		//Dynamic method dispatch
		Tv tvRef= new SmartTv();  
		tvRef.swtchOn();      /// NOTE : Sub class Methods will be called 
		tvRef.changeChannel();/// NOTE : Sub class Methods will be called 
		// tvRef.browse()		// Error : Parent class cannot accese subclass
		
		
		

	}

}
