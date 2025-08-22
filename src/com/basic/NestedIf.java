package com.basic;

public class NestedIf {
	
	public static void main(String[] args) {
		
		
		int a = 152;
		int b =147;
		int c =47;
		
		
		if(a>b) {
			
			if(a>c) {
				
				System.out.println("A is greater");
				
				
			}else {
				
				System.out.println("C is greater");
				
			}
		}else {
			
			if(b>c) {
				
				System.out.println("B is greater");
				
			}else {
				
				System.out.println("c is greater");
				
			}
		}
	}

}
