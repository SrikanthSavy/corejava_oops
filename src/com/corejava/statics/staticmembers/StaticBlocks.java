  package com.corejava.statics.staticmembers;


class Test
{
	static {
		System.out.println("Static Block1");
	}
	static {
		System.out.println("Static Block2");
	}
	
}


public class StaticBlocks {
	static {
		System.out.println("Static Block3");  //O/p: This one only 
	}
	
	public static void main(String[] args) {  // But 1 & 2 Blocks will executive only when we load the inner class Test
		
		new Test();
	}

}

/*
O/p: 
	Block 3
	Block 1
	Block 2
*/