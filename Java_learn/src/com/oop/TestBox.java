package com.oop;

public class TestBox {

	public static void main(String[] args) {
		
		Box b1 = new Box(20,20);
		Box b2 = new Box(10,20);
		Box b3 = new Box(b1);
		
		Box b4 = b2.duplicate();
		
		
		System.out.println("B4 width is " +b4.getWidth() + " b4 height is " + b4.getHeight());

		if(b1.isEqual(b2)){
			System.out.println("b1 and b2 are equal");
		}else{
			System.out.println("b1 and b2 are not equal");
		}
	
		if(Box.isTwoObjectsEqual(b1, b3)){
			System.out.println("b1 and b3 are equal");
		}else{
			System.out.println("b1 and b3 are not equal");
		}
	
	}
	
		

}
