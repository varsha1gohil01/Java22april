package com.basic;

public class ElseIfLader {
	public static void main(String[] args) {
	
		
		/*
		 * logical operatord AND &&, OR || NOT !(! is call unary operator)
		 * 
		 * */
		
		int a = 152;
		int b =147;
		int c =47;
		
		if(a>b && a>c) {
			
			System.out.println("A is greater");
			
		}else if(b>a && b>c) {
			
			System.out.println("A is greater");
			
		}else {
			
			System.out.println("C is greater");
		}
	}

}
