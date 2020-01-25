package org.cts;

public class Details {

	
	public static void main(String[] args) {
	
		D d=new D();
		d.height=1;
		d.length=5;
		
		d.width=5;
		
		d.volume(3, 2, 1);
		System.out.println(d.volume);
	}
	
	
}
