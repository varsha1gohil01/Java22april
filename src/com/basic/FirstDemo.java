package com.basic;

public class FirstDemo {
	public static void main(String[] args) {
		
		int i1 = 2147483647; // 4 bytes
		long l1 = 8484584546561L; // 8 bytes
		float f1 = 8545.6767f; // 4 bytes
		double d1 = 984595.5656; // 8 bytes
		char ch = 'd'; // 2 bytes
		boolean bb = true; // 1 bit
		byte b1 = 127; // 1 byte
		
		
		System.out.println("Integer value:" + i1);
		System.out.println("long value:" + l1);
		System.out.println("float value:" + f1);
		System.out.println("double value:" + d1);
		System.out.println("character value:" + ch);
		System.out.println("boolean value:" + bb);
		System.out.println("byte value:" + b1);
		
		
		System.out.println("Size of Integer is: " + Integer.BYTES + " bytes");
		System.out.println("Size of Long is: " + Long.BYTES + " bytes");
		System.out.println("Size of Float is: " + Float.BYTES + " bytes");
		System.out.println("Size of Double is: " + Double.BYTES + " bytes");
		System.out.println("Size of Char is: " + Character.BYTES + " bytes");
		System.out.println("Size of byte is: " + Byte.BYTES + " bytes");
		System.out.println();
		
	}
	

}
