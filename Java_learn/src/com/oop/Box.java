package com.oop;

public class Box {
	
	private int width;
	private int height;
	
	Box(int width, int height){
		this.width=width;
		this.height=height;
	}
	
	Box(Box b){
		this.width=b.width;
		this.height=b.height;
	}
	
	
	boolean isEqual(Box b){
		if(this.width==b.width && this.height==b.height){
			return true;
		}else{
			return false;
		}
		
	}
	
	Box duplicate(){
		Box tmp = new Box(this);
		return tmp;
	}
	
	int getWidth(){
		return this.width;
	}
	
	int getHeight(){
		return this.height;
	}
	
	static boolean isTwoObjectsEqual(Box b1, Box b2){
		if(b1.width==b2.width && b1.height==b2.height){
			return true;
		}else{
			return false;
		}
	}
	
}
