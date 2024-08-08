package come.corejava.polymorphism.overloading;
//Note Inheritance

class FindMaxno
{
	public int max(int x, int y)
	{
		return x>y?x:y;
	}
	
	public int max(int x, int y , int z)
	{
		if(x>y && x>z) return x;
		else if(y>z) return y;
		else return z;
	}
}



public class CompileTimePoly_OverLoading {

	public static void main(String[] args) {
		
		FindMaxno findMax= new FindMaxno();
		System.out.println("Max of (10,20) = "+ findMax.max(10, 20));
		System.out.println("Max of (10,20,30) = "+ findMax.max(10, 20, 30));
		
	// HEre no of Argument/Type of arguments decide which method to call
		// i.e. Name is same "max" , but actions are different
	// THis is called Polymorphism
	//NOTE: Compiler - will decide which method to call at compile time
		// Its called Compile Time Polymorphism
		
		
	}

}
